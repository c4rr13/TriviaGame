/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.control;

import triviagame.model.PopMusic;

/**
 *
 * @author whitbillman
 */
public class PopMusicScore {
  
    private static PopMusicScore[] PopMusicScore;
    
    public static PopMusicScore[] createPopMusicScore() {
       PopMusicScore[][] newPopMusicScore = null;
       PopMusicScore[] PopScore =
               newPopMusicScore[5];
       
       PopMusicScore question1 = new PopMusicScore();
       question1.setDescription("Question One");
       question1.setOptions(4);
       PopMusicScore[PopMusic.One.ordinal()] = question1;
       
        PopMusicScore question2 = new PopMusicScore();
       question2.setDescription("Question Two");
       question2.setOptions(4);
       PopMusicScore[PopMusic.Two.ordinal()] = question2;
       
        PopMusicScore question3 = new PopMusicScore();
       question3.setDescription("Question Three");
       question3.setOptions(4);
       PopMusicScore[PopMusic.Three.ordinal()] = question3;
       
        PopMusicScore question4 = new PopMusicScore();
       question4.setDescription("Question Four");
       question4.setOptions(4);
       PopMusicScore[PopMusic.Four.ordinal()] = question1;
       
        PopMusicScore question5 = new PopMusicScore();
       question5.setDescription("Question Five");
       question5.setOptions(4);
       PopMusicScore[PopMusic.Five.ordinal()] = question1;
       
        PopMusicScore question6 = new PopMusicScore();
       question6.setDescription("Question Six");
       question6.setOptions(4);
       PopMusicScore[PopMusic.Six.ordinal()] = question1;
       
       return PopMusicScore;
       
    }

    private void setDescription(String question_One) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setOptions(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    
