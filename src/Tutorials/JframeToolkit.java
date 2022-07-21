package Tutorials;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

public class JframeToolkit {

	public static void main(String[] args) {
		
		// Instantiate a myJframe object using its constructor where we define the properties of the window.
		myJframe2 window2 = new myJframe2();
		
		window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window2.setVisible(true);

	}

}

class myJframe2 extends JFrame {
	
	public myJframe2() {
		
		// Toolkit is an abstract class that can detect every system characteristics.
		// In this case will be used to get the screen size.
		
		// First let's instantiate creating a toolkit and using the constructor getDefaultToolkit.
		
		Toolkit myScreen = Toolkit.getDefaultToolkit();
		
		// To store your screen resolution you will need to create a Dimension type object and assign myscreen object as a constructor
		// using the method, getScreenSize
		
		Dimension myScreenSize = myScreen.getScreenSize();
		
		// Dimension class have the height and width of the screen in two different variables.
		
		// You can reassign those to variables of your own
		
		int screenHeight = myScreenSize.height;
		int screenWidth = myScreenSize.width;
		
		// Now you can use these variables to set size of elements or even to set a location related to any screen.
		
		setSize(screenWidth/2, screenHeight/2); // Make the window half of your screen.
		
		setLocation(screenWidth/4, screenHeight/4); // Put it in the center.
		
		setTitle("Center Window");
		
		// Changing the little Java icon that shows by default on jFrames
		
		// First create a myIcon variable and assign it to myScreen object using Toolkit class method getImage, passing the path
		Image myIcon = myScreen.getImage("src/Tutorials/icon.png");
		
		// Use Jframe method setIconImage that needs as an argument an Image type of object.
		setIconImage(myIcon);
		
		
	}
}
