package Collection;
import java.util.Scanner;

public class CustomerMain {
	
	

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try {
		Customer c=new Customer();
		System.out.println("Enter customer number: ");
		String a=sc.next();
		c.setCustNo(a);
		c.CustomerNumber(a);
		System.out.println("Enter customer name: ");
		String b=sc.next();
		c.setCustName(b);
		c.CustomerName(b);
		System.out.println("Enter category: ");
		String d=sc.next();
		c.setCategory(d);
		c.Category(d);
		
		
		System.out.println("Customer Numner:"+ c.getCustNo());
		System.out.println("Customer Name:"+ c.getCustName());
		System.out.println("Category:"+ c.getCategory());
		}
		catch(InvalidException e) {
			System.out.println("Exception occure"+ e);
		}
		
	}

}
