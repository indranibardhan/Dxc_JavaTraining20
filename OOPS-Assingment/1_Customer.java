package AggregationEncapsulation;

public class Customer {
	
	private String customerName;
	//private Address residentialAddress;
	Address residentialAddress=new Address();
	
	public Customer()
	{}
	public Customer(String customerName,String addressLine,String city)//Address residentialAddress)
	{
		super();
		this.customerName=customerName;
		residentialAddress.setAddressLine(addressLine);
		residentialAddress.setCity(city);
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public String getCustomerDetails()//String customerName,Address residentialAddress)
	{
		return (this.customerName+","+this.residentialAddress);
		//return getCustomerDetails();
	}

}
