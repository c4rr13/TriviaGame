/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.view;

import java.util.Scanner;
import triviagame.control.GameControl;

/**
 *
 * @author whitbillman
 */
public class MainMenuView extends View {
    
    
  

    public MainMenuView(String promptMessage) {
        
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
            }
        }

    private void startNewGame() {
        //Create new Game
        GameControl.createNewGame(80sTriviaGame.getPlayer());
        
        //Display the Game Menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExsistingGame() {
        System.out.println("\n*** startExsistingGame function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("\n*** displayHelpMenu function called ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        
    }
    

    
    

