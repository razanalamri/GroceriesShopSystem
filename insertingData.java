import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
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
     float Qty=Unit_price*Quntity;

   
     String sql = "insert into Item values('"+Item_Name+"', '"+Unit_price+"', '"+Quntity+"', '"+Qty+"')";
     Connection con = null;
     try {

         Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
   
         DriverManager.registerDriver(driver);

       
         con = DriverManager.getConnection(url, user,
                 pass);

       
         Statement st = con.createStatement();

       
         int m = st.executeUpdate(sql);
         if (m >=  0)
             System.out.println("Data insearted successfully Into Items Table");
         else
             System.out.println("insert failed");

         
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
	     float Balance=Paid_Amount-Total_Amount;
	
	   
	     String sql = "insert into Customer values('"+Invoice_No+"', '"+Invoice_date+"', '"+Customer_Name+"', '"+Phone_Number+"','"+Number_Of_Items+"', "
	     		+"'"+Total_Amount+"', '"+Paid_Amount+"', '"+Balance+"')";
	     Connection con = null;
	     try {

	         Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
	   
	         DriverManager.registerDriver(driver);

	       
	         con = DriverManager.getConnection(url, user,
	                 pass);

	       
	         Statement st = con.createStatement();

	       
	         int m = st.executeUpdate(sql);
	         if (m >=  0)
	             System.out.println("Data insearted successfully Into Customers Table");
	         else
	             System.out.println("insert failed");

	         
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


	   
	     String sql = "insert into Shop values('"+Shop_Name+"')";
	     Connection con = null;
	     try {

	         Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
	   
	         DriverManager.registerDriver(driver);

	       
	         con = DriverManager.getConnection(url, user,
	                 pass);

	       
	         Statement st = con.createStatement();

	       
	         int m = st.executeUpdate(sql);
	         if (m >=  0)
	             System.out.println("Data insearted successfully Into Shop Table");
	         else
	             System.out.println("insert failed");

	         
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


	     String sql = "insert into Header values('"+Tel+"','"+Fax+"','"+Email+"','"+Website+"')";
	     Connection con = null;
	     try {

	         Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
	   
	         DriverManager.registerDriver(driver);

	       
	         con = DriverManager.getConnection(url, user,
	                 pass);

	       
	         Statement st = con.createStatement();

	       
	         int m = st.executeUpdate(sql);
	         if (m >=  0)
	             System.out.println("Data insearted successfully Into Header Table");
	         else
	             System.out.println("insert failed");

	         
	         con.close();
	     }
	     catch (Exception ex) {

	         System.err.println(ex);
		 
	 }}}
		

	
	
	

}
