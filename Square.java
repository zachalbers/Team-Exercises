import java.awt.Graphics;
import java.awt.Rectangle;

public class Square{

  private Point topLeft;
  private int width;

  public Square(Point topLeft , Point bottomRight){
    this.topLeft = topLeft;
    this.bottomRight = bottomRight;

  }
  // What does this do?
  // public Square(Point topLeft, int width){
  //   this.topLeft = topLeft;
  // width = bottomRight.getXCoord() - topLeft.getXCoord();
  // }

  public void moveDown(int amount){
    topLeft.moveDown(amount);
  }

  public void draw(Graphics g){
    width = bottomRight.getXCoord() - topLeft.getXCoord();
    g.drawRect(topLeft.getXCoord(), topLeft.getYCoord(), width, width);
  }
}
