/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg80striviagame;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import triviagame.model.Player;
import triviagame.model.Game;
import triviagame.view.ErrorView;
import triviagame.view.StartProgramView;



/**
 *
 * @author whitbillman
 */
public class TriviaGame {
   
    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
   
    public static void main(String[] args) {
        
        try {
            //open character stream files for end user input and output
            TriviaGame.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            
            TriviaGame.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            TriviaGame.logFile = new PrintWriter(filePath);
            
            //create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView() {

                @Override
                public void display() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public String getInput() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public boolean doAction(Object obj) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
        startProgramView.startProgram();
        
        } catch (Throwable e) {
        //   ErrorView.display(this.getClass().getName(), 
                        //        "Exception: " + e.toString() +
                        //        "\nCause: " + e.getCause() +
                        //        "\nMessage: " + e.getMessage());
            
          e.printStackTrace();;
           
       }
        
       finally {
           try {
                if (TriviaGame.inFile != null)
                    TriviaGame.inFile.close();
                
                if (TriviaGame.outFile != null)
                    TriviaGame.outFile.close();
                
                if (TriviaGame.logFile != null)
                    TriviaGame.logFile.close();
                
            } catch (IOException ex) {
            //   ErrorView.display(this.getClass().getName(),
             //           "Error closing files");
                return;
            }
        } 
          
    }
  

    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame) {
        TriviaGame.currentGame = currentGame;
    }
    
    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TriviaGame.player = player;
    }
    
    public static PrintWriter getOutFile(){
        return outFile;
    }
    
    public static void setOutFile(PrintWriter outFile) {
        TriviaGame.outFile = outFile;
    }
    
    public static BufferedReader getInFile(){
        return inFile;
    }
    
    public static void setInFile(BufferedReader inFile){
        TriviaGame.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }
          
    public static void setLogFile(PrintWriter logFile) {
        TriviaGame.logFile = logFile;
    }      
        
    }
     
     
    
    
