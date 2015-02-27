/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.control;

import pkg80striviagame.TriviaGame;
import triviagame.model.Player;

/**
 *
 * @author carri_000
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) {
        if (playersName == null) {
            return null;
        }
        Player player = new Player();
        player.setName(playersName);
        
        TriviaGame.setPlayer(player);
        return player;
    }

    public static void createNewGame(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
