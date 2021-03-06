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

public class EditStudentPanel extends JPanel {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JTextField studentIdField;
    private JTextField firstNameField;
    private JTextField lastNameField;

    /**
     * Create the panel.
     */
    public EditStudentPanel() {
        setBackground(SystemColor.controlHighlight);
        setBorder(new TitledBorder(null, "Edit Student", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        this.setBounds(100, 100, 750, 550);
        setLayout(null);

        JLabel studentIdLabel = new JLabel("Student ID:");
        studentIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        studentIdLabel.setBounds(22, 28, 80, 20);
        add(studentIdLabel);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lastNameLabel.setBounds(22, 108, 80, 20);
        add(lastNameLabel);

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        firstNameLabel.setBounds(22, 69, 80, 20);
        add(firstNameLabel);

        studentIdField = new JTextField();
        studentIdField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        studentIdField.setBounds(101, 28, 126, 22);
        add(studentIdField);
        studentIdField.setColumns(10);

        firstNameField = new JTextField();
        firstNameField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        firstNameField.setColumns(10);
        firstNameField.setBounds(101, 69, 207, 22);
        add(firstNameField);

        lastNameField = new JTextField();
        lastNameField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lastNameField.setColumns(10);
        lastNameField.setBounds(101, 108, 207, 22);
        add(lastNameField);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setBounds(101, 168, 126, 20);
        add(comboBox);

        JLabel coursesLabel = new JLabel("Courses:");
        coursesLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        coursesLabel.setBounds(22, 166, 80, 20);
        add(coursesLabel);

        JButton updateStudentButton = new JButton("Update");
        updateStudentButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        updateStudentButton.setBounds(64, 228, 126, 33);
        add(updateStudentButton);
        
        JLabel errorMesgLabel = new JLabel("Error Message");
        errorMesgLabel.setForeground(Color.RED);
        errorMesgLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        errorMesgLabel.setBounds(22, 519, 631, 20);
        add(errorMesgLabel);
    }
}
