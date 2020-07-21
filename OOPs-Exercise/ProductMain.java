package object;
import java.util.*;
public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product ob1=new Product("Mobile",25000.00,'M');
		Product ob2=new Product("Headphone",500.00,'H');
		
		/*ob1.getProductDetails(101,"Mobile",25000.00,'M');
		ob2.getProductDetails(102,"Headphone",500.00,'H');*/
		
		System.out.println("Product Code: " + ob1.getProductCode());
		System.out.println("Product Name: " + ob1.getProductName());
		System.out.println("Product Price: " + ob1.getProductPrice());
		System.out.println("Product Category: " + ob1.getCategoryCode());
		
		System.out.println("Product Code: " + ob2.getProductCode());
		System.out.println("Product Name: " + ob2.getProductName());
		System.out.println("Product Price: " + ob2.getProductPrice());
		System.out.println("Product Category: " + ob2.getCategoryCode());
		

	}

}
