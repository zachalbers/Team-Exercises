import java.util.*;

public class Point {

  int xcoord;
  int ycoord;

  public Point(int x, int y) {
    xcoord = x;
    ycoord = y;
  }


public int distance(Point point1, Point point2) {
  double xdiff = Math.pow( (point1.getXCoord() - point2.getXCoord()), 2 );
  double ydiff = Math.pow( (point1.getYCoord() - point2.getYCoord()), 2 );
  double sqrt = Math.sqrt( (xdiff + ydiff));

  int small = (int)sqrt;

  return small;
}


public int getXCoord(){
  return xcoord;
}

public int getYCoord(){
  return ycoord;
}


public void moveUp(int amount) {
  ycoord += amount;
}

public void moveDown(int amount) {
  ycoord -= amount;
}

public void moveLeft(int amount) {
  xcoord -= amount;
}

public void moveRight(int amount) {
  xcoord += amount;
}


}
