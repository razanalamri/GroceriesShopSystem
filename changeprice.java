import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class changeprice {
	static Scanner scanner1=new Scanner(System.in);
	static String url = "jdbc:sqlserver://localhost:1433;databaseName=GroceriesShopSystem;encrypt=true;trustServerCertificate=true";
	static String user = "sa";
	static String pass = "root";

	
	public static void changingPriceOfItem() {
		
		 Connection con = null;
		 try{
			 Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			 DriverManager.registerDriver(driver);

	        // Reference to connection interface
	        con = DriverManager.getConnection(url, user,
	                pass);

	        // Creating a statement
	        Statement st = con.createStatement();
	     
	        System.out.println("Please Enter any id to Update the price :");
	        int userinput =scanner1.nextInt();
	        System.out.println("Please Enter the new price :");
	        float newprice =scanner1.nextFloat();
	   


	        String sql="UPDATE Item SET Unit_price='"+newprice+"' WHERE id='"+userinput+"'";
		     ResultSet result=st.executeQuery(sql);
	 
	 
	}
	catch (Exception ex) {

	 System.err.println(ex);

	}
		
		
		
	}
	}
