package org.emp.gl.testtp;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PointDZ
 */
public interface ControlListener extends PropertyChangeListener {
    void goUp();
    void goLeft();
    void goRight();
    void goDown();
    void propertyChange(PropertyChangeEvent ar);
}
