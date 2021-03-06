package com.mycompany.secondbundle;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {

    private JLabel nameLabel;
    private JLabel occupationLabel;
    private JTextField nameField;
    private JTextField occupationField;
    private JButton okBtn;
    private FormListener formListener;
    private JList ageList;
            
    public FormPanel() {
        Dimension dimension = getPreferredSize();
        dimension.width = 250;                               
        setPreferredSize(dimension);

        nameLabel = new JLabel("Name: ");
        occupationLabel = new JLabel("Ocupation: ");
        nameField = new JTextField(10);
        occupationField = new JTextField(10);
        ageList=new JList();
        
        DefaultListModel ageModel=new DefaultListModel();
        ageModel.addElement(new AgeCategory(0,"under 18"));
        ageModel.addElement(new AgeCategory(1,"18 to 65"));
        ageModel.addElement(new AgeCategory(2,"65 and over"));
        ageList.setModel(ageModel);
        
        ageList.setPreferredSize(new Dimension(110, 67));
        ageList.setBorder(BorderFactory.createEtchedBorder());
        ageList.setSelectedIndex(1);
        
        okBtn = new JButton("OK");
        
        okBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 String name=nameField.getText();
                 String occupation=occupationField.getText();
                 AgeCategory ageCat=(AgeCategory)ageList.getSelectedValue();
                 int ageCatId=ageCat.getId();
                 
                 FormEvent ev=new FormEvent(this, name, occupation, ageCatId);
                 
                 if(formListener!=null){
                     formListener.formEventOccured(ev);
                 }
            }
        });
        
        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();


        //FIRST ROW
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0, 0, 0, 5);
        add(nameLabel, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(nameField, gc);

        //SECOND ROW
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.gridy = 1;
        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(occupationLabel, gc);

        gc.gridy = 1;
        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(occupationField, gc);

        //Third ROW
        gc.weightx = 1;
        gc.weighty = 2;
        
        gc.gridy = 2;
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(ageList, gc);
        
        //Fourth ROW
        gc.weightx = 1;
        gc.weighty = 2;
        
        gc.gridy = 3;
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(okBtn, gc);


    }

    void setFormListener(FormListener formListener) {
        this.formListener=formListener;
    }
}

class AgeCategory{
    private String text;
    private int id;
    public AgeCategory(int id, String text){
        this.id=id;
        this.text=text; 
    }
    
    public String toString(){
        return text;
    }
    
    public int getId(){
        return id;
    }
}