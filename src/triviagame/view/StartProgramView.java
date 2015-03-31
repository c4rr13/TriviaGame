/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.view;

import java.io.BufferedReader;
import java.util.Scanner;
import triviagame.control.ProgramControl;
import triviagame.model.Player;
import java.io.PrintWriter; 
import pkg80striviagame.TriviaGame;
import triviagame.view.ErrorView;

/**
 *
 * @author carri_000
 * @author whitbillman
 */

public abstract class StartProgramView implements ViewInterface {  private String promptMessage;
      
      protected final BufferedReader keyboard = TriviaGame.getInFile();
      protected final PrintWriter console = TriviaGame.getOutFile();
      
      public StartProgramView(String promptMessage) {
          this.promptMessage = promptMessage;
      

      }
  

public StartProgramView() {
        
        }
public void startProgram() {
    
    //Display the Banner screen
    this.displayBanner();
    
    //Prompt the player to enter their name Retreive the name of player
    String playersName = this.getPlayersName();
    
    //Create and save player object
    Player player = ProgramControl.createPlayer(playersName);
    //Display a personalized welcome message
    this.displayWelcomeMessage(player);
    
    //Display the Menu
    MainMenuView mainMenuView = new MainMenuView();
    mainMenuView.display();
}

    private void displayBanner() {
        this.console.println("n/n***************************************");
        
        this.console.println("*                                                                *"
                + "\n* Welcome to 80's Music Trivia Game!                                    *");
        this.console.println("*                                                                *"
                + "\n* in this game you will be asked a series of questions about 80's music *"
                + "\n* Make your way through 3 levels to be the Ulimate 80's Music Fan       *"
                + "\n* The three levels are 80's Country, 80's Pop, and 80's Rock            *");
        this.console.println("*                                                                *"
                + "\n* Good Luck and enjoy the game!                                         *"
                + "\n*                                                                       *");
        this.console.println("******************************************************************");
        
    }

    private String getPlayersName() {
        boolean valid = false; // indicates if the name has been recieved
        String playersName = null;
        try {
            //while a valid name has not been recieved 
            while(!valid) { 
            
            //get the name from the keyboard and trim off the blanks
            playersName = this.keyboard.readLine();
            playersName = playersName.trim();
            
            // if the name is invalid (less than two character in length))
            if (playersName.length() < 2) {
                ErrorView.display(this.getClass().getName(),
                       "Invalid name - the name must not be blank" );
                continue; //and repeat again
            }
            break; // out of the (exit) the repetition
            
        }
    } catch (Exception e) {
        ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
    }
        return playersName; //return the name
    }

    private void displayWelcomeMessage(Player player) {
        this.console.println("\n\n================================================");
        this.console.println("\tWelcome to the game " + player.getName());
        this.console.println("\tWe hope you have a lot of fun!");
        this.console.println("====================================================");
        
                
    }
}