import java.sql.*;
public class jdbcteste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:postgresql://localhost:5432/projetolab";
		String username = "postgres";
		String password= "senacrs";
		
		Connection db = DriverManager.getConnection(url, username, password);

	}

}
