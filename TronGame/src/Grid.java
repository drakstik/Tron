import tester.*;
import javalib.impworld.*;
import java.awt.Color;
import javalib.worldimages.*;
import java.util.*;

class Grid {
  ArrayList<ArrayList<Cell>> cells;
  int GRID_SIZE = cells.size()*5;
  
  
  //convenience constructor
  Grid() {
    
  }
  
  //getter method for GRID_SIZE
  int getGRID_SIZE() {
    return this.GRID_SIZE;
  }
  
  //creates a worldscene with this.cells drawn on it according to their index
  WorldScene drawGrid() {
    WorldScene canvas = new WorldScene(GRID_SIZE, GRID_SIZE);
    
    for(ArrayList<Cell> arrCell : this.cells) {
      int y = cells.indexOf(arrCell);
      for(Cell c : arrCell) {
        int x = arrCell.indexOf(c);
        canvas.placeImageXY(c.drawCell(), x*5, y*5);
      }
    }
    
    return canvas;
    
  }
}
