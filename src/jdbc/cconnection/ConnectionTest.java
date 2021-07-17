package jdbc.cconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		
		
		Connection con=CreateDBConnection.getConnetion();
		if(con!=null)
		{
			System.out.println("DATABASE CONNECTED");
			
			PreparedStatement psmt=con.prepareStatement("select * from registration");
			ResultSet rs=psmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString("name"));
				System.out.print(rs.getString("pass"));
				System.out.print(rs.getString("email"));
			}
		}
		else {
			System.out.println("I AM NOT CONNECTED");
		}
		//con.close();
	}

}
