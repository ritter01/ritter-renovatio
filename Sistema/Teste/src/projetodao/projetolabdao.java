package projetodao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import projetolab.pojo.Aluno;

public class projetolabdao {
	
	public Aluno findAlunoByName(String name){
	
	Aluno aluno = null;
	
	String cmd = "select * from alunos where nome= ?";

	Connection db = null;
	PreparedStatement st = null;
	ResultSet rs = null;
	
	
	try{
		
		Properties props = new Properties();
		props.load(new FileInputStream("Banco.properties"));
		String url = props.getProperty("url");

		db = DriverManager.getConnection(url, props);

		st = db.prepareStatement(cmd);
		st.setString(1, nome);
		rs = st.executeQuery();
		
		
	/*Properties props = new Properties();
	props.load(new FileInputStream("Banco.properties"));
	String url = props.getProperty("url");

	Connection db = DriverManager.getConnection(url, props);
	System.out.println("Conectado!");
	
	db = DriverManager.getConnection(url, props);

	st = db.prepareStatement(cmd);
	st.setString(1, nome);
	rs = st.executeQuery();
	
	//consulta toda a tabela
	//String cmd = "select * from alunos";
	//PreparedStatement st = db.prepareStatement(cmd);
	
	
	//consulta um determinado elemento
	/*String nome = "Julia";
	String cmd = "select * from alunos where nome = ?";
	PreparedStatement st = db.prepareStatement(cmd);
	st.setString(1, nome); //parametros do elemento*/
	
	//ResultSet rs = st.executeQuery();
	
	while (rs.next()) {
	    System.out.println(rs.getString(1));
	    System.out.println(rs.getString(2));
	    System.out.println(rs.getString(3));
	}
	rs.close();
	st.close();
	}
	catch (Exception e){
		e.printStackTrace();}
	finally {
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
		}}
	return aluno;
	}
}
