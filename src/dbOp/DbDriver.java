package dbOp;

import java.sql.*;
import java.util.*;

public class DbDriver {
	private static String url = "jdbc:mysql://localhost/CarLease";
	private static String user = "root";
	private static String pswd = "123456";
	private static int total = 20;
	private static int now = 0;
	private static List<Connection> list;

	static {
		list = new ArrayList<Connection>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < total; i++) {
			try {
				list.add(DriverManager.getConnection(
						url + "?user=" + user + "&password=" + pswd + "&useUnicode=true&characterEncoding=utf-8"));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static Statement createStatement() throws SQLException{
		int flag = now;
		now = now + 1;
		return list.get(flag).createStatement();
	}
}
