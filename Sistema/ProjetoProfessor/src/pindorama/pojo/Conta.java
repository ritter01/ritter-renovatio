package pindorama.pojo;

/**
 * 
 * @author marco.mangan@gmail.com
 *
 */
public class Conta {

	private int contaId;
	private String cpf;
	private String nome;
	private String numero;

	public Conta(int contaId, String cpf, String nome, String numero) {
		super();
		this.contaId = contaId;
		this.cpf = cpf;
		this.nome = nome;
		this.numero = numero;
	}

	public Conta(String cpf, String nome, String numero) {
		super();
		this.contaId = -1;
		this.cpf = cpf;
		this.nome = nome;
		this.numero = numero;
	}	
	
	public int getContaId() {
		return contaId;
	}

	public String getCPF() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return String.format(
				"Conta [contaId=%s, cpf=%s, nome=%s, numero=%s]", contaId,
				cpf, nome, numero);
	}

}
