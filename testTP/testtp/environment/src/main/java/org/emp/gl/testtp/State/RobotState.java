/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.testtp.State;

import org.emp.gl.testtp.Robot;

/**
 *
 * @author PointDZ
 */
public abstract class RobotState {
    
    Robot robot;
    RobotState(Robot robott){
        robot = robott;
        System.out.println("changed State");
    }

    public void goUp(int k){}
    public void goDown(int k){}
    public void goRight(int k){}
    public void goLeft(int k){}
    
    // public void handleDirection(int k){}

    
}
