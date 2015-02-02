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
public class Map implements Serializable {
    
    private String rowCount;
    private double rowColumn;

    public Map() {
    }

    
    
    public String getRowCount() {
        return rowCount;
    }

    public void setRowCount(String rowCount) {
        this.rowCount = rowCount;
    }

    public double getRowColumn() {
        return rowColumn;
    }

    public void setRowColumn(double rowColumn) {
        this.rowColumn = rowColumn;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", rowColumn=" + rowColumn + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.rowCount);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.rowColumn) ^ (Double.doubleToLongBits(this.rowColumn) >>> 32));
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.rowColumn) != Double.doubleToLongBits(other.rowColumn)) {
            return false;
        }
        return true;
    }
    
    
    
}
