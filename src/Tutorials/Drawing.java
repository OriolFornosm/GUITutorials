package Tutorials;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Drawing {

	public static void main(String[] args) {
		MyJFrame4 window4 = new MyJFrame4();

	}

}

class MyJFrame4 extends JFrame {
	
	public MyJFrame4() {
		
		setTitle("Drawing Test");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		MyPanel2 mySquare = new MyPanel2();
		add(mySquare);
		
		
	}
	
}

class MyPanel2 extends JComponent {
	
	public void paintComponent(Graphics g) {		
		super.paintComponent(g);
		
		// You can paint different shapes using JComponent methods.
		g.drawRect(50, 50, 200, 200);
		
		g.drawLine(100, 100, 300, 200);
		
		g.drawArc(200, 200, 100, 100, 120, 120);
	
		// There is a more modern and advanced library to do so, called Java Graphics2D
		
		// In order to use it you will need to refund Graphics object g as Graphics2D.
		Graphics2D g2 = (Graphics2D) g;
		
		// Instantiate Rectangle2D class
		Rectangle2D MyRectagle = new Rectangle2D.Double(100, 100, 200, 150);
		
		// As it takes a Shape object, and Graphics2D object g2 is by inheritance from Shape
		// You can use methods like draw from the g2 object and input your rectangle2D instance as parameter
		g2.draw(MyRectagle);
		
		
		//Another example with an ellipse
		
		Ellipse2D MyEllipse = new Ellipse2D.Double(250,250,200,150);
		
		g2.draw(MyEllipse);
		
		// You can even instantiate directly in the draw method
		g2.draw(new Line2D.Double(
				100, 100, 300, 250));
	}
	
	
	
}
