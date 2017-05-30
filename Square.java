public class Square{

  private Point topLeft;
  private int width;

  public Square(Point topLeft , Point bottomRight){
    this.topLeft = topLeft
    //
  }
  public Square(Point topLeft, int width){
    this.topLeft = topLeft;
    this.width = width;

  }
  public void moveDown(int amount){
    topLeft.moveDown(amount);
  }

}
