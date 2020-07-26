/*Create a class ExceptionTest with a main method. The main method should accept two numbers as commandline arguments. 

In the main method, Divide the two numbers and display the result.

The main method should display the following messages in case of invalid data passed through command line arguments.

•	If no arguments are passed, the program should display “ No Input received”
•	If the numbers provided are not integers, the program should display “Only integers are allowed”
•	If the division results in ArithmeticException, display “Division with zero is not possible”*/



package Collection;


public class ComLineException {
	
	public static void main(String[] args)
	{
		
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			System.out.println(c);
		
		}
		catch(NumberFormatException e)
		{System.out.println("Only integers are allowed");}
		catch(ArithmeticException e)
		{System.out.println("Division with zero is not possible”");}
		catch(ArrayIndexOutOfBoundsException e)
		{System.out.println("No Input received");}
		
		
	}

}
