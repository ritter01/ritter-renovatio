package GUI;

import javax.swing.JPanel;
import javax.swing.JTable;

import GUI.MyTabelModel;
import projetolab.pojo.Aluno;

public class CadastroAlunoPanel extends JPanel {
	
	private JTable table;
	
public CadastroAlunoPanel() {
		
		//FIXME: teste com conta 1
		table = new JTable(new MyTabelModel(new Aluno("","", "")));
		add(table);

}
}
