package coursemanager.subject;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;

public class AddSubjectPanel extends JPanel {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JTextField subjectCodeField;
    private JTextField subjectNameField;

    /**
     * Create the panel.
     */
    public AddSubjectPanel() {
        setBackground(SystemColor.controlHighlight);
        setBorder(new TitledBorder(null, "Add Subject", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        this.setBounds(100, 100, 750, 550);
        setLayout(null);

        JLabel subjectCodeLabel = new JLabel("Subject Code:");
        subjectCodeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        subjectCodeLabel.setBounds(22, 28, 125, 20);
        add(subjectCodeLabel);

        JLabel subjectNameLabel = new JLabel("Subject Name:");
        subjectNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        subjectNameLabel.setBounds(22, 69, 125, 20);
        add(subjectNameLabel);

        subjectCodeField = new JTextField();
        subjectCodeField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        subjectCodeField.setBounds(157, 27, 126, 22);
        add(subjectCodeField);
        subjectCodeField.setColumns(10);

        subjectNameField = new JTextField();
        subjectNameField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        subjectNameField.setColumns(10);
        subjectNameField.setBounds(156, 68, 207, 22);
        add(subjectNameField);

        JComboBox<String> studentComboBox = new JComboBox<>();
        studentComboBox.setBounds(157, 157, 126, 20);
        add(studentComboBox);

        JLabel studentsLabel = new JLabel("Students:");
        studentsLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        studentsLabel.setBounds(22, 155, 80, 20);
        add(studentsLabel);

        JButton createSubjectButton = new JButton("Create");
        createSubjectButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        createSubjectButton.setBounds(157, 220, 126, 33);
        add(createSubjectButton);
        
        JLabel lecturerLabel = new JLabel("Lecturer:");
        lecturerLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lecturerLabel.setBounds(22, 111, 125, 20);
        add(lecturerLabel);
        
        JComboBox<String> lecturerComboBox = new JComboBox<String>();
        lecturerComboBox.setBounds(157, 113, 126, 20);
        add(lecturerComboBox);
        
        JLabel errorMesgLabel = new JLabel("Error Message");
        errorMesgLabel.setForeground(Color.RED);
        errorMesgLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        errorMesgLabel.setBounds(22, 519, 631, 20);
        add(errorMesgLabel);
    }
}
