import java.util.Scanner;
import java.util.Stack;

    public class main {
	
	
	static Scanner scanner1=new Scanner(System.in);
     public static void main(String[]args) {
    	 
    	 System.out.println("\n---------Welcome---------");
		 boolean login=true;
		 while(login=true) {
			 System.out.println("Please Enter the database url  :");
			 String url=scanner1.next();
			 System.out.println("Please Enter the database user :");
			 String user=scanner1.next();
			 try {
				 if(!url.equals("jdbc:sqlserver://localhost:1433;databaseName=GroceriesShopSystem;encrypt=true;trustServerCertificate=true")) {
					 throw new Exception("Url is Not found");
				 }}
	 		 catch(Exception e) {
				 System.out.println("Exception :"+e.getMessage());
				 continue;}
				 
			 try {
				 if(!user.equals("sa")) {
					 throw new Exception("User Name is Not found");
				 }}
			 
	 		 catch(Exception x) {
				 System.out.println("Exception :"+x.getMessage());
				 continue;
			 }
			if (user.equals("sa")) {
				System.out.println("Please Enter the database Password:");
				String root=scanner1.next();
				
			try {
				if(url.equals("jdbc:sqlserver://localhost:1433;databaseName=GroceriesShopSystem;encrypt=true;trustServerCertificate=true")&&user.equals("sa")&&root.equals("root"))
				{
			     System.out.println("Connnections Done successfully");
				}
				else {
					login=false;
					throw new Exception("password is Not found");
				}
				}
			 catch(Exception s) {
				 System.out.println("Exception :"+s.getMessage());
				 continue;
			 }    
		     
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	boolean isExitMenu1=true;
	while(isExitMenu1) {
    	 for(String m :menu.showMainMenu()) {
    		 System.out.println(m);
    	 }
    	 
	 int option=scanner1.nextInt();
	
	 
	

	 switch(option){
	
	 case 1:
			
    	 for(String m :menu.showSubMenu1()) {
    		 System.out.println(m);
    	 }
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
    			 
    			 isExitMenu1=true;
    			
    		 }
    		 break;
    		 
		 
	 case 2:
		 for(String m :menu. showSubMenu2()) {
    		 System.out.println(m);
    	 }
		 int option3=scanner1.nextInt();
			
			 boolean isExitMenu3=true;
			 switch(option3){
			 
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
				 isExitMenu1=true;
				 
			 }
		
		 
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
		 ProgramStatistics.getHistory();
		 
		 break;
		 
	 case 8:
		 isExitMenu1=false;

		 
		 
		 
	
	}}

	
	
	
	
}}}}

