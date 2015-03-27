/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.view;

/**
 *
 * @author whitbillman
 */


public class GameMenuView {
    

    private void doAction(char selection) {
        int choice = 0;
        switch (choice) {
            case 'D': // create and start a new game
                this.displayMenu();
                break;
            case 'M': // create and start a new game
                this.displayMap();
                break;
            case 'A': // get and start an exsisting game
                this.viewActors();
                break;
            case 'v': // display the help menu
                this.viewPlayerStatus();
                break;
            
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
            }
}

    private void viewPlayerStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewActors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMap() {
        ErrorView.display(this.getClass().getName(),"\n*** displayMenu stub function called ***");
        
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
