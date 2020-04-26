import java.util.Scanner;

public class VShape
{
	public static void main(String[] args)
	{
		String number;
		System.out.println("Enter a 13 digit integer, e.g. 1234567891011: ");
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.nextLine();

		String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11;
		s1 = number.substring(0,1);
		s2 = number.substring(1,2);
		s3 = number.substring(2,3);
		s4 = number.substring(3,4);
		s5 = number.substring(4,5);
		s6 = number.substring(5,6);
		s7 = number.substring(6,7);
		s8 = number.substring(7,8);
		s9 = number.substring(8,9);
		s10 = number.substring(9,11);
		s11 = number.substring(11,13);

		System.out.println(s1 + "\t" + "  " + s11 +
						"\n" + " " + s2 + "\t" +" " + s10 +
						"\n" + "  " + s3 + "\t" + s9 +
						"\n" + "   " + s4 + "   " + s8 +
						"\n" + "    " + s5 + " " + s7 +
						"\n" + "     " + s6);

	}
}