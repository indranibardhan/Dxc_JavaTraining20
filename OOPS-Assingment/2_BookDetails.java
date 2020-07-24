package EncapsulationInheritance;
import java.util.Scanner;

public class BookDetails {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Book b=new Book();
		
		System.out.println("Enter Book Name:");
		String bName=sc.next();
		b.setBookName(bName);
		
		System.out.println("Enter Author Name:");
		String auName=sc.next();
		b.setAuthor(auName);
		
		System.out.println("Enter Book No:");
		int bNo=sc.nextInt();
		b.setBookNo(bNo);
		
		System.out.println("Enter Price:");
		float bPrice=sc.nextFloat();
		b.setPrice(bPrice);
		
		
		EngineeringBook e=new EngineeringBook();
		
		System.out.println("Enter Book Category:");
		String bcategory=sc.next();
		e.setCategory(bcategory);
		
		System.out.println("Book Name: "+ b.getBookName()+"\n"+
				"Author Name: "+ b.getAuthor()+"\n"+
				"Book Nb: "+ b.getBookNo()+"\n"+
				"Book Price: "+ b.getPrice());

		System.out.println("Book Category: "+ e.getCategory());
		sc.close();
	}
}
