package frangofitness.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 
 * @author ritter.zc@gmail.com
 *
 */
public class SobreAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;

	public SobreAction(JFrame frame) {
		super("Sobre");
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Sobre");
		JOptionPane.showMessageDialog(frame, "v 2.0 - Frango Fitness.",
				"Sobre Frango Fitness - Alunos", JOptionPane.INFORMATION_MESSAGE);
	}

}