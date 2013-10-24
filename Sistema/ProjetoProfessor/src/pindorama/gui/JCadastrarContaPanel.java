package pindorama.gui;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pindorama.gui.action.CadastrarContaAction;
import pindorama.gui.action.CadastrarContaCancelarAction;
import pindorama.pojo.Conta;

/**
 * 
 * @author marco.mangan@gmail.com
 *
 */
public class JCadastrarContaPanel extends JPanel {
	public JFrame getFrame() {
		return frame;
	}

	public CardLayout getCard() {
		return card;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField cpf;
	private JTextField nome;
	private JTextField numero;

	private JFrame frame;

	private CardLayout card;

	/**
	 * 
	 * @return
	 */
	public Conta getConta() {
		return new Conta(cpf.getText(), nome.getText(), numero.getText());
	}
	
	public void clear() {
		cpf.setText("");
		nome.setText("");
		numero.setText("");
	}


	/**
	 * @param card 
	 * @param frame 
	 * 
	 */
	public JCadastrarContaPanel(JFrame frame, CardLayout card) {
		JLabel label;
		
		this.frame = frame;
		this.card = card;

		setLayout(new FlowLayout());

		label = new JLabel("CPF");
		add(label);
		cpf = new JTextField(10);
		label.setLabelFor(cpf);
		add(cpf);

		label = new JLabel("Nome");
		add(label);
		nome = new JTextField(10);
		label.setLabelFor(nome);
		add(nome);

		label = new JLabel("Número");
		add(label);
		numero = new JTextField(10);
		label.setLabelFor(numero);
		add(numero);

		JButton button;
		
		button = new JButton(new CadastrarContaAction(this));
		button.setToolTipText("Cadastrar conta");
		button.setMnemonic(KeyEvent.VK_C);
		add(button);
		
		button = new JButton(new CadastrarContaCancelarAction(this));
		button.setToolTipText("Cancelar cadastro da conta");
		button.setMnemonic(KeyEvent.VK_N);
		add(button);		
	}
}
