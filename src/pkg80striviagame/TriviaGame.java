/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg80striviagame;

import javax.tools.JavaFileManager.Location;
import triviagame.model.Player;
import triviagame.model.TriviaQuestions;



/**
 *
 * @author carri_000
 */
public class TriviaGame {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Carrie Taylor");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        TriviaQuestions triviaquestions = new TriviaQuestions();
        
       
   
        
    }
     
     
    
    
}

