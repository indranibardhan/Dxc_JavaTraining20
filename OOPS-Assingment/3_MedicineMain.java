package InheritanceAbstraction;
import java.util.*;

public class MedicineMain {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Medicine [] object=new Medicine[5];
		
		
		 Random randomGenerator = new Random();
	      
	   for(int i=0;i<=4;i++)
	   {
		   System.out.println("Enter Expiry Date");
		   object[i].date=sc.nextLine();
		   sc.nextLine();
		   System.out.println("Enter Price");
		   object[i].price=sc.nextFloat();   
	   }
	   for(int i=0;i<=4;i++)
	   {
		  object[i].getDetails();
		  int randomInt = randomGenerator.nextInt(2) + 1;
		  if(randomInt==1)
		  {
			 Syrup ob = new Syrup();
			 ob.displayLabel();
		  }
		  if(randomInt==2)
		  {
			 Tablet ob = new Tablet();
			 ob.displayLabel();
		  }
		  if(randomInt==3)
		  {
			 Ointment ob = new Ointment();
			 ob.displayLabel();
		  }
			  
	   }
	    

	}


}
