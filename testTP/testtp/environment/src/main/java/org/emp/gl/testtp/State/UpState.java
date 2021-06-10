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
public class UpState extends RobotState {

    public UpState(Robot instance){
        super(instance);
        robot.addPositionY(1);
    }


    @Override
    public void goUp(int route){
        if((2 & route )!=0){
            robot.addPositionY(1);
            return;
        }
        if((4 & route )!=0){
            robot.setState((RobotState)new LeftState(robot) );
            return;
        }
        if((1 & route )!=0){
            robot.setState(new RightState(robot) );
            return;
        }

    }
    


}
