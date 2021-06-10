package org.emp.gl.testtp;




public class MainClass{
    public static void main(String args[]){

        Environment environment = new Environment();
        KeyBoardController kboardController = new KeyBoardController();
        // SimpleLogger logger = SimpleLogger();
        kboardController.addKeyChangeListener(environment);
        
        // environment.robot.gui=s;
        
        // java.awt.EventQueue.invokeLater(new Runnable() {
        //     public void run() {
        //         // environment.addTimeChangeListener("Log",logger);
        //         GuiImpl s = new GuiImpl();
        //         s.setVisible(true);
        //     }
        // });


    }
    // public static void     Start(){


    //     // GuiImpl s = new GuiImpl();

    //     // Environment environment = new Environment();
    //     // KeyBoardController kboardController = new KeyBoardController();
    //     // SimpleLogger logger = SimpleLogger();
    //     // kboardController.addKeyChangeListener(environment);
    //     // environment.addTimeChangeListener("Log",logger);


    // }


        
        
        
}