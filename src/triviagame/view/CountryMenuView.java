/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.view;

import java.util.Scanner;


public class CountryMenuView {
    private boolean MENU;
    

public CountryMenuView() {
        
        }

    public void displayMenu() {
       char selection = 'R';
       do {
           System.out.println(MENU); // display the main menu
           
           String input = this.getInput(); // get the user's selection
           selection = input.charAt(0); //get first character of string
           
           this.doAction(selection); //do action based on selection
       }
       while (selection != 'E'); // an selection is not "Exit"
    } 
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        //while a valid name has not been retrieved
        while (!valid) {
            
            //get the value entered from the keyboard 
            selection = keyboard.nextLine();
            selection = selection.trim();
        }
    

    private String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }
