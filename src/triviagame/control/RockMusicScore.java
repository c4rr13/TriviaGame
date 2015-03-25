/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.control;

import triviagame.model.RockMusic;

/**
 *
 * @author whitbillman
 */
public class RockMusicScore {
    private static RockMusicScore[] RockMusicScore;
    
    public static RockMusicScore[] createRockMusicScore() {
       RockMusicScore[][] newRockMusicScore = null;
       RockMusicScore[] RockScore =
               newRockMusicScore[5];
       
       RockMusicScore question1 = new RockMusicScore();
       question1.setDescription("Question One");
       question1.setOptions(4);
       RockMusicScore[RockMusic.One.ordinal()] = question1;
       
        RockMusicScore question2 = new RockMusicScore();
       question2.setDescription("Question Two");
       question2.setOptions(4);
       RockMusicScore[RockMusic.Two.ordinal()] = question2;
       
        RockMusicScore question3 = new RockMusicScore();
       question3.setDescription("Question Three");
       question3.setOptions(4);
       RockMusicScore[RockMusic.Three.ordinal()] = question3;
       
        RockMusicScore question4 = new RockMusicScore();
       question4.setDescription("Question Four");
       question4.setOptions(4);
       RockMusicScore[RockMusic.Four.ordinal()] = question1;
       
        RockMusicScore question5 = new RockMusicScore();
       question5.setDescription("Question Five");
       question5.setOptions(4);
       RockMusicScore[RockMusic.Five.ordinal()] = question1;
       
        RockMusicScore question6 = new RockMusicScore();
       question6.setDescription("Question Six");
       question6.setOptions(4);
       RockMusicScore[RockMusic.Six.ordinal()] = question1;
       
       return RockMusicScore;
       
    }

    private void setDescription(String question_One) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setOptions(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

