import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Search {
	static Scanner scanner1=new Scanner(System.in);
	static String url = "jdbc:sqlserver://localhost:1433;databaseName=GroceriesShopSystem;encrypt=true;trustServerCertificate=true";
	static String user = "sa";
	static String pass = "root";
	
	public static void searchinOfInvoice() {
		
			
			
			 Connection con = null;
				 try{
					 Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
					 DriverManager.registerDriver(driver);

			         // Reference to connection interface
			         con = DriverManager.getConnection(url, user,
			                 pass);

			         // Creating a statement
			         Statement st = con.createStatement();
			         System.out.println("Please Enter the Invoice_No:");
			         int userinput=scanner1.nextInt();
			         int count=0;
			         String sql="SELECT* FROM Customer INNER JOIN Item ON Customer.Item_id = Item.id where Invoice_No='"+userinput+"'";
				     ResultSet result=st.executeQuery(sql);
				     while(result.next()) {
				    	
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
				    	
				    
		 
				    
		   	  System.out.println(Invoice_No+" "+Invoice_date+" "+Customer_Name+" "+Number_Of_Items+" "+Total_Amount+" "+Balance+" "+Item_Name+" "+Unit_price+" "+Quntity+" "+Qty);
		   	
		      
		      
		  }}
		  catch (Exception ex) {

		      System.err.println(ex);
			 
		
		
		
		

}}}
