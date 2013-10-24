package pindorama.gui.action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

public class CadastrarAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JFrame frame;
	private CardLayout card;

	public CadastrarAction(JFrame frame, CardLayout card) {
		super("Cadastrar cliente");
		this.frame = frame;
		this.card = card;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {	
		card.show(frame.getContentPane(), "TelaCadastroCliente" );
	}
}
