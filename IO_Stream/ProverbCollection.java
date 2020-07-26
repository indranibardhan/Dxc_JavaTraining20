package IOAssingment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProverbCollection {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter proverb: ");
		String s=sc.nextLine();
		while(true) {
		if(s.equals("STOP"))
		{break;}
		else
		{storeProverb(s);}
		}
		

	}
	static void storeProverb(String proverb) throws IOException
	{
		BufferedWriter b=new BufferedWriter(new FileWriter("TopProverbs.txt"));
		b.write(proverb);
		b.newLine();
	}

}
