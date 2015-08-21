package coursemanager;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SwingConstants;

public class HomePanel extends JPanel {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Create the panel.
     */
    public HomePanel() {
        setBackground(SystemColor.controlHighlight);
        //setBorder(new TitledBorder(null, "Add Student", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        this.setBounds(100, 100, 750, 550);
        setLayout(null);
        
        JLabel errorMesgLabel = new JLabel("Error Message");
        errorMesgLabel.setForeground(Color.RED);
        errorMesgLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        errorMesgLabel.setBounds(22, 519, 631, 20);
        add(errorMesgLabel);
        
        JLabel lblNewLabel = new JLabel("Course Manager");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
        lblNewLabel.setBounds(159, 188, 418, 48);
        add(lblNewLabel);
    }
}
