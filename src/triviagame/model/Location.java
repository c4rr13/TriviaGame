/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TriviaGame.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Location implements Serializable{
    
    //class instance variables
    private String rowCount;
    private String rowColumn;
    private String progress;
    private int row;
    private int column;
    private boolean visited;
    private Scene scene;
    private ArrayList<Actor> actors;

    public Location() {
    }

    @Override
    public String toString() {
        return "Location{" + "rowCount=" + rowCount + ", rowColumn=" + rowColumn + ", progress=" + progress + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.rowCount);
        hash = 97 * hash + Objects.hashCode(this.rowColumn);
        hash = 97 * hash + Objects.hashCode(this.progress);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        if (!Objects.equals(this.rowColumn, other.rowColumn)) {
            return false;
        }
        if (!Objects.equals(this.progress, other.progress)) {
            return false;
        }
        return true;
    }
    
    

    public String getRowCount() {
        return rowCount;
    }

    public void setRowCount(String rowCount) {
        this.rowCount = rowCount;
    }

    public String getRowColumn() {
        return rowColumn;
    }

    public void setRowColumn(String rowColumn) {
        this.rowColumn = rowColumn;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public Object getScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
/**
 *
 * @author carri_000
 */

