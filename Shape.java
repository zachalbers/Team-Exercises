import java.awt.Graphics;
import java.awt.Rectangle;

public class Shape {
	private Point topLeft = new Point(100, 100);
	private int size = 50;

	public void setSize(int size){
		this.size = size;
	}

	public void moveDown(int amount) {
		topLeft.moveDown(amount);
	}

	public void moveUp(int amount) {
		topLeft.moveUp(amount);
	}

	public void moveLeft(int amount) {
		topLeft.moveLeft(amount);
	}

	public void moveRight(int amount) {
		topLeft.moveRight(amount);
	}

	public void draw(Graphics g){


	}


  public Point getTopLeft() {
    Point topLeftCopy = new Point(topLeft.getXCoord(), topLeft.getYCoord());
    return topLeftCopy;
  }

  public int getSize() {
    return size;
  }

}
