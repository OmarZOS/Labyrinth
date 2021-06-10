package org.emp.gl.testtp;



import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class GuiImpl extends javax.swing.JFrame {
    
    ArrayList<ArrayList<JRadioButton>> checkBoxes = new  ArrayList<ArrayList<JRadioButton>> ();
    
    GuiImpl(){
        setSize(400, 400);




        for(int i=0;i<10;i++){
            checkBoxes.add(new ArrayList<JRadioButton>());
            for(int j=0;j<10;j++){
                checkBoxes.get(i).add(new JRadioButton());
                checkBoxes.get(i).get(j).setForeground(Color.red);
            }
        }

        initComponents();

    }


    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());





        
        for(int i =0 ;i< 10;i++  ){
            for(int j=0;j<10;j++)
            {
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = i;
                gridBagConstraints.gridy = j;
                gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
                gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
                checkBoxes.get(i).get(j).setBounds(100,100, 50,50); 
                getContentPane().add(checkBoxes.get(i).get(j), gridBagConstraints);
            }
        }
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jScrollPane1, gridBagConstraints);
        pack();
        
        
    }
    
    public void update(int x, int y){
        checkBoxes.get(x).get(y).setSelected(true);
    }
    
    
    
    
    private javax.swing.JScrollPane jScrollPane1;
    
    


}