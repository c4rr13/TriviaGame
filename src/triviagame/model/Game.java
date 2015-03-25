/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.model;


import java.util.Objects;
import java.io.Serializable;
import triviagame.model.Map;
import triviagame.model.Player;

/**
 *
 * @author carri_000
 * @author whitbillman
 */
public class Game implements Serializable {
    
    private double totalTime;
    private long noPeople;
    private Player player;
    private String[] actors;
    private Map map;
    private String time;
    private double winner;


      public Game(){
      }  
     
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public long getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(long noPeople) {
        this.noPeople = noPeople;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getWinner() {
        return winner;
    }

    public void setWinner(double winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "Game{" + "time=" + time + ", winner=" + winner + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.time);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.winner) ^ (Double.doubleToLongBits(this.winner) >>> 32));
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.time, other.time)) {
            return false;
        }
        if (Double.doubleToLongBits(this.winner) != Double.doubleToLongBits(other.winner)) {
            return false;
        }
        return true;
    }
    
    
    
}
