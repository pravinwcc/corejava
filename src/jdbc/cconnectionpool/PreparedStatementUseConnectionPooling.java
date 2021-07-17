package jdbc.cconnectionpool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
public class PreparedStatementUseConnectionPooling {
	public static void main(String... arg) throws SQLException {

		ConnectionPool connectionPool = new ConnectionPool("oracle.jdbc.driver.OracleDriver",
				"jdbc:oracle:thin:@localhost:1521:orcl", "ankit", "Oracle123", 5, 10, true);

		Connection con = connectionPool.getConnection();
		System.out.println("We have got connection from ConnectionPool class");

		PreparedStatement prepStmt = con.prepareStatement("select ID, NAME from EMPLOYEE");

		ResultSet rs = prepStmt.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getInt("ID") + " ");
			System.out.println(rs.getString("NAME"));
		}

		if (rs != null)
			rs.close(); // close resultSet
		if (prepStmt != null)
			prepStmt.close(); // close PreparedStatement

		connectionPool.free(con);
		System.out.println("We have free/released connection to ConnectionPool class");
	}
}