package pindorama.dao;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import pindorama.pojo.Conta;
import pindorama.pojo.Movimentacao;

/**
 * 
 * @author marco.mangan@gmail.com
 * 
 */
public class PindoramaDAO {

	public Conta findContaByCPF(String cpf) {
		Conta conta = null;
		String cmd = "select * from pdr_contas where cpf= ?";

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			// abrir conexão
			Properties props = new Properties();
			props.load(new FileInputStream("pindorama.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setString(1, cpf);
			rs = st.executeQuery();

			while (rs.next()) {
				// copiar dados para POJO
				int contaId = rs.getInt(1);
				String cpfBD = rs.getString("cpf");
				String nome = rs.getString(3);
				String numero = rs.getString(4);
				conta = new Conta(contaId, cpfBD, nome, numero);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return conta;
	}

	public void insertConta(Conta conta) {
		String cmd = "insert into pdr_contas(cpf, nome, numero) values (?, ?, ?)";

		Connection db = null;
		PreparedStatement st = null;

		try {
			// abrir conexão
			Properties props = new Properties();
			props.load(new FileInputStream("pindorama.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setString(1, conta.getCPF());
			st.setString(2, conta.getNome());
			st.setString(3, conta.getNumero());
			int r = st.executeUpdate();

			if (r != 1) {
				throw new RuntimeException("Erro ao inserir conta!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public List<Movimentacao> findMovimentacaoByConta(Conta c) {
		String cmd = "select * from pdr_movimentacoes where conta= ?";
		List<Movimentacao> mvs = new ArrayList<Movimentacao>();

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			Properties props = new Properties();
			props.load(new FileInputStream("pindorama.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setInt(1, c.getContaId());
			rs = st.executeQuery();

			while (rs.next()) {
				int movimentacaoId = rs.getInt(1);
				java.sql.Timestamp data = rs.getTimestamp(2);
				int contaIdBD = rs.getInt(3);
				double valor = rs.getDouble(4);
				
				String descricao = rs.getString(5);
				mvs.add(new Movimentacao(movimentacaoId,
						contaIdBD, 
						new java.util.Date(data.getTime()), 
						valor, 
						descricao));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return mvs;
	}

}
