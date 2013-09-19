package projetodao;

import projetolab.pojo.Aluno;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import projetolab.pojo.Aluno;

public class projetolabdao {

	public Aluno findAlunoByName(String name) {

		Aluno aluno = null;

		String cmd = "select * from alunos where nome= ?";

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {

			Properties props = new Properties();
			props.load(new FileInputStream("Banco.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setString(1, name);
			rs = st.executeQuery();

			while (rs.next())  {
				// copiar dados para POJO
				
				String nome = rs.getString(1);
				String idade = rs.getString(2);
				String endereco = rs.getString(3);
				aluno = new Aluno(nome, idade, endereco);
			}
			rs.close();
			st.close();
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
		return aluno;
	}
	
	public void insertAluno(Aluno aluno) {
		String cmd = "insert into projetolab_alunos(nome, idade, endereco) values (?, ?, ?)";

		Connection db = null;
		PreparedStatement st = null;

		try {
			// abrir conex�o
			Properties props = new Properties();
			props.load(new FileInputStream("Banco.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setString(1, aluno.getNome());
			st.setString(2, aluno.getIdade());
			st.setString(3, aluno.getEndereco());
			int r = st.executeUpdate();

			if (r != 1) {
				throw new RuntimeException("Erro ao inserir aluno!");
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
}

