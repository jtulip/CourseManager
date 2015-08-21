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

public class DeleteSubjectPanel extends JPanel {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JTextField subjectCodeField;

    /**
     * Create the panel.
     */
    public DeleteSubjectPanel() {
        setBackground(SystemColor.controlHighlight);
        setBorder(new TitledBorder(null, "Delete Subject", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        this.setBounds(100, 100, 750, 550);
        setLayout(null);

        JLabel subjectCodeLabel = new JLabel("Subject Code:");
        subjectCodeLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        subjectCodeLabel.setBounds(22, 28, 125, 20);
        add(subjectCodeLabel);

        subjectCodeField = new JTextField();
        subjectCodeField.setFont(new Font("Tahoma", Font.PLAIN, 14));
        subjectCodeField.setBounds(157, 27, 126, 22);
        add(subjectCodeField);
        subjectCodeField.setColumns(10);

        JButton deleteSubjectButton = new JButton("Delete");
        deleteSubjectButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        deleteSubjectButton.setBounds(157, 85, 126, 33);
        add(deleteSubjectButton);
        
        JLabel errorMesgLabel = new JLabel("Error Message");
        errorMesgLabel.setForeground(Color.RED);
        errorMesgLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        errorMesgLabel.setBounds(22, 519, 631, 20);
        add(errorMesgLabel);
    }
}
