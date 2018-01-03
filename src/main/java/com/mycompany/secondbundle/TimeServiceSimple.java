/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.secondbundle;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author astepien1
 */
public class TimeServiceSimple implements TimeService{

    public String getCurrentTime() {
        return "21.12.2017";
    }

    public JPanel getPanel() {
        JPanel panel=new JPanel();
        JLabel label=new JLabel("second bundle");
        panel.add(label);
        return panel;
    }
     /*
        secondPanel = new JPanel();
        secondLabel = new JLabel("Second");
        secondPanel.add(secondLabel);
        tabbedPane.add("Second panel", secondPanel);
        */
}
