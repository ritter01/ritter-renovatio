package projetolab.pojo;

import projetolab.pojo.Aluno;

public class Aluno {
	
	
private int alunoID;
private String nome;
private String idade;
private String endereco;

public Aluno(int alunoID, String nome, String idade, String endereco) {
	super();
	this.alunoID = alunoID;
	this.nome = nome;
	this.idade = idade;
	this.endereco = endereco;
}

public Aluno(String nome, String idade, String endereco) {
	super();
	
	this.nome = nome;
	this.idade = idade;
	this.endereco = endereco;
}

public int getalunoID() {
	return alunoID;
}

public String getNome() {
	return nome;
}

public String getIdade() {
	return idade;
}

public String getEndereco() {
	return endereco;
}

@Override
public String toString() {
	return String.format("Aluno [alunoID=%s, nome=%s, idade=%s, endereco=%s]",
			alunoID, nome, idade, endereco);
}





}
