package frangofitness.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import projetodao.projetolabdao;
import GUI.CadastrarAlunoPanel;
import projetolab.pojo.Aluno;

/**
 * 
 * @author ritter.zc@gmail.com
 *
 */
public class CadastrarAlunoAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private CadastrarAlunoPanel panel;

	/**
	 * 
	 * @param panel
	 */
	public CadastrarAlunoAction(CadastrarAlunoPanel panel) {
		super("Cadastrar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Aluno a = panel.getAluno();
		//System.out.println(c);
		projetolabdao dao = new projetolabdao();
		dao.insertAluno(a);
	}
}