package derbytest;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static String dbName = "CourseManager";
    private static String connectionURL = "jdbc:derby:" + dbName + ";";

    private static String createTableString = " CREATE TABLE STUDENT"
            + " (STUDENT_ID INT NOT NULL CONSTRAINT STUDENT_PK PRIMARY KEY," + " FIRST_NAME VARCHAR(32) NOT NULL, "
            + " LAST_NAME VARCHAR(32) NOT NULL) ";

    public static void main(String[] args) {

        try (Connection conn = getValidDBConnection();) {

            // start the GUI
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        DerbyTestGUI window = new DerbyTestGUI();
                        window.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            
            // shut down derby (only for embedded mode)
            try {
                DriverManager.getConnection("jdbc:derby:;shutdown=true");
            } catch (SQLException sqle) {
                if (!sqle.getSQLState().equals("XJ015")) {
                    System.err.println("DB did not shutdown normally");
                } else {
                    System.out.println("DB shutdown normally");
                }
            }
        }
        catch (Throwable e) {
          System.out.println(". . . Exception thrown:" + e);
          e.printStackTrace();
        }
    }

    private static Connection getValidDBConnection() throws SQLException {
        // try connecting to existing DB
        Connection conn = connectToExistingDB(connectionURL);

        // if that doesn't work, create the database
        if (conn == null) {
            System.out.println(dbName + " does not exist, creating ...");
            conn = DriverManager.getConnection(connectionURL + "create=true");
        }
        System.out.println("Connected to database: " + dbName);

        // check for valid table
        try (Statement s = conn.createStatement();) {
            if (!chk4Table(conn)) {
                // and set it up if it doesn't exit
                s.execute(createTableString);
            }
        }
        return conn;
    }

    private static Connection connectToExistingDB(String connectionURL) throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(connectionURL);
            System.out.println("DB exists: " + connectionURL);
        } catch (SQLException sqle) {
            String err = sqle.getSQLState();
            System.err.println("connectToExistingDB: caught exception: " + err + "\n" + sqle);
        }
        return conn;
    }

    private static boolean chk4Table(Connection conn) throws SQLException {
        try {
            Statement s = conn.createStatement();
            s.execute("UPDATE STUDENT " + "SET FIRST_NAME= 'FRED', " + "LAST_NAME = 'NURKE' " + "WHERE 1=3");
        } catch (SQLException sqle) {
            String err = sqle.getSQLState();
            if (err.equals("42X05")) { // table does not exist
                return false;
            } else if (err.equals("42X14") || err.equals("442821")) { // incorrect
                                                                      // table
                                                                      // definition
                System.err.println("chk4db: Incorrect table definition");
                throw sqle;
            } else {
                System.err.println("chk4db: Unhandled SQLException");
                throw sqle;
            }
        }
        return true;
    }

}
