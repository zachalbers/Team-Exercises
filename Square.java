import java.awt.Graphics;
import java.awt.Rectangle;

public class Square{

  private Point topLeft;
  private int width;

  public Square(Point topLeft , Point bottomRight){
      this.topLeft = topLeft;
      width = (int)topLeft.distance(bottomRight);
  }

  public Square(Point topLeft, int width) {
			this.topLeft = topLeft;
			this.width = width;
	}


  public void moveDown(int amount){
      topLeft.moveDown(amount);
  }

  public void draw(Graphics g){
    g.drawRect(topLeft.getXCoord(), topLeft.getYCoord(), width, width);
  }
}
