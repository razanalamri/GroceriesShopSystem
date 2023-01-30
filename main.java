import java.util.Scanner;
import java.util.Stack;

    public class main {
	
	static Stack stack1=new Stack(); 
	static Scanner scanner1=new Scanner(System.in);
     public static void main(String[]args) {
	boolean isExitMenu1=true;
	while(isExitMenu1) {
    	 for(String m :menu.showMainMenu()) {
    		 System.out.println(m);
    	 }
    	 
	 int option=scanner1.nextInt();
	 stack1.push(option);
	 
	

	 switch(option){
	
	 case 1:
			
    	 for(String m :menu.showSubMenu1()) {
    		 System.out.println(m);
    	 }
    		int option2=scanner1.nextInt();
    		stack1.push(option2);
    		
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
			stack1.push(option3);
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

	
	
	
	
}}

