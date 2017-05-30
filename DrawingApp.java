import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;

/** 
 * Application for drawing circles on the screen.  When the user click, a circle
 * will be created on the spot of default size.  When dragging the mouse, the circle
 * will have the size indicated by the drag area.
 * @author Nathaly Verwaal
 *
 */
public class DrawingApp extends JFrame implements MouseListener {
	public static final int WINDOW_WIDTH = 1000;
	public static final int WINDOW_HEIGHT = 1000;
	public static final int DEFAULT_CIRCLE_SIZE = 100;
	
	private ArrayList<Circle> circles = new ArrayList<Circle>();
	
	// Need to know where mouse drag started when the user releases the mouse button
	private Point mouseDragStartPoint;
   
    /** 
     * Creates the window that users can use to draw circles.
     */
    public DrawingApp() {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // put one circle in the list to get is started.
        circles.add(new Circle(new Point(100,100),new Point(200,200)));
        
        // Make sure we listen to mouse events.
        getContentPane().addMouseListener(this);
       
    }
    
    /**
     * Draws what should be displayed in this window.  this will be called each
     * time the window needs to be refreshed.  This includes when the window
     * is displayed, maximized, moved, etc.)
     * <p>
     * Currently, it draws all the circles in the list defined above as one of the
     * instance variables.
     *
     * @param canvas the canvas/window to draw in.
     */
    public void paint(Graphics canvas) {
        // We need to do this call to make sure the window is wiped clean before we
        // start drawing.
        super.paint(canvas);
        for (Circle c : circles) {
        	c.draw(canvas);
        }
        
    }
    
    // --- All the methods we must implement if we want to be a Mouse Listener -----
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == e.BUTTON3) {
			for (Circle c : circles) {
				c.moveDown(50);
			}
		} else {
			int xCoord = e.getX();
			int yCoord = e.getY();
			circles.add(new Circle(new Point(xCoord,yCoord), 
					new Point(xCoord + DEFAULT_CIRCLE_SIZE, yCoord + DEFAULT_CIRCLE_SIZE)));
			repaint();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		mouseDragStartPoint = new Point(e.getX(), e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (mouseDragStartPoint == null) {
			System.out.println("nothing here");
			return;
		}
		
		Point bottomRight = new Point(e.getX(), e.getY());

		circles.add(new Circle(mouseDragStartPoint,bottomRight));
		mouseDragStartPoint = null;
		repaint();	
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// Do nothing for this event.
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Do nothing for this event.
		
	}

    public static void main(String[] args) {
        DrawingApp faceWindow = new DrawingApp();
        faceWindow.setVisible(true);
    }
}