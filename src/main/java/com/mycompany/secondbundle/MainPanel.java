package com.mycompany.secondbundle;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

    private TextPanel textPanel;
    private JButton btn;
    private FormPanel formPanel;
    private Toolbar toolbar;

    public MainPanel() {
        setLayout(new BorderLayout());
        textPanel = new TextPanel();
        formPanel = new FormPanel();
        toolbar=new Toolbar();
        
        toolbar.setStringListener(new StringListener() {
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });
        
        formPanel.setFormListener(new FormListener(){
            public void formEventOccured(FormEvent e){
                String name=e.getName();
                String occupation=e.getOccupation();
                int ageCat=e.getAgeCategory();
                
                textPanel.appendText(name + ": "+occupation+" : "
                        + ageCat+"\n"); 
            }
        });
        
        
        add(formPanel, BorderLayout.WEST);
        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        
    }

}
