
public class Trace {
	public static void main(String[] args) {
		Point p = new Point(100,200);
		Circle c = new Circle(p,50);
		Square s = new Square(p,75);
		
		c.moveDown(10);
		System.out.println(p);
		p.moveLeft(100);
		System.out.println(p);
		s.moveDown(40);
		System.out.println(p);
		
	}

}
