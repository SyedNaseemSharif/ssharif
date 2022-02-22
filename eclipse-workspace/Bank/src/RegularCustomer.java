
public class RegularCustomer extends Customer {
	String customerID;
	String customerName;
	String CustomerType;
	double amount;
	
	RegularCustomer(String custID,String custName,String custType,double amt)
	{
		super(custID,custName,custType);
		this.customerID=custID;
		this.customerName=custName;
		this.CustomerType=custType;
		this.amount=amt;
	}
	double get_final_amount(double interest,int year)
	{
		double simple_interest=(this.amount*(interest/100))*year;
		double amount=this.amount+simple_interest;
		amount=amount-500;
		if(this.CustomerType=="Domestic") {
			return amount-100;
		}
		else if(this.CustomerType=="Business") {
			return amount;
	}
	return amount;

}
	@Override
	double get_final_amount(double interest, double year) {
		// TODO Auto-generated method stub
		return 0;
	}
}

