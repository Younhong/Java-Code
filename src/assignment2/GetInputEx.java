import java.util.Scanner;

public class GetInputEx
{
	private int first_number;
	private int second_number;
	private String sentence;

	public void initialize(int value1, int value2, String s)
	{
		first_number = value1;
		second_number = value2;
		sentence = s;

		int n;
		Scanner keyboard = new Scanner(System.in);
		System.out.println(s);
		n = keyboard.nextInt();

		while (value1>value2)
		{
			if (n>value1 || n<value2)
				{
					System.out.println("Sorry, the data value must be in the range of " + value1 + " to " + value2);
					System.out.println();
					System.out.println(s);
					n = keyboard.nextInt();
				}
			else
				{
					System.out.println("We got the value " + n);
					System.out.println();
					break;
				}
		}

		while (value1<value2)
		{
			if (n>value2 || n<value1)
				{
					System.out.println("Sorry, the data value must be in the range of " + value1 + " to " + value2);
					System.out.println();
					System.out.println(s);
					n = keyboard.nextInt();
				}
			else
				{
					System.out.println("We got the value " + n);
					System.out.println();
					break;
				}
		}
	}
}