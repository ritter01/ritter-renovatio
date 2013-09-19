package GUI;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
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
	private static final long serialVersionUID = 1L;

	private JTextField nome;
	private JTextField idade;
	private JTextField endereco;

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
	public CadastrarAlunoPanel() {
		JLabel label;

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

		label = new JLabel("Endere�o");
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