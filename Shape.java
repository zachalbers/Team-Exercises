import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Shape {
	private Point topLeft = new Point(100, 100);
	private int size = 50;




	public Shape (Point topLeft, int size) {
			Point topLeftCopy = new Point(topLeft.getXCoord(), topLeft.getYCoord());
			this.topLeft = topLeftCopy;
			this.size = size;
	}

	public Shape (Shape toCopy) {
			this(toCopy.getTopLeft(), toCopy.getSize());
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

	public abstract void draw(Graphics g);


  public Point getTopLeft() {
    	Point topLeftCopy = new Point(topLeft.getXCoord(), topLeft.getYCoord());
    	return topLeftCopy;
  }


  public int getSize() {
    	return size;
  }




	public String toString() {
		String info;
		info = Integer.toString(getTopLeft().getXCoord()) + " " + Integer.toString(getTopLeft().getYCoord())
						+" "+ Integer.toString(getSize());

		return info;

	}

}
