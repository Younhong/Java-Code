import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args)
	{
		String letter;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Palindrone with the first and last three characters...");
		System.out.println("Please enter ok to end the program.");
		letter = keyboard.nextLine();

		while (letter != "")
		{
			int i;
			String s="";
			String s1="ok";

			for (i=letter.length()-2; i<=letter.length()-1; i++)
				s += letter.charAt(i);

			String first_three_letters= "";
			String last_three_letters= "";
			String letters_without_blank_ok="";//ok가 스페이스바 다음으로 입력된 경우 공백과 ok를 제외한 나머지 글자 중에서 3글자 출력하는 문자열
			String letters_without_ok="";//ok가 문자 다음에 바로 입력된 경우 ok를 제외한 나머지 글자 중 3글자를 출력하는 문자열

			for (i=0; i<=2; i++)
				first_three_letters += letter.charAt(i);

			for (i=letter.length()-1; i>=letter.length()-3; i--)
  				last_three_letters += letter.charAt(i);

			if (letter.length()>=6)
			{
  				for (i=letter.length()-4; i>=letter.length()-6; i--)
  					letters_without_blank_ok += letter.charAt(i);
			}

			if (letter.length()>=5)
			{
				for (i=letter.length()-3; i>=letter.length()-5; i--)
					letters_without_ok += letter.charAt(i);
			}

  			if (s.equalsIgnoreCase(s1))
				{
					if (first_three_letters.equalsIgnoreCase(letters_without_blank_ok))
					  	{
							System.out.println("The word " + letter + " has the first and last three characters making the palindrome.");
							System.exit(0);
						}
					else if (first_three_letters.equalsIgnoreCase(letters_without_ok))
						{
							System.out.println("The word " + letter + " has the first and last three characters making the palindrome.");
							System.exit(0);
						}
					else
						System.exit(0);
				}
			else
				{
					if (first_three_letters.equalsIgnoreCase(last_three_letters))
  					{
						System.out.println("The word " + letter + " has the first and last three characters making the palindrome.");
  						letter = keyboard.nextLine();
					}
  					else
  						letter = keyboard.nextLine();
				}
		}
	}
}