package InheritanceAbstraction;
import java.util.Date;

public abstract class Medicine {
	
	float price;
	String date;
	
	
	public void getDetails()
	{
		System.out.println("Price:"+this.price+"\n"+"Expiry Date:"+this.date);
	}
	abstract void displayLabel();
	

}
