import tester.*;
import javalib.impworld.*;
import java.awt.Color;
import javalib.worldimages.*;
import java.util.*;

public class Player {
  int x; //player's x position on the grid
  int y; //player's y position on the grid
  int GRID_SIZE = new Grid().getGRID_SIZE();
  
  Player(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  Player movePlayerUp() {
    if(!(this.y == 0)) {
      return new Player(this.x, this.y - 1);
    }
    else {
      return this;
    }
  }
  
  Player movePlayerDown() {
    if(!(this.y == GRID_SIZE)) {
      return new Player(this.x, this.y + 1);
    }
    else {
      return this;
    }
  }
  
  Player movePlayerLeft() {
    if(!(this.x == 0)) {
      return new Player(this.x - 1, this.y);
    }
    else {
      return this;
    }
  }
  
  Player movePlayerRight() {
    if(!(this.x == GRID_SIZE)) {
      return new Player(this.x + 1, this.y);
    }
    else {
      return this;
    }
  }
  
  WorldImage drawPlayer() {
    return new CircleImage(5, "solid", Color.CYAN);
  }
}
