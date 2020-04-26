import java.util.Scanner;

public class CheckingAccount
{
	public static void main(String[] args)
	{
		double current_balance;
		int child_balance=0;
		int deposit;
		int transfer;
		int withdraw;
		char answer;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your initial amount to deposit?");
		current_balance = keyboard.nextDouble();

		System.out.println("Would you like to make a deposit <d> or withdrawal <w> or check-balance <c> or quit <q> or transfer to your child <t>?");
		answer = keyboard.next().charAt(0);

		while (answer != 'q')
		{
			if (answer == 'd')
			{
				System.out.println("What is the amount to deposit?");
				deposit = keyboard.nextInt();
				current_balance = (current_balance + deposit);
				System.out.println("Your current balace is " + current_balance);
				current_balance = current_balance + 0.01 * current_balance;
				System.out.println("Would you like to make a deposit <d> or withdrawal <w> or check-balance <c> or quit <q> or transfer to your child <t>?");
				answer = keyboard.next().charAt(0);
			}
			else if (answer == 'w')
			{
				System.out.println("What is the amount to withdraw?");
				withdraw = keyboard.nextInt();
				current_balance = current_balance - withdraw;
				System.out.println("Your current balace is " + current_balance);
				System.out.println("Would you like to make a deposit <d> or withdrawal <w> or check-balance <c> or quit <q> or transfer to your child <t>?");
				answer = keyboard.next().charAt(0);
			}
			else if (answer == 'c')
			{
				System.out.println("Your current balance is " + current_balance);
				System.out.println("Would you like to make a deposit <d> or withdrawal <w> or check-balance <c> or quit <q> or transfer to your child <t>?");
				answer = keyboard.next().charAt(0);
			}
			else if (answer == 't')
			{
				System.out.println("What is the amount to transfer?");
				transfer = keyboard.nextInt();
				current_balance = current_balance - transfer;
				child_balance = child_balance + transfer;
				System.out.println("Your current balance is " + current_balance);
				System.out.println("Your child balance is " + child_balance);
				System.out.println("Would you like to make a deposit <d> or withdrawal <w> or check-balance <c> or quit <q> or transfer to your child <t>?");
				answer = keyboard.next().charAt(0);
			}
			else
				System.exit(0);
		}
		System.exit(0);
	}
}