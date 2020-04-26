public class RangeInput
{
	public static void main(String[] args)
	{
		System.out.println("The minimum and maximum has been changed");
		System.out.println("the minimum and maximum swapped and stored.");

		GetInputEx integerReader1 = new GetInputEx();
		integerReader1.initialize(15,1,"Input a value from 15 to 1");

		GetInputEx integerReader2 = new GetInputEx();
		integerReader2.initialize(0,10, "Input a value from 0 to 10");

		GetInputEx integerReader3 = new GetInputEx();
		integerReader3.initialize(-35, 0, "What is a freezing temperature?");
	}
}