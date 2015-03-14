/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.control;

import triviagame.model.Game;
import triviagame.model.Map;
import triviagame.model.Player;

/**
 *
 * @author whitbillman
 * 
 */
public class GameControl {
    public static void createNewGame(Player player) {
        
        Game game = new Game(); //create new game
        
        
        game.setPlayer(player);// save player in game
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map);//save map in game
        
      //move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
    }
}