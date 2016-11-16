
package mysqltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;


/**
 * @ClassName: MySQLUtils
 * @Description: the class is used to help the operation of mysql
 * @author benji
 */
public class MySQLUtils {
	public static void main(String[] args) {
		getConnection();
	}
	private static Logger logger=Logger.getLogger("MySQLUtils");
	// mysql driver 
	private static String driver = "com.mysql.jdbc.Driver";

	// mysql url
	private static String url = "jdbc:mysql://localhost:3306/user?useUnicode=true&characterEncoding=UTF8";

	// the name of mysql
	private static String mysql_Name = "mysql";

	// encoding type in mysql
	private static String encode = "useUnicode=true&characterEncoding=UTF8";

	// username
	private static String username = "root";

	// password
	private static String password = "123456";

	/**
	 * @Title: getUsers  
	 * @Description: TODO
	 * @param @return     
	 * @return List<User>   
	 * @throws
	 */
	public static List<User> getUsers()
	{
		List<User> users=new ArrayList<>();
		Connection connection=getConnection();
		String sql="select * from users";
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			ps=connection.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				
				System.out.println(rs.getString(2)+rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally
			{
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					
				}
			}
		}
		return users;
				
	}
	/**
	 * @Title: getConnecton
	 * @Description: the method is used to get the connection in mysql
	 * @param:
	 * @return Connection锛歵he java.sql.connection 
	 * 
	 */
	private static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(driver);
			logger.info("Loading driver successfully ");
			connection=DriverManager.getConnection(url, username, password);
			System.out.println(connection==null);
		} catch (Exception e) {
			logger.error(e.getMessage());
			
		}
		return connection;
	}
	
	
}
