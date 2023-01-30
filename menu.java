import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class menu {


	public static List<String> showMainMenu(){
		
		return Arrays.asList("1- Shop Settings","2- Manage Shop Items","3- Create New Invoice","4- Report: Statistics","5- Report: All Invoices",
		"6- Search (1) Invoice","7- Program Statistics","8- Exit");	
	}
	
	public static List<String> showSubMenu1(){
		
		return Arrays.asList("1- Load Data","2- Set Shop Name","3- Set Invoice Header","4- Go Back");
	
	}
	
	public static List<String> showSubMenu2(){
		
		return Arrays.asList("1- Add Items","2- Delete Items","3- Change Item Price","4- Report All Items","5- Go Back");
	
	}
	

}