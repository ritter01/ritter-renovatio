package pindorama.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 
 * @author marco.mangan@gmail.com
 *
 */
public class JDBCTest {

	// http://jdbc.postgresql.org/documentation/head/connect.html
	public static void main(String[] args) throws SQLException,
			FileNotFoundException, IOException {
		Properties props = new Properties();
		props.load(new FileInputStream("pindorama.properties"));
		String url = props.getProperty("url");

		Connection db = DriverManager.getConnection(url, props);
		System.out.println("Conectado!");

		String cpf = "123";
		String cmd = "select * from pdr_contas where cpf = ?";
		PreparedStatement st = db.prepareStatement(cmd);
		st.setString(1, cpf);
		ResultSet rs = st.executeQuery();
		
		while (rs.next()) {
		    System.out.println(rs.getString(1));
			System.out.println(rs.getString("cpf"));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
		}		
		
		rs.close();
		st.close();
	}
}
