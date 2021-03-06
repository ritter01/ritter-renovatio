package start;

import java.awt.Dimension;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class HelloWorldSwing {
	
	 private static void createAndShowGUI() {
	        //Create and set up the window.
	        JFrame frame = new JFrame("Fitness");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JMenuBar mb = new JMenuBar();
	        frame.setJMenuBar(mb);
	        JMenu arquivo = new JMenu("Arquivo");
	        mb.add(arquivo);
	        JMenuItem sair = new JMenuItem("Sair");
	        arquivo.add(sair);
	        
	        JPanel panel = new CarregaPanel();
	        
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
