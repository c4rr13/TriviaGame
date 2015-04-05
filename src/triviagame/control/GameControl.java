/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.control;

import exceptions.MapControlException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import triviagame.model.Game;
import triviagame.model.Map;
import triviagame.model.Player;

/**
 *
 * @author whitbillman
 * 
 */
public class GameControl {
    private static Object IOHelper;
    public static void createNewGame(Player player) throws MapControlException {
        
        Game game = new Game(); //create new game
        
        
        game.setPlayer(player);// save player in game
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map);//save map in game
        
      //move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
    }

    public static void saveGame(Game game, String filepath)
    throws GameControlException, IOException {
        
        try(FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); //write the game objects out to file
            
        }
    }

    public static int createNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    private static class GameControlException extends Exception {

        public GameControlException() {
        }

        private GameControlException(String message) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class I0Exception {

        public I0Exception() {
        }
    }
    
    public static void getSavedGame(String filepath)
                        throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject(); //read the gmae object from file
        }
        catch(FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
}