package jdbc.cconnection;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.ResourceBundle;

public class CreateDBConnection
{
	
	public static Properties loadPropertiesFile() throws Exception
	{
		
		Properties prop = new Properties();
        InputStream in = new FileInputStream("jdbc.properties");
        prop.load(in);
        in.close();
		return prop;
	}
	
	
	// Creating Greenplum Connetion
	public static Connection getConnetion()
	{
		Connection localConnection=null;
	  try 
	  {
		  Properties properties =loadPropertiesFile();
		  Class.forName(properties.getProperty("PostJDBC.driver"));
		  System.out.println("PostgreSQL Database detail--->"+properties.getProperty("PostJDBC.url"));
		  localConnection = DriverManager.getConnection(properties.getProperty("PostJDBC.url"),properties.getProperty("PostJDBC.username"),properties.getProperty("PostJDBC.password"));
	  }
	  catch (Exception e)
	  {
	  System.out.println("Exception in Greenplum Connection---->"+e);
	  }
	  return localConnection;
	}
	
	
	
}