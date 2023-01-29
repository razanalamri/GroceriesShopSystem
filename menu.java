import java.util.Scanner;

public class menu {
	
	static Scanner scanner1=new Scanner(System.in);

	public static void showMenu(){
	System.out.println("Welcome");
	System.out.println("1- Shop Settings");
	System.out.println("2- Manage Shop Items");
	System.out.println("3- Create New Invoice");
	System.out.println("4- Report: Statistics");
	System.out.println("5- Report: All Invoices");
	System.out.println("6- Search (1) Invoice");
	System.out.println("7- Program Statistics");
	System.out.println("8- Exit");
	
	 
	 int option=scanner1.nextInt();
	 
	 
	 
	 switch(option){
	 
	 case 1:
		 showSubMenu1();
		 break;
		 
	 case 2:
		 showSubMenu2();
		 
		 break;
		 
	 case 3:
		 newInvoice.addingNewInvoice();
		 
		 break;
		 
	 case 4:
		 reportOfInvoice.ReportStatisticsItems();
		 
		 break;
		 
	 case 5:
		 reportOfInvoice.ReportAllItems();
		 break;
		 
		 
	 case 6:
		 Search.searchinOfInvoice();
		 
		 break;
		 
	 case 7:
		 
		 break;
		 
	 case 8:
		 
		 
		 
	
	}}
	
	
	public static void showSubMenu1() {
		System.out.println("1- Load Data");
		System.out.println("2- Set Shop Name");
		System.out.println("3- Set Invoice Header");
		System.out.println("4- Go Back");
		int option2=scanner1.nextInt();
		 switch(option2){
		 
		 case 1:
			 insertingData.insertingDataIntoItemTable();
			 insertingData.insertingDataIntoCustomerTable();
			 break;
			 
		 case 2:
			 insertingData.insertingDataIntoShopTable();
			 break;
			 
		 case 3:
			 insertingData.insertingDataIntoHeaderTable();
			 
			 break;
			 
		 case 4:
			 
		 }}
		
		 
			public static void showSubMenu2() {
				System.out.println("1- Add Items");
				System.out.println("2- Delete Items");
				System.out.println("3- Change Item Price");
				System.out.println("4- Report All Items");
				System.out.println("5- Go Back");
				
				int option2=scanner1.nextInt();
				 switch(option2){
				 
				 case 1:
					 newItem.addingNewItem();
					 
					 
					 break;
					 
				 case 2:
					deleteItem.deleteItem();
					 
					 break;
					 
				 case 3:
					 changeprice.changingPriceOfItem();
					 
					 break;
					 
				 case 4:
					 ReportAllItems.ReportItems();
					 
					 break;
					 
				 case 5 :
					 
				 }
	 
	}
	
}
