package org.emp.gl.testtp;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import javax.swing.JFrame;
import javax.swing.JTextField;


class KeyBoardController extends KeyAdapter   {

    PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    @Override
    public void keyPressed(KeyEvent event) {


        System.out.println("Key touched");
    switch ( event.getKeyChar()) {
            case KeyEvent.VK_UP:
                pcs.firePropertyChange("UP",-1,1); 
                break;
            case KeyEvent.VK_DOWN:
            pcs.firePropertyChange("DOWN", -1, 1);
                break;
            case KeyEvent.VK_RIGHT:
            pcs.firePropertyChange("RIGHT", -1, 1);
                break;
            case KeyEvent.VK_LEFT:
            pcs.firePropertyChange("LEFT", -1, 1);
                break;
    }
    }
    
    public void addKeyChangeListener(PropertyChangeListener pl) {
        //listeners.add(pl);
        pcs.addPropertyChangeListener(pl);
    }
    
    
    public void removeKeyChangeListener(PropertyChangeListener pl) {
        //listeners.remove(pl);
        pcs.removePropertyChangeListener(pl);
    }
    
    
    
    
    
}