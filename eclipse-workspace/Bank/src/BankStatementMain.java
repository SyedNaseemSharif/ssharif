
public class BankStatementMain {

	public static void main(String[] args) {
RegularCustomer regCustomer1=new RegularCustomer("cust1","Jawad","Domestic",100000);
RegularCustomer regCustomer2=new RegularCustomer("Cust2","Naseem","Business",100000);

EnterpriseCustomer entCustomer1=new EnterpriseCustomer("Cust3","Raghu","SmallScale",100000);
EnterpriseCustomer entCustomer2=new EnterpriseCustomer("Cust4","Ram","BigScale",100000);

regCustomer1.showCustomerDetails();
System.out.println("Final amount:" +regCustomer1.get_final_amount(5,8));
regCustomer2.showCustomerDetails();
System.out.println("Final amount:" +regCustomer2.get_final_amount(5,8));

entCustomer1.showCustomerDetails();
System.out.println("final amount" +entCustomer1.get_final_amount(5,8));
entCustomer2.showCustomerDetails();
System.out.println("final amount" +entCustomer2.get_final_amount(5,8));

	}

}
