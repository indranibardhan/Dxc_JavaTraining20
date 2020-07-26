package IOAssingment;

import java.io.File;
import java.io.IOException;

public class TestBadminton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fol=new File("E:\\xyz\\Badminton.txt");
		fol.mkdir();
		File file1=new File(fol,"Singles.txt");
		try {
			file1.createNewFile();
		}
		catch(IOException e)
		{e.printStackTrace();}
		File file2=new File(fol,"Dubbles.txt");
		try {
			file2.createNewFile();
		}
		catch(IOException e)
		{e.printStackTrace();}
		File fol2=new File(fol,"Courts");
		fol2.mkdir();
		File file3=new File(fol,"Doubles.txt");
		file2.renameTo(file3);
		file1.delete();
	}

}
