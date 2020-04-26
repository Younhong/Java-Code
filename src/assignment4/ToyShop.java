import java.util.Scanner;

public class ToyShop
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String[] toy = {"car", "cat", "house", "tree", "ball"};
		double[] cost = {5000, 6500, 35000, 4600, 4500};

		int i;
		String answer;
		System.out.println("What kind of toy would you like?");
		answer = keyboard.nextLine();

		for (i=0; i<5; i++)
		{
			if (answer.equalsIgnoreCase(toy[i]))
			{
				System.out.println("How many toy would you like?");
				int n;
				n = keyboard.nextInt();
				double totalCost = cost[i] * n;
				System.out.println(toy[i] + ": " + n + " at " + cost[i] + " will cost " + totalCost);
			}
		}
	}
}