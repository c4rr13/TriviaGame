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
public class CountryMusicView {
    
    private final String MENU = "\n"
                + "\n-----------------------------"
                + "\n| Country Music Menu                 |"
                + "\n-----------------------------"
                + "\nG - Resume Game"
                + "\nH - Get Help"
                + "\nS - Save Game"
                + "\nE - Exit"
                + "\n-----------------------------";
    private Object gamemenu;
    private Object TriviaGame; 

   
            
  public void displayMenu() {
        
      System.out.println("*** MainMenuView.displayMenu() function called ***");
      
        char selection = ' ';
        do {
            System.out.println(MENU); //display the Country Music Menu
            
            String input = this.getInput(); //get users selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); // do action based on selection
        } while (selection != 'E'); // an selection is not "exit"
  } 
    /**
     *
     * @return
     */
    public String getInput() {
        boolean valid = false; // indicates if the name has been recieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in); //Keyboard input stream
        
        while(!valid) { //while a valid name has not been recieved 
            
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            // if the name is invalid (less than two character in length))
            if (selection.length() < 1) {
                System.out.println("Invalid selection - the input must not be blank");
                continue; //and repeat again
            }
            break; // out of the (exit) the repetition
            
        }
        return selection; //return the name
    }

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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
            }
        }

   

  

    private void displayHelpMenu() {
        System.out.println("\n*** displayHelpMenu function called ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }

    private void ResumeGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        
    }
    


