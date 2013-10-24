package pindorama.gui;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import pindorama.pojo.Conta;

public class JCadastroContaPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public JCadastroContaPanel() {
		
		//FIXME: teste com conta 1
		table = new JTable(new MyTableModel(new Conta(1,"", "", "")));
		add(table);

	}

}
