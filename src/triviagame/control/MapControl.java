/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.control;

import triviagame.model.Location;
import triviagame.model.Scene;
import exceptions.MapControlException;
import java.awt.Point;
import pkg80striviagame.TriviaGame;
import triviagame.model.Actor;
import triviagame.model.Game;
import triviagame.model.Map;
import triviagame.model.Scene.SceneType;

/**
 *
 * @author carri_000 
 * @author whitbillman
 */
public class MapControl {
    
    
    public static Map createMap() throws MapControlException {
        //create map
        Map map = new Map(20, 20);
        
        //create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        //assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
         return map;
    }

    private static Scene[] createScenes() throws MapControlException {
    //BufferedImage image = null;
    
    Game game = TriviaGame.getCurrentGame();
    
    Scene [] scenes = new Scene[SceneType.values().length];
    
    Scene startingScene = new Scene();
    startingScene.setDescription(
                "\nWelcome to the 1980's! "
              + "The era of the best music known to man! You "
              + "came here to meet the band members and we want "
              + "you to do just that! They are waiting for you, lets go!");
    
   startingScene.setMapSymbol(" ST ");
   startingScene.setBlocked(false);
   startingScene.setTravelTime(240);
  // ImageIcon startingSceneImage = MapControl.getImage(startinScene, );
   //startingScene.setIcon(startSceneImage);
   scenes[SceneType.start.ordinal()] = startingScene;
   
   
   
   Scene finishScene = new Scene();
   finishScene.setDescription(
                     "\nCongratulations! Well done you made it! "
                   + "The band mates are pleased with your diligance!");
   finishScene.setMapSymbol(" FN ");
   finishScene.setBlocked(false);
   finishScene.setTravelTime((int) Double.POSITIVE_INFINITY);
   //ImageIcon finishSceneImage = MapControl.getImage(finishScene, );
    // finishScene.setIcon(finishSceneImage);
   scenes[SceneType.finish.ordinal()] = finishScene; 
   return (null);
  
    

    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.line.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.line.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.popconcert.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.rockconcert.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.countryconcert.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.backstage.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.greenroom.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.finish.ordinal()]);
       
    
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
        
       Map map = 80sTriviaGame.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNoOfRows() ||
           newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Can not move actor to location"
                                        + coordinates.x +", " + coordinates.y
                                        + "because that location is outside "
                                        +" the bounds of the map.");
           
        }
    
    }

