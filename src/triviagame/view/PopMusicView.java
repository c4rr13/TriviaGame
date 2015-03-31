/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.view;


/**
 *
 * @author carri_000
 */
import java.io.PrintWriter;
import java.util.Scanner;
import triviagame.control.GameControl;

public class PopMusicView extends View {

    public PopMusicView(String promptMessage) {
        super("\n"
                + "\n-----------------------------"
                + "\n| Pop Music Menu                 |"
                + "\n-----------------------------"
                + "\nG - Resume Game"
                + "\nH - Get Help"
                + "\nS - Save Game"
                + "\nE - Exit"
                + "\n-----------------------------");
    }
    
    private Object gamemenu;
    private Object TriviaGame; 


    private void doAction(char selection) {
        int choice = 0;
        switch (choice) {
            case 'R': // Resume Game
                this.ResumeGame();
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

    
    private void ResumeGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       

    private void displayHelpMenu() {
        this.console.println("\n*** displayHelpMenu function called ***");
    }

    private void saveGame() {
        this.console.println("\n*** saveGame function called ***");
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
 
        
        
    }
    

    
    


