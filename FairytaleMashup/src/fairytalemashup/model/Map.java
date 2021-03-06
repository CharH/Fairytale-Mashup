/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairytalemashup.model;

import fairytalemashup.exceptions.MapControlException;
import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author charlottehuyett
 */
public class Map implements Serializable {

    //class instance variables
    private int noOfRows;
    private int noOfColumns;

    //cardinality things
    public Location[][] locations;
    private Game game;
    private Guidebook guidebook;

    //default constructor function
    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) throws MapControlException{
        if (noOfRows < 1 || noOfColumns < 1) {
            throw new MapControlException("****ERROR**** The number of rows and columns must be greater than zero!");
        }

        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;

        this.locations = new Location[noOfRows][noOfColumns];

        for (int row = 0; row < noOfRows; row++) {
            for (int column = 0; column < noOfColumns; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);

                locations[row][column] = location;
            }
        }
    }

    //getter and setter functions
    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public Location[][] getLocation() {
        return locations;
    }

    public void setLocation(Location[][] location) {
        this.locations = location;
    }

    //equals and hashCode functions
    //toString function
    @Override
    public String toString() {
        return "Map{" + "noOfRows=" + noOfRows + ", noOfColumns=" + noOfColumns + ", location=" + locations + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.noOfRows;
        hash = 37 * hash + this.noOfColumns;
        hash = 37 * hash + Arrays.deepHashCode(this.locations);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.noOfRows != other.noOfRows) {
            return false;
        }
        if (this.noOfColumns != other.noOfColumns) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        return true;
    }

}
