/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.secondbundle;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author astepien1
 */
public interface TimeService {
    public String tabName="Second panel";
    
    public String getCurrentTime();
    public JPanel getPanel();
}
