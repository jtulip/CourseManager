package coursemanager;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import coursemanager.student.*;
import coursemanager.subject.*;
import coursemanager.lecturer.*;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DerbyTestGUI {

    private JFrame frame;
    private JPanel cards;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DerbyTestGUI window = new DerbyTestGUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public DerbyTestGUI() {
        initialize();

        JPanel mainPanel = new HomePanel();
        JPanel addStudentPanel = new AddStudentPanel();
        JPanel editStudentPanel = new EditStudentPanel();
        JPanel deleteStudentPanel = new DeleteStudentPanel();
        
        JPanel addSubjectPanel = new AddSubjectPanel();
        JPanel editSubjectPanel = new EditSubjectPanel();
        JPanel deleteSubjectPanel = new DeleteSubjectPanel();
        
        JPanel addLecturerPanel = new AddLecturerPanel();
        JPanel editLecturerPanel = new EditLecturerPanel();
        JPanel deleteLecturerPanel = new DeleteLecturerPanel();
       
        cards = new JPanel(new CardLayout());
        cards.add(mainPanel, "Home");
        cards.add(addStudentPanel, "Add Student");
        cards.add(editStudentPanel, "Edit Student");
        cards.add(deleteStudentPanel, "Delete Student");

        cards.add(addSubjectPanel, "Add Subject");
        cards.add(editSubjectPanel, "Edit Subject");
        cards.add(deleteSubjectPanel, "Delete Subject");

        cards.add(addLecturerPanel, "Add Lecturer");
        cards.add(editLecturerPanel, "Edit Lecturer");
        cards.add(deleteLecturerPanel, "Delete Lecturer");

        Container pane = frame.getContentPane();
        pane.add(cards, null);
    }

    public void setVisible(boolean state) {
        this.frame.setVisible(state);
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 750, 615);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu mnHome = new JMenu("Home");
        menuBar.add(mnHome);

        addMenuItem(mnHome, "Home");
        JMenuItem mntmExit = new JMenuItem("Exit");
        mntmExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("GUI exiting");
                frame.setVisible(false);
                frame.dispose();
            }
        });
        mnHome.add(mntmExit);

        
        // create Student CRUD menu items
        JMenu mnStudent = new JMenu("Students");
        menuBar.add(mnStudent);

        addMenuItem(mnStudent, "Add Student");
        addMenuItem(mnStudent, "Edit Student");
        addMenuItem(mnStudent, "Delete Student");

        
        // create Subject CRUD menu items
        JMenu mnSubjects = new JMenu("Subjects");
        menuBar.add(mnSubjects);

        addMenuItem(mnSubjects, "Add Subject");
        addMenuItem(mnSubjects, "Edit Subject");
        addMenuItem(mnSubjects, "Delete Subject");


        // create Subject CRUD menu items
        JMenu mnLecturers = new JMenu("Lecturers");
        menuBar.add(mnLecturers);

        addMenuItem(mnLecturers, "Add Lecturer");
        addMenuItem(mnLecturers, "Edit Lecturer");
        addMenuItem(mnLecturers, "Delete Lecturer");

        // create Marking CRUD menu items
        JMenu mnMarking = new JMenu("Marking");
        menuBar.add(mnMarking);

        addMenuItem(mnMarking, "Edit Student Marks");
    }

    private void addMenuItem(JMenu menu, final String identifier) {
        JMenuItem mnItem = new JMenuItem(identifier);
        mnItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println(identifier +" selected");
                CardLayout cl = (CardLayout) (cards.getLayout());
                cl.show(cards, identifier);
            }
        });
        menu.add(mnItem);
    }
    
}
