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
		
		public static void ReportStatisticsItems() {
			
			
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
			
		
		public static void ReportAllItems() {
			
			
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
			         String sql="SELECT * FROM Customer JOIN Item ON Item.id = Customer.Item_id JOIN Shop ON Shop.id = Item.Shop_id JOIN Header ON Header.id = Shop.Header_id";
				     ResultSet result=st.executeQuery(sql);
				     while(result.next()&&count<userinput) {
				    	 
				    	 
				    	 
				    	 
				    	 
				    	 
				    	 
				    	
				    	Integer Invoice_No=result.getInt("Invoice_No");
				    	String Invoice_date=result.getString("Invoice_date");
				    	String Customer_Name=result.getString("Customer_Name");
				    	 Integer Number_Of_Items=result.getInt("Number_Of_Items");
				    	 float Total_Amount=result.getFloat("Total_Amount");
				    	 float Balance=result.getFloat("Balance");
				    	 String Item_Name=result.getString("Item_Name");
				    	 float Unit_price=result.getFloat("Unit_price");
				    	 Integer Quntity=result.getInt("Quntity");
				    	 float Qty=result.getFloat("Qty");
				    	 String Shop_Name=result.getString("Shop_Name");
				    	 String Tel=result.getString("Tel");
				    	 String Fax=result.getString("Fax");
				    	 String Email=result.getString("Email");
				    	 String Website=result.getString("Website");
			
				    	 System.out.println("Shop Name :"+Shop_Name);
				    	 System.out.println("Telephone :"+Tel+"------Fax :"+Fax+"-------Website :"+Website);
		   	  System.out.println(Invoice_No+" "+Invoice_date+" "+Customer_Name+" "+Number_Of_Items+" "+Total_Amount+" "+Balance+" "+Item_Name+" "+Unit_price+" "+Quntity+" "+Qty);
		   	  count++;
		      
		      
		  }}
		  catch (Exception ex) {

		      System.err.println(ex);
			 
		}}
		}


