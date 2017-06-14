import java.awt.Graphics;
import java.awt.Rectangle;

public class Circle extends Shape {



	public Circle(Point topLeft, int diameter) {
			super(topLeft, diameter);
	}


	public Circle(Point centre, double radius) {
			super(centre, (int)radius);
	}


	public Circle(Circle toCopy) {
			super(toCopy);
	}

	public void draw(Graphics g){
			g.drawOval(getTopLeft().getXCoord(), getTopLeft().getYCoord(),
			getSize() * 2,
			getSize() * 2 );

	}




	public String toString() {
		String info = "circle " + super.toString();
		return info;
	}
}
