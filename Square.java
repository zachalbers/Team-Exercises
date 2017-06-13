import java.awt.Graphics;
import java.awt.Rectangle;

public class Square extends Shape {


	public void draw(Graphics g){
		g.drawRect(getTopLeft().getXCoord(), getTopLeft().getYCoord(),
				getSize(),
				getSize() );

	}
}
