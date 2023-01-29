import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class reportOfInvoice {
	
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
			         String sql="SELECT Invoice_No,Number_Of_Items,Total_Amount FROM Customer";
				     ResultSet result=st.executeQuery(sql);
				     while(result.next()&&count<userinput) {
				    	
				    	Integer Invoice_No=result.getInt("Invoice_No");
				    	 Integer Number_Of_Items=result.getInt("Number_Of_Items");
				    	 float Total_Amount=result.getFloat("Total_Amount");
				    	
				    	
				    
		   	  System.out.println(Invoice_No+" "+Number_Of_Items+" "+Total_Amount);
		   	  count++;
		      
		      
		  }}
		  catch (Exception ex) {

		      System.err.println(ex);
			 
		}}
			
			
		}


