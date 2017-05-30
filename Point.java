import java.util.*;

public class Point {

  int xcoord;
  int ycoord;

  public Point(int x, int y) {
    xcoord = x;
    ycoord = y;
  }


public int distance(Point point1) {
  double xdiff = Math.pow( (point1.getXCoord() - xcoord), 2 );
  double ydiff = Math.pow( (point1.getYCoord() - ycoord), 2 );
  double sqrt = Math.sqrt( (xdiff + ydiff));

  return (int)sqrt;
}

public setXCoord(int x) {
  if (x > 0) {
    xcoord = x;
  }
}

public setYCoord(int y) {
  if (y > 0) {
    ycoord = y;
  }
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
