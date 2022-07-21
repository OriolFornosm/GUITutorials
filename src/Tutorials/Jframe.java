package Tutorials;

import javax.swing.*;

public class Jframe {

	public static void main(String[] args) {
		
		// Instanciate the class creating a new object
		
		myJframe window = new myJframe();
		
		// You could also set properties here. Eg: window.setVisible(true);

	}

}

//Create an additional class that will extend from Jframe class on javax.swing.
class myJframe extends JFrame {
	
	// Create a constructor.
	public myJframe() {
		
		setSize(800, 600); //Define window size.
		setVisible(true); //Define visibility
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define what happens when you close it.
	}
}

