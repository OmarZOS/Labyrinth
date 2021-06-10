package org.emp.gl.testtp;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Hello world!
 *
 */
public class Environment 
extends TimerTask
implements  ControlListener 
{




    int[][]  grille  = {
        {1,1,1,1,1,1,1,1,1,1}, 
        {1,1,1,1,1,1,1,1,1,1}, 
        {1,1,1,1,1,1,1,0,1,1}, 
        {1,1,1,1,0,1,1,1,1,1}, 
        {1,1,1,1,1,1,1,0,1,1}, 
        {1,1,1,1,1,1,1,0,1,1}, 
        {1,1,1,1,1,1,1,1,1,1}, 
        {1,1,1,1,1,1,1,0,1,1}, 
        {1,1,1,1,1,1,1,1,1,1}, 
        {1,1,1,1,1,1,1,1,1,1}, 
    };
    
    EnvironmentRadar environmentRadar = new EnvironmentRadar(this);

    public PropertyChangeSupport PCS = new PropertyChangeSupport(this);

    Robot robot = new Robot();
    
    Context context = new Context(this);

    public Environment() {


        

        // System.out.println(PCS.getPropertyChangeListeners());

        // PCS.firePropertyChange("Move", 0, 0);

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(this,0, 1000);
        
    }
    
    
    @Override
    public void run() {
        timeChanged();
    }

    
    
    

    public void addListener(PropertyChangeListener pl) {
        //listeners.add(pl);
        PCS.addPropertyChangeListener(pl);
        
    }

    public void removeListener(PropertyChangeListener pl) {
        //listeners.remove(pl);
        PCS.removePropertyChangeListener((PropertyChangeListener) pl);
    }
    
    
    @Override
    public void goUp(){
        context.upClicked=true;
    }
    
    @Override
    public void goLeft(){
        context.leftClicked=true;
    }
    
    @Override
    public void goRight(){
        context.rightClicked=true;
    }
    
    @Override
    public void goDown(){
        context.downClicked=true;
    }
    
    private void timeChanged() {
        
        addListener(robot);

        // System.out.println("move it");
        
        // PCS.firePropertyChange("Move",0,0);

        environmentRadar.notifyPlayer(
                context.getStrategy().recommendAction() 
        );
                
        // System.out.println("");
    
    }
    
    public int getRoutes(){
        return context.getRoutes();
    }


    @Override
    public void propertyChange(PropertyChangeEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("received");
        switch(arg0.getPropertyName()){
            case "UP":
                context.upClicked=true;    
                break;
            case "DOWN":
                context.downClicked=true;
                break;
            case "RIGHT":
                context.rightClicked=true;
                break;
            case "LEFT":
                context.leftClicked=true;
                break;
        }

        
    }
    
    
}


