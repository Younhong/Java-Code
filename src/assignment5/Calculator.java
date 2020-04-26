import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		Calculator newCalculator = new Calculator();
		newCalculator.operation();
	}

	public void operation()
	{
		try
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter an expression in the form of opr1 operator opr2:");
			int opr1 = keyboard.nextInt();
			String s = keyboard.next();
			int opr2 = keyboard.nextInt();

			if (s.equals("+"))
			{
				System.out.println(opr1+opr2);
			}
			else if (s.equals("-"))
			{
				System.out.println(opr1-opr2);
			}
			else if (s.equals("*"))
			{
				System.out.println(opr1*opr2);
			}
			else if (s.equals("/"))
			{
				while (opr2 == 0)
				{
					throw new DivideByZeroException("");
				}
				System.out.println(opr1/opr2);
			}
			else
				throw new InvalidOperatorException("");

			System.out.println();
			nextTry();
		}
		catch(DivideByZeroException e)
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Don't divide by zero!!");
			nextTry();
		}
		catch(InvalidOperatorException e)
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter one of four operators, +, -, *, or /.");
			nextTry();
		}
		catch(Exception e)
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter an integer value.");
			nextTry();
		}
	}

	public void nextTry()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Do another calculation? (y) or (n): ");
		String answer = keyboard.next();
		System.out.println();

		try
		{
			if (answer.equalsIgnoreCase("y"))
			{
				int opr1 = keyboard.nextInt();
				String s = keyboard.next();
				int opr2 = keyboard.nextInt();

				if (s.equals("+"))
				{
					System.out.println(opr1+opr2);
					nextTry();
				}
				else if (s.equals("-"))
				{
					System.out.println(opr1-opr2);
					nextTry();
				}
				else if (s.equals("*"))
				{
					System.out.println(opr1*opr2);
					nextTry();
				}
				else if (s.equals("/"))
				{
					while (opr2 == 0)
					{
						System.out.println("Don't divide by zero!");
						nextTry();
					}
					System.out.println(opr1/opr2);
					nextTry();
				}
				else
				{
					System.out.println("Enter one of four operators, +, -, *, or /.");
					nextTry();
				}
			}
			else if (answer.equalsIgnoreCase("n")) 
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Enter 'y' or 'n'.");
				nextTry();
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter an integer value.");
			nextTry();
		}
	}
}