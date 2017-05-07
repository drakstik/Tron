import tester.*;
import javalib.impworld.*;
import java.awt.Color;
import javalib.worldimages.*;
import java.util.*;


class TronWorld extends World {
  Grid grid;
  Player player; //list of players in the game
  
  TronWorld(Grid grid, Player player) {
    this.grid = grid;
    this.player = player;
  }

  public WorldScene makeScene() {
    return grid.drawGrid();
  }
  
  public World onKeyEvent(String ke) {
    if(ke.equals("left")) {
      return new TronWorld(this.grid, this.player.movePlayerLeft());
    }
    else if()
  }

}

class ExmapleTronWorld {
  
}
