/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import pkg80striviagame.TriviaGame;

/**
 *
 * @author whitbillman 
 */
  public abstract class View implements ViewInterface {
      private String promptMessage;
      
      protected final BufferedReader keyboard = TriviaGame.getInFile();
      protected final PrintWriter console = TriviaGame.getOutFile();
      
      public View(String promptMessage) {
          this.promptMessage = promptMessage;
      }
      
      
      public void display() {
          String value;
          boolean done = false;
          
          do {
              
              this.console.println(this.promptMessage);
              value = this.getInput();
              this.doAction(value);
              
          } while (!done);
      }
      
      @Override
       public String getInput() {
        boolean valid = false;
        String selection = null;
        try {
            //while a valid name has not been recieved 
            while(!valid) { 
            
            //get the value entered from the keyboard
            selection = keyboard.readLine();
            selection = selection.trim();
            
            
            if (selection.length() < 1) {
                ErrorView.display(this.getClass().getName(), 
                                "Invalid name - the name must not be blank");
                continue; 
            }
            break; 
          }  
      } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                             "Error reading input: " + e.getMessage());
      }
       
          return selection; //return the name
}
       
       public String promptMessage() {
           return promptMessage;
       }
       public void setPromptMessage(String message) {
           this.promptMessage = message;
       }
  }
         
       
       
       