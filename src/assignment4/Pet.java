import java.util.Scanner;

public class Pet
{
	String[] name = new String[5];
	int[] age = new int[5];
	double[] weight = new double[5];
	Scanner keyboard = new Scanner(System.in);

	public void data(String s1, String s2, String s3, String s4, String s5)
	{
		String[] S = {s1, s2, s3, s4, s5};

		double ageSum = 0;
		double weightSum = 0;

		int theOldest = 0;
		int theYoungest = 1000;
		String theOldName = "";
		String theYoungName = "";

		double theLargest = 0;
		double theSmallest = 1000;
		String theLargeName = "";
		String theSmallName = "";

		int i;

		for (i=0; i<5; i++)
		{
			System.out.print("Enter name of " + S[i] + " pet: ");
			name[i] = keyboard.next();

			System.out.print("Enter age of " + S[i] + " pet: ");
			age[i] = keyboard.nextInt();
			ageSum = ageSum + age[i];

			System.out.print("Enter weight of " + S[i] + " pet: ");
			weight[i] = keyboard.nextDouble();
			weightSum = weightSum + weight[i];
			System.out.println();

			System.out.println("Verify correct information: ");
			System.out.println("Name: " + name[i]);
			System.out.println("Age: " + age[i] + " years");
			System.out.println("Weight: " + weight[i] + " pounds");
			System.out.println();

			if (theLargest <= weight[i])
			{
				theLargest = weight[i];
				theLargeName = name[i];
			}

			if (theSmallest >= weight[i])
			{
				theSmallest = weight[i];
				theSmallName = name[i];
			}

			if (theOldest <= age[i])
			{
				theOldest = age[i];
				theOldName = name[i];
			}

			if (theYoungest >= age[i])
			{
				theYoungest = age[i];
				theYoungName = name[i];
			}
		}

		double ageAverage = ageSum/5;
		double weightAverage = weightSum/5;

		System.out.println("The largest pet(s) (" + theLargest + " pounds): " + theLargeName);
		System.out.println("The smallest pet(s) (" + theSmallest + " pounds): " + theSmallName);
		System.out.println();
		System.out.println("The oldest pet(s) (" + theOldest + " years): " + theOldName);
		System.out.println("The youngest pet(s) (" + theYoungest + " years): " + theYoungName);
		System.out.println("Average weight (pounds) = " + weightAverage);
		System.out.println("Average age (years) = " + ageAverage);
	}
}