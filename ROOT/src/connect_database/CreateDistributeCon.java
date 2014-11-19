package connect_database;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateDistributeCon implements CreateConnection  {

	@Override
	public Connection createConnection(long selectValue) throws Exception {
		
		if(selectValue%2==0)
		{
			try
			{
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				
				Connection conn;
				String conString;
				
				conString = "jdbc:sqlserver://vtul0lsitd.database.windows.net:1433;"
						+ "database=db_moneymovement;"
						+ "user=passakornOD@vtul0lsitd;"
						+ "password=54T1I9E7w;"
						+ "encrypt=true;hostNameInCertificate=*.database.windows.net;"
						+ "loginTimeout=30;";
				conn = DriverManager.getConnection(conString);
				return conn;
			}
			
			
			
			
			
			catch(Exception ex)
			{
				ex.printStackTrace();
				throw(ex);
			}
		}
		else
		{
			try
			{
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				
				Connection conn;
				String conString;
				
				conString = "jdbc:sqlserver://p66lfv4crq.database.windows.net:1433;"
						+ "database=db_moneymovement;"
						+ "user=passakornOD@p66lfv4crq;"
						+ "password=54T1I9E7w;"
						+ "encrypt=true;hostNameInCertificate=*.database.windows.net;"
						+ "loginTimeout=30;";
				conn = DriverManager.getConnection(conString);
				return conn;
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				throw(ex);
			}
		}
	}
}
