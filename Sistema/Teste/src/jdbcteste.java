import java.sql.*;
public class jdbcteste {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:postgresql://localhost:5432/projetolab";
		String username = "postgres";
		String password= "senacrs";
		
		Connection db = DriverManager.getConnection(url, username, password);

	}

}