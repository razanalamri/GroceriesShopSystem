import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReportAllItems {
	static Scanner scanner1=new Scanner(System.in);
	static String url = "jdbc:sqlserver://localhost:1433;databaseName=GroceriesShopSystem;encrypt=true;trustServerCertificate=true";
	static String user = "sa";
	static String pass = "root";
	
	public static void ReportItems() {
		
		
		 Connection con = null;
			 try{
				 Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
				 DriverManager.registerDriver(driver);

		         // Reference to connection interface
		         con = DriverManager.getConnection(url, user,
		                 pass);

		         // Creating a statement
		         Statement st = con.createStatement();
		         System.out.println("Please Enter the number of rows :");
		         int userinput=scanner1.nextInt();
		         int count=0;
		         String sql="SELECT * FROM Item";
			     ResultSet result=st.executeQuery(sql);
			     while(result.next()&&count<userinput) {
			    	 
			    	 String Item_Name=result.getString("Item_Name");
			    	 float Unit_price=result.getFloat("Unit_price");
			    	 Integer Quntity=result.getInt("Quntity");
			    	 float Qty=result.getFloat("Qty");
			    	
			    	 
	   	  System.out.println(Item_Name+" "+Unit_price+" "+Quntity+" "+Qty);
	   	  count++;
	      
	      
	  }}
	  catch (Exception ex) {

	      System.err.println(ex);
		 
	}}
		
		
	}


