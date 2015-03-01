/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg80striviagame;




import triviagame.model.Player;
import triviagame.model.Game;
import triviagame.view.StartProgramView;



/**
 *
 * @author carri_000
 */
public class TriviaGame {
   
    private static Game currentGame = null;
    private static Player player = null;

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
        Player playerOne = new Player();
        
        playerOne.setName("Carrie Taylor");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
          
    }
  

    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game currentGame) {
        TriviaGame.currentGame = currentGame;
    }
    
    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TriviaGame.player = player;
    }

       
   
        
    }
     
     
    
    
