package pindorama.pojo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 
 * @author marco.mangan@gmail.com
 * 
 */
public class Movimentacao {
	
	private int movimentacaoId;
	private Date data;
	private double valor;
	private String descricao;
	private int contaId;

	public Movimentacao(int movimentacaoId, int contaId, Date data, double valor, String descricao) {
		super();
		this.movimentacaoId = movimentacaoId;
		this.contaId = contaId;
		this.data = data;
		this.valor = valor;
		this.descricao = descricao;
	}	
	
	public Movimentacao(int contaId, Date data, double valor, String descricao) {
		super();
		this.movimentacaoId = -1;
		this.contaId = contaId;
		this.data = data;
		this.valor = valor;
		this.descricao = descricao;
	}
	
	public int getMovimentacaoId() {
		return movimentacaoId;
	}

	public Date getData() {
		return data;
	}
	public double getValor() {
		return valor;
	}
	public String getDescricao() {
		return descricao;
	}

	public int getContaId() {
		return contaId;
	}

	@Override
	public String toString() {
		DateFormat formatter = DateFormat.getDateTimeInstance(
                DateFormat.LONG, 
                DateFormat.LONG, 
                Locale.getDefault());
		return String
				.format("Movimentacao [movimentacaoId=%s, data=%s, valor=%s, descricao=%s, contaId=%s]",
						movimentacaoId, formatter.format(data), valor, descricao, contaId);
	}

	
}
