package pindorama.gui.action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pindorama.dao.PindoramaDAO;
import pindorama.gui.JCadastrarContaPanel;
import pindorama.pojo.Conta;

/**
 * 
 * @author marco.mangan@gmail.com
 * 
 */
public class CadastrarContaAction extends AbstractAction {

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
	public CadastrarContaAction(JCadastrarContaPanel panel) {
		super("Cadastrar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			Conta c = panel.getConta();
			// System.out.println(c);
			PindoramaDAO dao = new PindoramaDAO();
			dao.insertConta(c);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(panel.getFrame(), "Erro #128");
		} finally {
			panel.clear();
			CardLayout card = panel.getCard();
			JFrame frame = panel.getFrame();
			card.show(frame.getContentPane(), "Vazio");
		}
	}
}
