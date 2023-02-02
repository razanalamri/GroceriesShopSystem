
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class newItem {
	static Scanner scanner1 = new Scanner(System.in);
	static String url = "jdbc:sqlserver://localhost:1433;databaseName=GroceriesShopSystem;encrypt=true;trustServerCertificate=true";
	static String user = "sa";
	static String pass = "root";

	public static void addingNewItem() {

		System.out.println("Please Enter the New Item Name");
		String Item_Name = scanner1.next();
		System.out.println("Please Enter Unit price");
		float Unit_price = scanner1.nextFloat();
		System.out.println("Please Enter the Quntity");
		Integer Quntity = scanner1.nextInt();
		float Qty = Unit_price / Unit_price;

		String sql = "insert into Item values('" + Item_Name + "', '" + Unit_price + "', '" + Quntity + "', '" + Qty
				+ "')";
		Connection con = null;
		try {

			Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			DriverManager.registerDriver(driver);

			con = DriverManager.getConnection(url, user, pass);

			Statement st = con.createStatement();

			int m = st.executeUpdate(sql);
			if (m >= 0)
				System.out.println("Data insearted successfully Into Items Table");
			else
				System.out.println("insert failed");

			con.close();
		} catch (Exception ex) {

			System.err.println(ex);

		}
	}
}


