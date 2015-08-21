package coursemanager.lecturer;


import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;

public class AddLecturerPanel extends JPanel {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JTextField lecturerIdField;
    private JTextField firstNameField;
    private JTextField lastNameField;

    /**
     * Create the panel.
     */
    public AddLecturerPanel() {
        setBackground(SystemColor.controlHighlight);
        setBorder(new TitledBorder(null, "Add Lecturer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        this.setBounds(100, 100, 750, 550);
        setLayout(null);

        JLabel lecturerIdLabel = new JLabel("Lecturer ID:");
        lecturerIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lecturerIdLabel.setBounds(22, 28, 80, 20);
        add(lecturerIdLabel);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lastNameLabel.setBounds(22, 108, 80, 20);
        add(lastNameLabel);

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        firstNameLabel.setBounds(22, 69, 80, 20);
        add(firstNameLabel);

        lecturerIdField = new JTextField();
        lecturerIdField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lecturerIdField.setBounds(148, 27, 126, 22);
        add(lecturerIdField);
        lecturerIdField.setColumns(10);

        firstNameField = new JTextField();
        firstNameField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        firstNameField.setColumns(10);
        firstNameField.setBounds(148, 68, 207, 22);
        add(firstNameField);

        lastNameField = new JTextField();
        lastNameField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lastNameField.setColumns(10);
        lastNameField.setBounds(148, 107, 207, 22);
        add(lastNameField);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setBounds(148, 168, 126, 20);
        add(comboBox);

        JLabel coursesLabel = new JLabel("Courses:");
        coursesLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        coursesLabel.setBounds(22, 166, 80, 20);
        add(coursesLabel);

        JButton createLecturerButton = new JButton("Create");
        createLecturerButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        createLecturerButton.setBounds(148, 228, 126, 33);
        add(createLecturerButton);
        
        JLabel errorMesgLabel = new JLabel("Error Message");
        errorMesgLabel.setForeground(Color.RED);
        errorMesgLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        errorMesgLabel.setBounds(22, 519, 631, 20);
        add(errorMesgLabel);
    }
}
