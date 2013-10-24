package pindorama.gui.action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

import pindorama.gui.JCadastrarContaPanel;

public class CadastrarContaCancelarAction extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private JCadastrarContaPanel panel;

	/**
	 * 
	 * @param panel
	 */
	public CadastrarContaCancelarAction(JCadastrarContaPanel panel) {
		super("Cancelar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		panel.clear();
		CardLayout card = panel.getCard();
		JFrame frame = panel.getFrame();
		card.show(frame.getContentPane(), "Vazio");		
	}

}
