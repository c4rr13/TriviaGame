/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TriviaGame.model;

import java.io.Serializable;
import java.util.Objects;

public class TriviaQuestions implements Serializable{
    
    //class instance variables
    private String questions;
    private String options;
    private String answer;

    
    public TriviaQuestions() {
    }

    @Override
    public String toString() {
        return "TriviaQuestions{" + "questions=" + questions + ", options=" + options + ", answer=" + answer + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.questions);
        hash = 13 * hash + Objects.hashCode(this.options);
        hash = 13 * hash + Objects.hashCode(this.answer);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TriviaQuestions other = (TriviaQuestions) obj;
        if (!Objects.equals(this.questions, other.questions)) {
            return false;
        }
        if (!Objects.equals(this.options, other.options)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        return true;
    }

    
    
    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


    
}

/**
 *
 * @author carri_000
 */

