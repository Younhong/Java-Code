import java.util.Scanner;

public class StarTriangle
{
	public static void main(String[] args)
	{
		int number;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an integer from 1 to 50:");
		number = keyboard.nextInt();

		int n,i;
		for (n=1; n<=number; n++)
		{
			for (i=1; i<=n; i++)
			{
				System.out.print("*");
			}
				System.out.println();
		}
		for (n=number-1; n>=0; n--)
		{
			for (i=1; i<=n; i++)
			{
				System.out.print("*");
			}
				System.out.println();
		}
	}
}