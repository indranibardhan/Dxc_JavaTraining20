package demo_2;

public class Armstrongnb {
	
	void armstrong(int x1)
	{
//System.out.println("x1 is" +x1);
   	int t=0,r,y=0,s;
int x2= x1;
int x3=x1;
// To count the number of Digits*******
   	while(x1>0)
   	{
    		t++;
     		x1=x1/10;
   	}

double second=(double)t;
//System.out.println("number of digits in x1 is " +second);
  	
while(x2>0)
  	{
	//System.out.println("Hello");
	r=x2%10;
	double first=(double)r;
	//System.out.println(" Extracted digit is" + first);
   		s=(int)java.lang.Math.pow(first,second);
   		y=y+s;
   		x2=x2/10;
  	}

if(x3==y)
		System.out.println(" " +x3 + "   is a Armstrong number");
else
	System.out.println(" " +x3 + "   is not a Armstrong number");
	}

	
	

}
