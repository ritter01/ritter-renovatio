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
	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Properties props = new Properties();
		props.load(new FileInputStream("projetolab.properties"));
		String url = props.getProperty("url");

		Connection db = DriverManager.getConnection(url, props);
		System.out.println("Conectado!");
	}

}
