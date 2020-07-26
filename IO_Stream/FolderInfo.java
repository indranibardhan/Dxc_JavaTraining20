package IOAssingment;

import java.io.File;

public class FolderInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDirectory("E:\\xyz\\Badminton.txt");
	}
	static void printDirectory(String path)
	{
		File file=new File(path);
		if(file.exists())
		{
			System.out.println("File Name: "+ file.getName());
			System.out.println("File Parent Name: "+ file.getParent());
			System.out.println("Path: "+ file.getAbsolutePath());
		}
		else
		{
			System.out.println("No folder exists");
		}
		
	}

}
