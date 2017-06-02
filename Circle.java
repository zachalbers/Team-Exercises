import java.awt.Graphics;
import java.awt.Rectangle;

// This class creates a 'Circle' object and draws it on the window.
public class Circle {

	private Point centre;
	private int radius;

// Constructor that takes two points.
	public Circle(Point topLeft, Point bottomRight){
			this.radius = (int)topLeft.distance(bottomRight)/2;
			this.centre = new Point(topLeft.getXCoord() + radius, topLeft.getYCoord() + radius);
	}

// Constructor that take a point and an int.
	public Circle(Point centre, int radius) {
			this.centre = centre;
			this.radius = radius;
	}

  // Method that moves the object down.
	public void moveDown(int amount) {
			centre.moveDown(amount);
	}

// Draws the object on the window.
	public void draw(Graphics g){
			g.drawOval(centre.getXCoord() - radius, centre.getYCoord() - radius,
			radius * 2,
			radius * 2);
	}
}
