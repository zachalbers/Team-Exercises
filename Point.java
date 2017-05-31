import java.util.*;

public class Point {

    private int xcoord;
    private int ycoord;

    public Point(int x, int y) {
        xcoord = setXCoord(x);
        ycoord = setYCoord(y);
    }


    public int distance(Point point1) {
        double xdiff = Math.pow( (point1.getXCoord() - xcoord), 2 );
        double ydiff = Math.pow( (point1.getYCoord() - ycoord), 2 );
        double sqrt = Math.sqrt( (xdiff + ydiff));
        return (int)sqrt;
    }

    public int setXCoord(int x) {
        if (x > 0) {
            return x;
        } else {
            return 0;
        }
    }

    public int setYCoord(int y) {
        if (y > 0) {
            return y;
        } else {
            return 0;
        }
    }

    public int getXCoord(){
        return xcoord;
    }

    public int getYCoord(){
        return ycoord;
    }


    public void moveUp(int amount) {

        ycoord -= setYCoord(amount);
    }

    public void moveDown(int amount) {
        ycoord += setYCoord(amount);
    }

    public void moveLeft(int amount) {
        xcoord -= setXCoord(amount);
    }

    public void moveRight(int amount) {
        xcoord += setXCoord(amount);
    }


}
