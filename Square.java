import java.awt.Graphics;
import java.awt.Rectangle;

public class Square extends Shape {




	public Square(Point topLeft, int width) {
			super(topLeft, width);
	}

	public Square(Square toCopy) {
			super( new Shape(toCopy.getTopLeft(), toCopy.getSize()) );
	}


	public void draw(Graphics g){
		g.drawRect(getTopLeft().getXCoord(), getTopLeft().getYCoord(),
				getSize(),
				getSize() );

	}
}
