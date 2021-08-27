    import java.sql.Connection;
	import java.sql.Driver;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class RegistrationDao {
		
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
		
		
		public String insert(UserRegistration member)
		{
			loadDriver(dbDriver);
			Connection con = getConnection();
			String result = "Data entered successfully";
			String sql = "insert into member values(?,?,?,?)";
			
			PreparedStatement ps;
			try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getFirst_name());
			ps.setString(2, member.getLast_name());
			ps.setString(3, member.getPassword());
			ps.setString(4, member.getUsername());
			ps.setString(5, member.getAddress());
			
			ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result = "Data not entered";
			}
			return result;
		}
}
