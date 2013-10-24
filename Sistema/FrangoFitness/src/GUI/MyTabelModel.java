package GUI;

	import java.util.List;

	import javax.swing.table.AbstractTableModel;

	import projetodao.projetolabdao;
	import projetolab.pojo.Aluno;
	import projetolab.pojo.Treino;

	//FIXME: a tela apresenta apenas uma linha, sem conte�do
	public class MyTabelModel extends AbstractTableModel {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private Aluno a;
		private List<Treino> tr;

		public MyTabelModel(Aluno a) {
			this.a = a;
			projetolabdao dao = new projetolabdao();
			tr = dao.findTreinoByAluno(a);
		}

		@Override
		public int getColumnCount() {
			return 3;
		}

		@Override
		public int getRowCount() {
			return tr.size();
		}
		

		@Override
		public Object getValueAt(int lin, int col) {
			System.out.println(lin);
			Treino t = tr.get(lin);
			switch (col) {
			case 0:
				return t.getExercicio();
			case 1:
				return t.getSerie();
			case 2:
				return t.getRepeticao();
			default:
				return "*ERRO*";
			}
		}

	}

