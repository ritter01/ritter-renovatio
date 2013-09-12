package start;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//private static final long serialVersionUID = 1L;


public class CarregaPanel extends JPanel {
	
	public CarregaPanel(){
	
	 JLabel label = new JLabel("Hello World");
     setLayout(new FlowLayout());     
     add(label);
     
         
     JTextField textfield = new JTextField("Escreva seu nome:");
     add(textfield);
     
     JButton button = new JButton("Click aqui!");
     add(button);

}
}

