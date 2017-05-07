import tester.*;
import javalib.impworld.*;
import java.awt.Color;
import java.awt.Rectangle;

import javalib.worldimages.*;
import java.util.*;

public class Cell {
  boolean obstacle; //false when there is no obstacle and true when there is
  int width = 5;
  int height = 5;
  
  Cell(int x, int y, boolean obstacle) {
    this.obstacle = obstacle;
  }
  
  WorldImage drawCell() {
    return new RectangleImage(this.width, this.height, "outline", Color.BLACK);
  }
  
}
