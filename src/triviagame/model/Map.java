/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame.model;

import java.io.Serializable;
import java.util.Objects;
import triviagame.view.ErrorView;

/**
 *
 * @author whitbillman
 */
public class Map implements Serializable {
    
    private String rowCount;
    private double rowColumn;
    private int noOfRows;
    private int noOfColumns;
    private Location [][] locations;
    private String Column;
    private String Row;

    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 1 || noOfColumns < 1) {
            ErrorView.display(this.getClass().getName(), 
                    "The number of rows and columns must be > zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        //create 2-D array for location objects
        this.locations = new Location[noOfRows] [noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
              for(int column= 0; column < noOfColumns; column++){
                  //Create and intitalize new location object instance
                  Location location = new Location();
                  location.setRowColumn(Column);
                  location.setRowCount(Row);
                  String False = null;
                  location.setProgress(False);
                  
                  //assign the location object to the current position in array
                  locations[row] [column] = location;
              }
        }
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

    public int getNoOfRows() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNoOfColumns() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getColCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
   
}
