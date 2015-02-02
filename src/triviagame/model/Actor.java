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
public class Actor implements Serializable {
    
    private String name;
    private double appearance;
    
    
    public Actor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAppearance() {
        return appearance;
    }

    public void setAppearance(double appearance) {
        this.appearance = appearance;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", appearance=" + appearance + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.appearance) ^ (Double.doubleToLongBits(this.appearance) >>> 32));
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
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.appearance) != Double.doubleToLongBits(other.appearance)) {
            return false;
        }
        return true;
    }
 
    
    
}
