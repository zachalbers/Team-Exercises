import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * Application for drawing circles on the screen.  When the user click, a circle
 * will be created on the spot of default size.  When dragging the mouse, the circle
 * will have the size indicated by the drag area.
 * @author Nathaly Verwaal
 *
 */
public class DrawingApp extends JFrame implements KeyListener {
	public static final int WINDOW_WIDTH = 1000;
	public static final int WINDOW_HEIGHT = 1000;
	public static final int DEFAULT_CIRCLE_SIZE = 100;

	private ArrayList<Shape> shapes = new ArrayList<Shape>();


    /**
     * Creates the window that users can use to draw circles.
     */
    public DrawingApp() {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // put one circle in the list to get is started.
        Point topLeft = new Point(100,100);
        Point bottomRight = new Point(200,200);

        getContentPane().addKeyListener(this);
        getContentPane().setFocusable(true);
        requestFocusInWindow();

        // This creates a times.  Whenever the timer goes off (every 200 ms)
        // we call this frames method to repaint itself.  (Which will
        // indirectly call paint above.
        Timer timer = new Timer(200,
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    timerAction();
                }
            });
        // The timer will go off for the first time 1000ms after the timer is started.
        timer.setInitialDelay(1000);
        timer.start();
    }

    public void timerAction(){
		for (Shape s : shapes) {
			s.moveDown(10);
		}

		repaint();
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
        for (Shape s : shapes) {
        	s.draw(canvas);
        }

    }

	@Override
	public void keyTyped(KeyEvent event) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int size = 50;
		switch (e.getKeyCode()) {
		case 'C':
			size = 75;
		case 'c':
			Circle toAdd = new Circle(new Point(100, 100), size);
			shapes.add(toAdd);
			break;
		case 'S':
			size = 100;
		case 's':
			Square square = new Square(new Point(100, 100), size);
			shapes.add(square);
			break;
		case KeyEvent.VK_LEFT:
		case KeyEvent.VK_KP_LEFT:
		for (Shape s : shapes) {
				s.moveLeft(10);
			}

			break;
		case KeyEvent.VK_RIGHT:
		for (Shape s : shapes) {
				s.moveRight(10);
			}

			break;
		case KeyEvent.VK_UP:
		for (Shape s : shapes) {
				s.moveUp(10);
			}

			break;
		case KeyEvent.VK_DOWN:
		for (Shape s : shapes) {
				s.moveDown(10);
			}
			break;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

    public static void main(String[] args) {
        DrawingApp faceWindow = new DrawingApp();
        faceWindow.setVisible(true);
    }

}
