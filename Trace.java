
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

/* Each un-indented line describes a line of the code */

/* Starts by creating a new object 'p' of class point with two 'ints' passed in as parameters;
		Checks the parameters to see if they are valid (greater than 0);
		The instance variables of Point 'p' are set:
				int 'xcoord' = 100;
				int 'ycoor' = 200;
Creates a new object 'c' of class Circle, with a reference to 'p' and an 'int' as parameters;
		The instance variables of Circle 'c' are set:

Creates a new object 's' of class Square, with a reference to 'p' and an 'int' as parameters;
		The instance variables of Square 's' are set:

Calls the method moveDown() with an 'int' as a parameter;
		Checks first to see if the parameter is more than 0;
		Adds the parameter passed in to the instance variable 'ycoord' of the Point p;
Prints out a string representation of the object 'p' to the console;
Calls the method moveLeft() with an 'int' as a parameter;
		Checks first to see if the parameter is more than 0;
		Adds the parameter passed in to the instance variable 'xcoord' of the Point p;
Prints out a string representation of the object 'p' to the console;
Calls the method moveDown() with an 'int' as a parameter;
		Checks first to see if the parameter is more than 0;
		Adds the parameter passed in to the instance variable 'ycoord' of the Point p;
Prints out a string representation of the object 'p' to the console;
