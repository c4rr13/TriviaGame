/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.view;

import java.util.Scanner;

/**
 *
 * @author carri_000
 */
  public abstract class View implements ViewInterface {
      private String promptMessage;
      
      public View(String promptMessage) {
          this.promptMessage = promptMessage;
      }
      
      @Override
      public void display() {
          String value;
          do {
              
              System.out.println(this.promptMessage);
              value = this.getInput();
              this.doAction(value);
              
          } while (!value.equals("0"));
      }
      @Override
       public String getInput() {
        boolean valid = false;
        String selection = null;
        Scanner keyboard = new Scanner(System.in); //Keyboard input stream
        
        while(!valid) { //while a valid name has not been recieved 
            
          
            System.out.println("Enter tyour selection below:");
            
            
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            
            if (selection.length() < 1) {
                System.out.println("Invalid name - the name must not be blank");
                continue; 
            }
            break; 
            
        }
       
          return selection;
       }
       
       public String promptMessage() {
           return promptMessage;
       }
       public void setPromptMessage(String message) {
           this.promptMessage = message;
       }
  }
         
       
       
       