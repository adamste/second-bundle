package com.mycompany.secondbundle;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public interface TabService {
    public String tabName="Second panel";
    
    public String getCurrentTime();
    public JPanel getPanel();
}
