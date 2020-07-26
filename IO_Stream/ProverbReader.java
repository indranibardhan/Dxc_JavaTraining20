package IOAssingment;


import java.io.*;
public class ProverbReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader r=new BufferedReader(new FileReader("TopProverbs.txt"));
		String s="";
		s=r.readLine();
		if(s!=null)
		{
			System.out.println(s);
		}
			
	}
	

}



