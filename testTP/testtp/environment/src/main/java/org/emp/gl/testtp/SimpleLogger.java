package org.emp.gl.testtp;



import org.emp.gl.testtp.Logger;


public class SimpleLogger implements Logger{


    @Override
    public void print(String str){
        System.out.print(str);
    }
    @Override
    public void println(String str){
        System.out.println(str);

    }

}