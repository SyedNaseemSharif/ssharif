
public abstract class Customer {
	String customerID;
	String customerName;
	String CustomerType;
	
	Customer(String custID,String custName,String custType){
		this.customerID=custID;
		this.customerName=custName;
		this.CustomerType=custType;
	}
	void showCustomerDetails(){
		System.out.println("Customer ID : " +this.customerID);
		System.out.println("Customer Name : " +this.customerName);
		System.out.println("Account type : " +this.CustomerType);
	
		
		
	}
	abstract double get_final_amount(double interest, double year);
	

}
