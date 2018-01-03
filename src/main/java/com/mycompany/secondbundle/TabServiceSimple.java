package com.mycompany.secondbundle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JPanel;

public class TabServiceSimple implements TabService {

    public String getCurrentTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        return dateFormat.format(cal.getTime()+"\n");
    }

    public JPanel getPanel() {
        return new MainPanel();
    }
}
