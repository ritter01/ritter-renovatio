package teste;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class jdbcteste {

	/**
	 * @param args
	 * @throws SQLException
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws SQLException,
			FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		Properties props = new Properties();
		props.load(new FileInputStream("Banco.properties"));
		String url = props.getProperty("url");

		Connection db = DriverManager.getConnection(url, props);
		System.out.println("Conectado!");

		String nome = "Julia";
		String cmd = "select * from alunos where nome = ?";
		PreparedStatement st = db.prepareStatement(cmd);
		st.setString(1, nome);

		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
		rs.close();
		st.close();
	}

}
