package cn.web.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//用来连接数据库的工具类
public class JdbcUtils {
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	
	public static Connection getConnection ()	{
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "ZXcdma2000");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
}
