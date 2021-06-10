package org.emp.gl.testtp;

import java.beans.PropertyChangeEvent;

public class EnvironmentRadar  {


    Environment environment;

    EnvironmentRadar(Environment env){
        environment = env;
    }

    void notifyPlayer(int condition){

        // environment.addListener(robot);
        
        int possibleRoutes = environment.getRoutes();

        // System.out.println(possibleRoutes);
        // PropertyChangeEvent evt = new PropertyChangeEvent();

        
        // System.out.println(environment.PCS.getPropertyChangeListeners("Move"));

        if(possibleRoutes ==  environment.context.getStrategy().recommendAction() )
        environment.PCS.firePropertyChange(
            "Move",             
            -1,
            possibleRoutes
        );
        else   
        environment.PCS.firePropertyChange(
            "Move",             //all the magic is here..
            possibleRoutes &  environment.context.getStrategy().recommendAction(),
            possibleRoutes
        );  



        System.out.println("notifying " + possibleRoutes);
        
    }




    






}

