package AggregationEncapsulation;

public class AddressCustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c1=new Customer();
		
		c1.setCustomerName("John");
		c1.residentialAddress.setAddressLine("Ist Main HSR Layout");
		c1.residentialAddress.setCity("Bengalore");
		System.out.println(c1.getCustomerDetails());
		
		Customer c2=new Customer("John","Ist Main HSR Layout", "Bangalore");
		System.out.println(c2.getCustomerDetails());
		
	}

}
