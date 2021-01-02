package pkj1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class anshu1 
{
public static void main(String[] args) throws IOException 
{
	File f1=new File("../project1/dc.txt");//connection
	FileReader fr1=new FileReader(f1);
	BufferedReader b=new BufferedReader(fr1);
	String s;
	while((s=b.readLine())!= null);
	
	{
		System.out.println(s);
	}
	
}
}
