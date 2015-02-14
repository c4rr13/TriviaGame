/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.control;

/**
 *
 * @author carri_000
 */
public class CurrentScore {
    public double CurrentScore( double SavedScore, double Points) {
        
            if (Points < 0 || Points > 1500 ){
            return -1;
                    }
            if (SavedScore < 0 || SavedScore > 1500) {
             return -1;
                    }

double TotalScore = SavedScore + Points;
    
return TotalScore;


    }
}
