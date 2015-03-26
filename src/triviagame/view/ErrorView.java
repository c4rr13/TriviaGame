/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.view;

import java.io.PrintWriter;
import pkg80striviagame.TriviaGame;

/**
 *
 * @author whitbillman
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = TriviaGame.getOutFile();
    private static final PrintWriter logFile = TriviaGame.getLogFile();
    static Object display;
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                "---------------------------------------------"
              + "\n- ERROR - " + errorMessage
              + "\n---------------------------------------------");
        
        //log file
        logFile.println(className + " - " + errorMessage);
    }
}
