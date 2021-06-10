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
public class LeftState extends RobotState {
    public LeftState(Robot instance){
        super(instance);
        robot.addPositionX(-1);
    }

    public void LeftRight(int route){
        if((4 & route )!=0){
            robot.addPositionX(-1);
            return;
        }
        if((8 & route )!=0){
            robot.setState(new DownState(robot) );
            return;
        }
        if((2 & route )!=0){
            robot.setState(new UpState(robot) );
            return;
        }

    }


}
