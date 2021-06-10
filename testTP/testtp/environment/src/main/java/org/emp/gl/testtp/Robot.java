/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.testtp;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.emp.gl.testtp.State.LeftState;
import org.emp.gl.testtp.State.RightState;
import org.emp.gl.testtp.State.RobotState;

/**
 *
 * @author PointDZ
 */
public class Robot implements PropertyChangeListener{

    int x,y;
    RobotState state;

    GuiImpl gui;


    public Robot(){
        x=5;
        y=5;
        state = new RightState(this);
    }

    public void addPositionX(int z){
        x+=z;
    }
    public void addPositionY(int z){
        y+=z;
    }

    public void setState(RobotState robotState){
        state = robotState;
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Changed ");
        System.out.println(x+" "+y+ " : "+evt.getNewValue());
        if(Integer.parseInt(evt.getOldValue().toString())==-1)
        switch (Integer.parseInt(evt.getNewValue().toString())) {
            case 1:
            System.out.println(1);
                state.goRight(Integer.parseInt(evt.getNewValue().toString()));
                break;
            case 2:
            System.out.println(2);
                state.goUp(Integer.parseInt(evt.getNewValue().toString()));
                break;
            case 4:
            System.out.println(4);
                state.goLeft(Integer.parseInt(evt.getNewValue().toString()));
                break;
            case 8:
            System.out.println(8);
                state.goDown(Integer.parseInt(evt.getNewValue().toString()));
                break;
            default:
            System.out.println(evt.getNewValue().toString());
                state.goRight(Integer.parseInt(evt.getNewValue().toString()));
                break;
        }
        else{
            state.goLeft(Integer.parseInt(evt.getNewValue().toString()));   
        }

    }




    
}
