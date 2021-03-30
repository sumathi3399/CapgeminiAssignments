package capgeminiAssignments;

public class Customer {
	private int customerId,customerNumber;
	private String customerName;
	private Address customerAddress;
	
	public int getCustomerId() {
		return customerId;
	}
	//public void setCustomerId(int customerId) {
	//	this.customerId = customerId;
	//}
	public int getCustomerNumber() {
		return customerNumber;
	}
	//public void setCustomerNumber(int customerNumber) {
	//	this.customerNumber = customerNumber;
	//}
	public String getCustomerName() {
		return customerName;
	}
	//public void setCustomerName(String customerName) {
	//	this.customerName = customerName;
	//}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	//public void setCustomerAddress(Address customerAddress) {
	//	this.customerAddress = customerAddress;
	//}
	
	public Customer(int customerId, String customerName, int customerNumber, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	
	public void printDetails() 
	{
		System.out.println("Customer Id: "+this.getCustomerId()+"\nCustomer Name: "+this.getCustomerName()+"\nCustomer Number: "+this.getCustomerNumber()+"\nCustomer Address: "+this.getCustomerAddress());
	}

}
