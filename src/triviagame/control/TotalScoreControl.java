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
public class TotalScoreControl {
    public double TotalScore( double CountryScore, double PopScore, double RockScore) {
        
            if (CountryScore < 0 || CountryScore > 1500 ){
            return -1;
                    }
            if (PopScore < 0 || PopScore > 1500) {
             return -1;
                    }
            if (RockScore < 0 || RockScore > 1500) {
                return -1;
            }

double TotalScore = CountryScore + PopScore + RockScore;
    
return TotalScore;


    }
}

