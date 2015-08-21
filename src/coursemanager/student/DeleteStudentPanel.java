package coursemanager.student;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;

public class DeleteStudentPanel extends JPanel {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JTextField studentIdField;

    /**
     * Create the panel.
     */
    public DeleteStudentPanel() {
        setBackground(SystemColor.controlHighlight);
        setBorder(new TitledBorder(null, "Delete Student", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        this.setBounds(100, 100, 750, 550);
        setLayout(null);

        JLabel studentIdLabel = new JLabel("Student ID:");
        studentIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        studentIdLabel.setBounds(22, 28, 80, 20);
        add(studentIdLabel);

        studentIdField = new JTextField();
        studentIdField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        studentIdField.setBounds(101, 28, 126, 22);
        add(studentIdField);
        studentIdField.setColumns(10);

        JButton deleteStudentButton = new JButton("Delete");
        deleteStudentButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        deleteStudentButton.setBounds(101, 82, 126, 33);
        add(deleteStudentButton);
        
        JLabel errorMesgLabel = new JLabel("Error Message");
        errorMesgLabel.setForeground(Color.RED);
        errorMesgLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        errorMesgLabel.setBounds(22, 519, 631, 20);
        add(errorMesgLabel);
    }
}
