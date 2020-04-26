import java.util.*;

public class ExamGrade
{
	public static void main(String[] args)
	{	System.out.println("Enter numerical scores");
		System.out.println("in the range of o to 100");
		System.out.println("Please enter integers only");

        double totalGrade;
        int numberOfGrade;
        double next;
        Scanner keyboard = new Scanner(System.in);

        System.out.println( );
        System.out.println("Enter -1 to terminate data entry.");
        System.out.println();
		System.out.println("Please enter a score from 0 to 100 or -1 to quit:");
        totalGrade = 0;
        numberOfGrade = 0;
        double lowestGrade = 100;
        double highestGrade = 0;
		next = keyboard.nextDouble( );
		int numberOfA = 0, numberOfB = 0, numberOfC = 0, numberOfD = 0, numberOfF = 0;
		float percentA = 0, percentB = 0, percentC = 0, percentD = 0, percentF = 0;
		float averageScore = 0;

        while (next != -1)
        {
			numberOfGrade++;

			if (next >= 90 && next <= 100)
					numberOfA++;
			else if (next >= 80)
					numberOfB++;
			else if (next >= 70)
					numberOfC++;
			else if (next >= 60)
					numberOfD++;
			else if (next >= 0)
					numberOfF++;
			else
				System.exit(0);

			if (next < lowestGrade)
        	 		lowestGrade = next;
        	if (next > highestGrade)
        	 		highestGrade = next;

			percentA = (float)numberOfA/(float)numberOfGrade;
			percentB = (float)numberOfB/(float)numberOfGrade;
			percentC = (float)numberOfC/(float)numberOfGrade;
			percentD = (float)numberOfD/(float)numberOfGrade;
			percentF = (float)numberOfF/(float)numberOfGrade;

        	totalGrade = totalGrade + next;
        	averageScore = (float)totalGrade/(float)numberOfGrade;

        	next = keyboard.nextDouble( );
        }

        if (numberOfGrade > 0)
        {
			System.out.println();
			System.out.println("Total number of grades = " + numberOfGrade);

			System.out.println("Number of A's = " + numberOfA);
			System.out.println("Number of B's = " + numberOfB);
			System.out.println("Number of C's = " + numberOfC);
			System.out.println("Number of D's = " + numberOfD);
			System.out.println("Number of F's = " + numberOfF);
			System.out.println();

			System.out.println("Percent A's = " + percentA);
			System.out.println("Percent B's = " + percentB);
			System.out.println("Percent C's = " + percentC);
			System.out.println("Percent D's = " + percentD);
			System.out.println("Percent F's = " + percentF);
			System.out.println();

			System.out.println("Lowest grade = " + lowestGrade);
			System.out.println("Highest grade = " + highestGrade);
			System.out.println();

	        System.out.println("average score = " + averageScore);
		}
	}
}