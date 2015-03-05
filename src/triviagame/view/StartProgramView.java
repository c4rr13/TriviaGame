/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.view;

import java.util.Scanner;
import triviagame.control.ProgramControl;
import triviagame.model.Player;

/**
 *
 * @author carri_000
 */
public class StartProgramView {
    

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

}

    private void displayBanner() {
        System.out.println("n/n***************************************");
        
        System.out.println("*                                                                *"
                + "\n* Welcome to 80's Music Trivia Game!                                    *");
        System.out.println("*                                                                *"
                + "\n* in this game you will be asked a series of questions about 80's music *"
                + "\n* Make your way through 3 levels to be the Ulimate 80's Music Fan       *"
                + "\n* The three levels are 80's Country, 80's Pop, and 80's Rock            *");
        System.out.println("*                                                                *"
                + "\n* Good Luck and enjoy the game!                                         *"
                + "\n*                                                                       *");
        System.out.println("******************************************************************");
        
    }

    private String getPlayersName() {
        boolean valid = false; // indicates if the name has been recieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //Keyboard input stream
        
        while(!valid) { //while a valid name has not been recieved 
            
            //prompt for the player's name
            System.out.println("Enter the Player's name below:");
            
            //get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            // if the name is invalid (less than two character in length))
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue; //and repeat again
            }
            break; // out of the (exit) the repetition
            
        }
        return playersName; //return the name
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n================================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("====================================================");
        
                
    }
}