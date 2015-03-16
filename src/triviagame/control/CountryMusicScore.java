/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.control;

import triviagame.model.CountryMusic;

/**
 *
 * @author carri_000
 */
public class CountryMusicScore {
    private static CountryMusicScore[] CountryMusicScore;
    
    public static CountryMusicScore[] createCountryMusicScore() {
        CountryMusicScore[][] newCountryMusicScore = null;
       CountryMusicScore[] CountryScore =
               newCountryMusicScore[5];
       
       CountryMusicScore question1 = new CountryMusicScore();
       question1.setDescription("Question One");
       question1.setOptions(4);
       CountryMusicScore[CountryMusic.One.ordinal()] = question1;
       
        CountryMusicScore question2 = new CountryMusicScore();
       question2.setDescription("Question Two");
       question2.setOptions(4);
       CountryMusicScore[CountryMusic.Two.ordinal()] = question2;
       
        CountryMusicScore question3 = new CountryMusicScore();
       question3.setDescription("Question Three");
       question3.setOptions(4);
       CountryMusicScore[CountryMusic.Three.ordinal()] = question3;
       
        CountryMusicScore question4 = new CountryMusicScore();
       question4.setDescription("Question Four");
       question4.setOptions(4);
       CountryMusicScore[CountryMusic.Four.ordinal()] = question1;
       
        CountryMusicScore question5 = new CountryMusicScore();
       question5.setDescription("Question Five");
       question5.setOptions(4);
       CountryMusicScore[CountryMusic.Five.ordinal()] = question1;
       
        CountryMusicScore question6 = new CountryMusicScore();
       question6.setDescription("Question Six");
       question6.setOptions(4);
       CountryMusicScore[CountryMusic.Six.ordinal()] = question1;
       
       return CountryMusicScore;
       
    }

    private void setDescription(String question_One) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setOptions(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
