package pkj1;

public class doubleloopassign
{
public static void main(String[] args)
{
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
	System.out.println("---------------------------------------");
	
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println("-----------------------------------------");
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	
}
}
