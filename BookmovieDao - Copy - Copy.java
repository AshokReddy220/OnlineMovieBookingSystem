import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class BookmovieDao {
	private String dbUrl = "jdbc:oracle:thin:tiger/scott@localhost:1521:productDB";
	private String dbUname = "scott";
	private String dbPassword = "tiger";
	private String dbDriver = "oracle.jdbc.OracleDriver";
		
		public void loadDriver(String dbDriver)
		{
			try {
				Class.forName(dbDriver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public Connection getConnection()
		{
			Connection con = null;
			try {
				con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		}
		
		
		public ResultSet getMoviesList(MovieDetails member) throws SQLException
		{
			loadDriver(dbDriver);
			Connection con = getConnection();
			Statement statemnt1 = con.createStatement();
			ResultSet rs1 = statemnt1.executeQuery("Select * from movieslist");
            return rs1;
		}
}

