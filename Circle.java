import java.awt.Graphics;
import java.awt.Rectangle;

public class Circle {
	private Point centre;
	private int radius;

	public Circle(Point topLeft, Point bottomRight){
		radius = (int)topLeft.distance(bottomRight)/2;
		centre = new Point(topLeft.getXCoord() + radius, topLeft.getYCoord() + radius);
	}

	public Circle(Point centre, int radius) {
		this.centre = centre;
		this.radius = radius;
	}

	public void moveDown(int amount) {
		centre.moveDown(amount);
	}

	public void draw(Graphics g){
		g.drawOval(centre.getXCoord() - radius, centre.getYCoord() - radius,
				radius * 2,
				radius * 2);



	}
}
