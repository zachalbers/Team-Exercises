import java.util.*;

public class Point {

    private int xcoord;
    private int ycoord;

    public Point(int x, int y) {
        this.xcoord = x;
        this.ycoord = y;
    }


    public int distance(Point point1) {
        double xdiff = Math.pow( (point1.getXCoord() - xcoord), 2 );
        double ydiff = Math.pow( (point1.getYCoord() - ycoord), 2 );
        double sqrt = Math.sqrt( (xdiff + ydiff));
        return (int)sqrt;
    }

    public void setXCoord(int xcoord) {
        this.xcoord = xcoord;
        }


    public void setYCoord(int ycoord) {
        this.ycoord = ycoord;
        }


    public int getXCoord(){
        return xcoord;
    }

    public int getYCoord(){
        return ycoord;
    }


    public void moveUp(int amount) {

        this.ycoord -= amount;
    }

    public void moveDown(int amount) {
        this.ycoord += amount;
    }

    public void moveLeft(int amount) {
        this.xcoord -= amount;
    }

    public void moveRight(int amount) {
        this.xcoord += amount;
    }


}
