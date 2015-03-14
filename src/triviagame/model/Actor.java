/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author whitbillman
 */
public enum Actor implements Serializable {
    
    Ryan, Seacrest("He is the celebrity game show host."),
    Steven, Tyler("He is the lead singer of areosmith and an 80's Rock Legend."),
    Reba, McEntire("She is an 80's Country Singer"),
    Michael, Jackson("He is an 80's Pop legend");
   
   

    private final Point coordinates;
    private final String description;
    
    Actor(String description){
        this.description = description;
        coordinates = new Point(1,1);
    }

   public String getDescription(){
          return description;
}

   public Point getCoordinates(){
          return coordinates;
}

}
    

    