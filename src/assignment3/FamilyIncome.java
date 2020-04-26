import java.util.Scanner;

public class FamilyIncome
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many employees are there?");
		int n = keyboard.nextInt();
		double[] income = new double[n];

		System.out.println("Enter the income for each of the employee");
		for (int index = 0; index < n; index++)
		{
			System.out.println("Income for family " + (index+1));
			income[index] = keyboard.nextDouble();
		}

		double maxIncome = income[0];
		for (int index = 1; index < n; index++)
		{
			if (income[index] > maxIncome)
				maxIncome = income[index];
		}
		System.out.println("The maximum income is: " + maxIncome);

		double tenPercentMaxIncome = maxIncome/10;
		System.out.println("10% of maximum income is: " + tenPercentMaxIncome);
		System.out.println();

		System.out.println("Displaying all employees with incomes less than 10% of the max");

		int count=0;
		for (int index = 1; index < n; index++)
		{
			if (income[index] < tenPercentMaxIncome)
			{
				System.out.println("Employee " + index + " had income " + income[index]);
				count++;
			}
		}
		System.out.println("The count is: " + count);
	}
}