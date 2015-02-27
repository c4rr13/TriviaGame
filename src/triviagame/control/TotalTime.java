/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.control;

/**
 *
 * @author whitbillman
 */
public class TotalTime {
    public double TotalTime( double CountryTime, double PopTime, double RockTime) {
        
            if (CountryTime < 0 || CountryTime > 2 ){
            return -1;
                    }
            if (PopTime < 0 || PopTime > 2 ) {
             return -1;
                    }
            if (RockTime < 0 || RockTime > 2 ) {
                return -1;
            }

double TotalTime = CountryTime + PopTime + RockTime;
    
return TotalTime;


    }
    
    
    
}