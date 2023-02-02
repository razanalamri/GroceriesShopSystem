import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class insertingData {
	static Scanner scanner1=new Scanner(System.in);
	static String url = "jdbc:sqlserver://localhost:1433;databaseName=GroceriesShopSystem;encrypt=true;trustServerCertificate=true";
	static String user = "sa";
	static String pass = "root";
	
	
	public static void insertingDataIntoItemTable() {
	
 	 System.out.println("Please type the number of rows");
     int userinput =scanner1.nextInt();
     for(int i=1; i<=userinput;i++) {
     System.out.println("Please Enter Item_Name");
     String Item_Name=scanner1.next();
     System.out.println("Please Enter Unit price");
     float Unit_price=scanner1.nextFloat();
     System.out.println("Please Enter the Quntity");
     Integer Quntity=scanner1.nextInt();
     System.out.println("Please Enter the Qty");
     float Qty=scanner1.nextFloat();

   
     String sql = "insert into Item(Item_Name,Unit_price,Quntity,Qty)VALUES(?,?,?,?)";
  			Connection con = null;
  	

  			
  			try { 
  				Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
  				DriverManager.registerDriver(driver);
  				con = DriverManager.getConnection(url, user, pass);
  				PreparedStatement ps = con.prepareStatement(sql);
  				ps.setString(1, Item_Name);
  				ps.setFloat(2, Unit_price);
  				ps.setFloat(3, Quntity);
  				ps.setFloat(4, Qty);
  			
  				ps.executeUpdate();

  	       
  	        
  	             System.out.println("Data insearted successfully Into Items Table");
  	  
  
         con.close();
     }
     catch (Exception ex) {

         System.err.println(ex);
	 
 }}}
	
	
	
	
	public static void insertingDataIntoCustomerTable() {
		
	 	 System.out.println("Please type the number of rows");
	     int userinput =scanner1.nextInt();
	     for(int i=1; i<=userinput;i++) {
	     System.out.println("Please Enter Invoice No");
	     Integer Invoice_No=scanner1.nextInt();
	     System.out.println("Please Enter Invoice date");
	     String Invoice_date=scanner1.next();
	     System.out.println("Please Enter Customer Name");
	     String Customer_Name=scanner1.next();
	     System.out.println("Please Enter the Phone Number");
	     Integer Phone_Number=scanner1.nextInt();
	     System.out.println("Please Enter the Number Of Items");
	     Integer Number_Of_Items=scanner1.nextInt();
	     System.out.println("Please Enter Total Amount");
	     float Total_Amount=scanner1.nextFloat();
	     System.out.println("Please Enter Paid Amount");
	     float Paid_Amount=scanner1.nextFloat();
	     System.out.println("Please Enter the Balance");
	     float Balance=scanner1.nextFloat();
	
	   
	     String sql = "insert into Customer(Invoice_No,Invoice_date,Customer_Name,Phone_Number,Number_Of_Items,Total_Amount,Paid_Amount,Balance)VALUES(?,?,?,?,?,?,?,?)";
			Connection con = null;
	

			
			try { 
				Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
				DriverManager.registerDriver(driver);
				con = DriverManager.getConnection(url, user, pass);
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, Invoice_No);
				ps.setString(2, Invoice_date);
				ps.setString(3, Customer_Name);
				ps.setInt(4, Phone_Number);
				ps.setInt(5, Number_Of_Items);
				ps.setFloat(6, Total_Amount);
				ps.setFloat(7, Paid_Amount);
				ps.setFloat(8, Balance);
				ps.executeUpdate();

	       
	        
	             System.out.println("Data insearted successfully Into Customers Table");
	  

	         
	         con.close();
	     }
	     catch (Exception ex) {

	         System.err.println(ex);
		 
	 }}}
	
	public static void insertingDataIntoShopTable() {
		
	 	 System.out.println("Please type the number of rows");
	     int userinput =scanner1.nextInt();
	     for(int i=1; i<=userinput;i++) {
	     System.out.println("Please Enter Shop Name");
	     String Shop_Name=scanner1.next();


	   
	     String sql = "insert into Shop(Shop_Name)VALUES(?)";
			Connection con = null;
	

			
			try { 
				Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
				DriverManager.registerDriver(driver);
				con = DriverManager.getConnection(url, user, pass);
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1,Shop_Name);
				ps.executeUpdate();

	       
	     
	             System.out.println("Data insearted successfully Into Shop Table");
	       

	         
	         con.close();
	     }
	     catch (Exception ex) {

	         System.err.println(ex);
		 
	 }}}
	
	
	
	public static void insertingDataIntoHeaderTable() {
		
	 	 System.out.println("Please type the number of rows");
	     int userinput =scanner1.nextInt();
	     for(int i=1; i<=userinput;i++) {
	     System.out.println("Please Enter Telephone Number");
	     String Tel=scanner1.next();
	     System.out.println("Please Enter Fax Number");
	     String Fax=scanner1.next();
	     System.out.println("Please Enter Email");
	     String Email=scanner1.next();
	     System.out.println("Please Enter website");
	     String Website=scanner1.next();

	     
	   
			String sql = "insert into Header(Tel,Fax,Email,Website)VALUES(?,?,?,?)";
			Connection con = null;
	

			
			try { 
				Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
				DriverManager.registerDriver(driver);
				con = DriverManager.getConnection(url, user, pass);
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, Tel);
				ps.setString(2, Fax);
				ps.setString(3, Email);
				ps.setString(4, Website);
				ps.executeUpdate();

	       
	        
	     
	             System.out.println("Data insearted successfully Into Header Table");
	      
	            

	         
	         con.close();
	     }
	     catch (Exception ex) {

	         System.err.println(ex);
		 
	 }}}
		

	
	
	

}
