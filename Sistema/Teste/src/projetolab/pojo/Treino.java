package projetolab.pojo;

public class Treino {
	
	private String exercicio;
	private int serie;
	private int repeticao;
	
	public Treino(String exercicio, int serie, int repeticao) {
		super();
		this.exercicio = exercicio;
		this.serie = serie;
		this.repeticao = repeticao;
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

	@Override
	public String toString() {
		return String.format("Treino [exercicio=%s, serie=%s, repeticao=%s]",
				exercicio, serie, repeticao);
	}
	
	

}
