package Tutorials;

import javax.swing.*;
import java.awt.*;

public class JPanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyJframe3 window3 = new MyJframe3();
	}

}

// We create the frame as in previous scripts
class MyJframe3 extends JFrame {	
	
	public MyJframe3() {		
		setBounds(400, 200, 800, 600);
		setTitle("Text Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// Instantiate the panel inside the JFrame
		
		MyPanel text = new MyPanel();
		// Now addit to the Jframe
		add(text);
	}
}

// Create another class that inherits JPanel
class MyPanel extends JComponent {
	// JPanel has a method to add elements that you can overwrite to make your own elements get drawn on the panel.	
	public void paintComponent(Graphics g) {
		// It uses a Graphic type parameter called g as an input.
		// First, as you are overwriting a method, you need to let it work with your element. If not this could cause errors.
		// To do so, you should call the 'super' constructor first.
		
		super.paintComponent(g);
		
		g.drawString("Hello World", 100, 100);
		
	}
	
}