package Tutorials;

import java.awt.Frame;

import javax.swing.*;

public class Jframe {
	public static void main(String[] args) {
		
		// Instantiate the class creating a new object called window using the constructor myJframe.
		
		myJframe window = new myJframe();
		
		// You could also set properties here. Eg: window.setVisible(true);

	}

}

//Create an additional class that will extend from Jframe class on javax.swing.
class myJframe extends JFrame {
	
	// Create a constructor.
	public myJframe() {
		
		setSize(800, 600); // Define window size.
		
		// setLocation(500,300); // Set the location of the window
		
		// Alternative
		//setBounds(800, 600, 500, 300); Allows to set size and location of the window.
		
		setVisible(true); //Define visibility
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define what happens when you close it.
		
		setResizable(true); // Enables/disables the possiblity to change the window size.
		
		//setExtendedState(Frame.MAXIMIZED_BOTH); // Allows to run it in fullscreen mode.
		

		setTitle("window"); // Allow to put a title in the JFrame. 

	}
}

