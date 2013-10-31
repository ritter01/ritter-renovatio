package GUI;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import frangofitness.gui.action.CadastrarAlunoAction;
import frangofitness.gui.action.CadastrarAlunoCancelarAction;
import projetolab.pojo.Aluno;


/**
 * 
 * @author marco.mangan@gmail.com
 *
 */
public class CadastrarAlunoPanel extends JPanel {
	/**
	 * 
	 */

	
	public JFrame getFrame() {
		return frame;
	}

	public CardLayout getCard() {
		return card;
	}
	

	private static final long serialVersionUID = 1L;

	private JTextField nome;
	private JTextField idade;
	private JTextField endereco;
	
	private JFrame frame;

	private CardLayout card;

	/**
	 * 
	 * @return
	 */
	public Aluno getAluno() {
		return new Aluno(nome.getText(),idade.getText(),endereco.getText());
	}

	public void clear() {
		nome.setText("");
		idade.setText("");
		endereco.setText("");
	}


	/**
	 * 
	 */
	public CadastrarAlunoPanel(JFrame frame, CardLayout card) {
		JLabel label;

		this.frame = frame;
		this.card = card;

		setLayout(new FlowLayout());

		label = new JLabel("Nome");
		add(label);
		nome = new JTextField(10);
		label.setLabelFor(nome);
		add(nome);

		label = new JLabel("Idade");
		add(label);
		idade = new JTextField(10);
		label.setLabelFor(idade);
		add(idade);

		label = new JLabel("Endereço");
		add(label);
		endereco = new JTextField(10);
		label.setLabelFor(endereco);
		add(endereco);

		JButton button;

		button = new JButton(new CadastrarAlunoAction(this));
		button.setToolTipText("Cadastrar Aluno");
		button.setMnemonic(KeyEvent.VK_C);
		add(button);

		button = new JButton(new CadastrarAlunoCancelarAction(this));
		button.setToolTipText("Cancelar cadastro de aluno");
		button.setMnemonic(KeyEvent.VK_N);
		add(button);		
	}
}