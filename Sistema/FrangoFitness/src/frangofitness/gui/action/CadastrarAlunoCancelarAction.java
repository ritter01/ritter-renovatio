package frangofitness.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import GUI.CadastrarAlunoPanel;

public class CadastrarAlunoCancelarAction extends AbstractAction {
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
	public CadastrarAlunoCancelarAction(CadastrarAlunoPanel panel) {
		super("Cancelar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		panel.clear();
	}

}

