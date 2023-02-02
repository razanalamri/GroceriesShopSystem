
public class Customer {
	public Item[] getItem() {
		return Item;
	}
	public void setItem(Item[] item) {
		Item = item;
	}
	public int getInvoice_No() {
		return Invoice_No;
	}
	public void setInvoice_No(int invoice_No) {
		Invoice_No = invoice_No;
	}
	public String getInvoice_date() {
		return Invoice_date;
	}
	public void setInvoice_date(String invoice_date) {
		Invoice_date = invoice_date;
	}
	public String getCustomer_Name() {
		return Customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public String getPhone_Number() {
		return Phone_Number;
	}
	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}
	public int getNumber_Of_Items() {
		return Number_Of_Items;
	}
	public void setNumber_Of_Items(int number_Of_Items) {
		Number_Of_Items = number_Of_Items;
	}
	public float getTotal_Amount() {
		return Total_Amount;
	}
	public void setTotal_Amount(float total_Amount) {
		Total_Amount = total_Amount;
	}
	public float getPaid_Amount() {
		return Paid_Amount;
	}
	public void setPaid_Amount(float paid_Amount) {
		Paid_Amount = paid_Amount;
	}
	public float getBalance() {
		return Balance;
	}
	public void setBalance(float balance) {
		Balance = balance;
	}
	Item[]Item;
	int Invoice_No;
	String Invoice_date;
	String Customer_Name;
	String Phone_Number;
	int Number_Of_Items;
	float Total_Amount;
	float Paid_Amount;
	float Balance;

}
