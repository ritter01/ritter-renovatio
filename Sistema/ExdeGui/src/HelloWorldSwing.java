import java.awt.Dimension;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class HelloWorldSwing {
	
	 private static void createAndShowGUI() {
	        //Create and set up the window.
	        JFrame frame = new JFrame("Fitness");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        
	        JPanel panel = new JPanel();
	        
	        frame.getContentPane().add(panel);
	       

	      //  frame.setPreferredSize(new Dimension(600,200));
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
	

}
