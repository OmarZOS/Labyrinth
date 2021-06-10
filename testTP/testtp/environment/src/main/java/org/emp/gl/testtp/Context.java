package org.emp.gl.testtp;



public class Context{
    
    boolean rightClicked = false;
    boolean downClicked = false;
    boolean upClicked = false;
    boolean leftClicked = false;

    Environment environment;

    Context(Environment instance){
        environment = instance;
    }

    Strategy getStrategy(){
        
        

        if (rightClicked) {
            resetBooleans();
            return new RightyStrategy();
        }
        if (downClicked) {
            resetBooleans();
            return new DownwardStrategy();
        }
        if (upClicked) {
            resetBooleans();
            return new UpperStrategy();
        }
        if (leftClicked) {
            resetBooleans();
            return new LeftyStrategy();
        }

        return new IdleStrategy();
        
    }

    void resetBooleans(){
        rightClicked = false;
        downClicked = false;
        upClicked = false;
        leftClicked = false;
    }

    int getRoutes(){
        int route = 0;

        route+=(environment.robot.x==9)?0:((environment.grille[environment.robot.x+1][environment.robot.y]==0)?0:1);
        route+=(environment.robot.y==9)?0:((environment.grille[environment.robot.x][environment.robot.y+1]==0)?0:2);
        route+=(environment.robot.x==0)?0:((environment.grille[environment.robot.x-1][environment.robot.y]==0)?0:4);
        route+=(environment.robot.y==0)?0:((environment.grille[environment.robot.x][environment.robot.y-1]==0)?0:8);

        return route;
    }


}