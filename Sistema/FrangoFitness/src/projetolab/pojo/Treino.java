package projetolab.pojo;

public class Treino {
	
	private int treinoID;
	private String exercicio;
	private int serie;
	private int repeticao;
	private int alunoID;
	
	public Treino(int treinoID, int alunoID,String exercicio, int serie, int repeticao) {
		super();
		this.treinoID = treinoID;
		this.alunoID = alunoID;
		this.exercicio = exercicio;
		this.serie = serie;
		this.repeticao = repeticao;
	}
	
	public Treino(int alunoID,String exercicio, int serie, int repeticao) {
		super();
		
		this.alunoID = alunoID;
		this.exercicio = exercicio;
		this.serie = serie;
		this.repeticao = repeticao;
	}
	
	public int gettreinoID() {
		return treinoID;
	}

	public String getExercicio() {
		return exercicio;
	}

	public int getSerie() {
		return serie;
	}

	public int getRepeticao() {
		return repeticao;
	}
	
	public int getalunoID() {
		return alunoID;
	}

	@Override
	public String toString() {
		return String
				.format("Treino [treinoID=%s, exercicio=%s, serie=%s, repeticao=%s, alunoID=%s]",
						treinoID, exercicio, serie, repeticao, alunoID);
	}

	
	
	

}
