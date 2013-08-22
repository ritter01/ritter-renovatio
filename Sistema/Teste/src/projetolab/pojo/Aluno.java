package projetolab.pojo;

public class Aluno {
	
	

private String nome;
private int idade;
private String endereco;

public Aluno(String nome, int idade, String endereco) {
	super();
	this.nome = nome;
	this.idade = idade;
	this.endereco = endereco;
}

public String getNome() {
	return nome;
}

public int getIdade() {
	return idade;
}

public String getEndereco() {
	return endereco;
}

@Override
public String toString() {
	return String.format("Aluno [nome=%s, idade=%s, endereco=%s]", nome, idade,
			endereco);
}



}