import java.awt.Graphics;
import java.awt.Rectangle;

//

public class Square{

  private Point topLeft;
  private int width;

// Constructor that takes two points.
  public Square(Point topLeft , Point bottomRight){
      this.topLeft = topLeft;
      this.width = (int)topLeft.distance(bottomRight);
  }

// Constructor that take a point and an int.
  public Square(Point topLeft, int width) {
			this.topLeft = topLeft;
			this.width = width;
	}

  // Method that moves the object down.
  public void moveDown(int amount){
      topLeft.moveDown(amount);
  }

// Draws the object on the window.
  public void draw(Graphics g){
    g.drawRect(topLeft.getXCoord(), topLeft.getYCoord(), width, width);
  }
}
