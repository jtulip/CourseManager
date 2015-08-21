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

public class DeleteLecturerPanel extends JPanel {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JTextField lecturerIdField;

    /**
     * Create the panel.
     */
    public DeleteLecturerPanel() {
        setBackground(SystemColor.controlHighlight);
        setBorder(new TitledBorder(null, "Delete Lecturer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        this.setBounds(100, 100, 750, 550);
        setLayout(null);

        JLabel lecturerIdLabel = new JLabel("Lecturer ID:");
        lecturerIdLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lecturerIdLabel.setBounds(22, 28, 80, 20);
        add(lecturerIdLabel);

        lecturerIdField = new JTextField();
        lecturerIdField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lecturerIdField.setBounds(148, 27, 126, 22);
        add(lecturerIdField);
        lecturerIdField.setColumns(10);

        JButton deleteLecturerButton = new JButton("Delete");
        deleteLecturerButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        deleteLecturerButton.setBounds(148, 90, 126, 33);
        add(deleteLecturerButton);
        
        JLabel errorMesgLabel = new JLabel("Error Message");
        errorMesgLabel.setForeground(Color.RED);
        errorMesgLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        errorMesgLabel.setBounds(22, 519, 631, 20);
        add(errorMesgLabel);
    }
}
