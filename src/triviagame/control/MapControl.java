/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.control;

import TriviaGame.model.Scene;
import exceptions.MapControlException;
import java.awt.Point;
import triviagame.model.Actor;
import triviagame.model.Map;

/**
 *
 * @author carri_000
 */
public class MapControl {
    
    public static Map createMap() {
        //create map
        Map map = new Map(20, 20);
        
        //create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        //assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
         return map;
    }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void moveActorsToStartingLocation(Map map) 
                             throws MapControlException {
        Actor[] actors = Actor.values();
        
        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            MapControl.moveActorToLocation(actor, coordinates);
          
        }
    
    }
    
    public static void moveActorToLocation(Actor actor, Point coordinates) 
                            throws MapControlException {
        
       // Map map = 80sTriviaGame.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
       // if (newRow < 0 || newRow >= map.getNoOfRows() ||
       //     newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Can not move actor to location"
                                        + coordinates.x +", " + coordinates.y
                                        + "because that location is outside "
                                        +" the bounds of the map.");
           
        }
    
    }

