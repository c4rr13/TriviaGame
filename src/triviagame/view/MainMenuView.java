/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.view;

import exceptions.MapControlException;
import java.awt.Point;
import java.util.Scanner;
import triviagame.control.GameControl;
import triviagame.control.MapControl;
import triviagame.model.Actor;

/**
 *
 * @author whitbillman
 */
public class MainMenuView extends View {
    
    
  

    public MainMenuView() {
        
        super(  "\n"
                + "\n-----------------------------"
                + "\n| Main Menu                 |"
                + "\n-----------------------------"
                + "\nG - Start Game"
                + "\nH - Get Help"
                + "\nS - Save Game"
                + "\nE - Exit"
                + "\n-----------------------------");
    
 
    }
   
    private Object gamemenu;
    private Object TriviaGame; 

    

   
            
  
    /**
     *
     * @return
     */
    

    private void doAction(char selection) {
        int choice = 0;
        switch (choice) {
            case 'N': // create and start a new game
                this.startNewGame();
                break;
            case 'G': // get and start an exsisting game
                this.startExsistingGame();
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'S': // save current game
                this.saveGame();
                break;
            case 'E': // exit the game
                return;
            default:
              ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
            }
        }

    private void startNewGame() {
        //Create new Game
        //int value = GameControl.createNewGame(TriviaGame.getPlayer());
        //if (value < 0) {
        //   ErrorView.display(this.getClass().getName(),"ERROR - Failed to create new game")
        //}
        
        //Display the Game Menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExsistingGame() {
        this.console.println( "\n\nEnter the file path for file where the game is to be saved.");
        String filePath = this.getInput();
        
        try{
            //Start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        //Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
       this.console.println("\n*** displayHelpMenu function called ***");
    }

    private void saveGame() {
        this.console.println("\n\nEnter the file path for file where the game"
                                 + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            GameControl.saveGame(80sTriviaGame.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        Actor actor = null;
        //move actor to specified location
        try {
            Point coordinates = null;
            MapControl.moveActorToLocation(actor, coordinates);
        } catch (MapControlException me) {
            this.console.println(me.getMessage());
        }
        return false;
        
    }

    
        
        
    }
    

    
    

