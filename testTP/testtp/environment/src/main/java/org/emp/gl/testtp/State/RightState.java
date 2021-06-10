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
public class RightState extends RobotState {

    public RightState(Robot instance){
        super(instance);
        robot.addPositionX(1);
    }

    @Override
    public void goRight(int route){
        if((1 & route )!=0){
            robot.addPositionX(1);
            return;
        }
        if((2 & route )!=0){
            robot.setState(new UpState(robot) );
            return;
        }
        if((8 & route )!=0){
            robot.setState(new DownState(robot) );
            return;
        }
        System.out.println("planté");
        robot.setState(new DownState(robot) );


    }
    // @Override
    // public void handleDirection(int k){
    //     if(k==15){
            
    //     }
    // }

    

    
}
