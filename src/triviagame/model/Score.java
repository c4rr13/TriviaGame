/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author whitbillman
 */
public class Score implements Serializable {
    
    private String topScore;
    private double currentScore;

    public Score() {
    }
    
   

    public String getTopScore() {
        return topScore;
    }

    public void setTopScore(String topScore) {
        this.topScore = topScore;
    }

    public double getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(double currentScore) {
        this.currentScore = currentScore;
    }

    @Override
    public String toString() {
        return "Score{" + "topScore=" + topScore + ", currentScore=" + currentScore + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.topScore);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.currentScore) ^ (Double.doubleToLongBits(this.currentScore) >>> 32));
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
        final Score other = (Score) obj;
        if (!Objects.equals(this.topScore, other.topScore)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentScore) != Double.doubleToLongBits(other.currentScore)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}

