package com.mycompany.secondbundle;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

    private TextPanel textPanel;
    private JButton btn;
    private FormPanel formPanel;

    public MainPanel() {
        setLayout(new BorderLayout());
        textPanel = new TextPanel();
        formPanel = new FormPanel();
        
        add(formPanel, BorderLayout.WEST);
        add(textPanel, BorderLayout.CENTER);
        
    }

}
