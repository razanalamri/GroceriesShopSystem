import java.io.Serializable;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class newInvoice implements Serializable{
	static Scanner scanner1=new Scanner(System.in);
	static String url = "jdbc:sqlserver://localhost:1433;databaseName=GroceriesShopSystem;encrypt=true;trustServerCertificate=true";
	static String user = "sa";
	static String pass = "root";
 public static void addingNewInvoice() {
	
			
	 
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
		 
	 }}
}
