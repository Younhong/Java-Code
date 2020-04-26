/* 	User's Guide: �� ���α׷��� �������� �������ִ� ���α׷��Դϴ�.
	����ð��� �ݵ�� ���ڷ� �Է��� �Ǿ�� �մϴ�.
	���ڷ� �Է� �� ������� �ʽ��ϴ�.
	����ð��� 1~6�� ���̿� �־�� �մϴ�.
	�� ���� ���� ���ڸ� �Է��ϸ� ������ �Ұ����ϴ� �ٽ� �����ϼž� �մϴ�.
	���� �����Ϸ��� �ð��� �̹� ����Ǿ� ������, �ٸ� �ð��� ������ �� �ֵ��� �ٽ� ������ ���ɴϴ�.
	�� ���α׷��� 1~6�ñ���, �� �ð��� �� �� ������ �Ϸ�Ǳ� ������, ������� �ʽ��ϴ�.
	6���� ���� �ٸ� �ð��� ������ �Ϸ��ϸ�, �ð� ������� �������� �̸��� ǥ�õ˴ϴ�.
*/


import java.util.Scanner;

public class Scheduler
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Appointment scheduler");
		System.out.println("You can schedule an appointment at 1,2,3,4,5, or 6 PM.");
		Scheduler newSchedule = new Scheduler();
		newSchedule.choice();
	}

	public void choice()
	{
		String[] appointer = new String[6];
		String[] a = new String[6];
		double[] b = new double[6];
		int time;
		int appointedTime;

		for (time=0; time<6; time++)
		{
			try
			{
				Scanner keyboard = new Scanner(System.in);
				System.out.println("What is your name?");
				appointer[time] = keyboard.nextLine();

				System.out.println("When would you like the appointment?");
				appointedTime = keyboard.nextInt();
				b[time] = appointedTime;

				if (appointedTime>=1 && appointedTime<=6) // ������ �ð��� 1~6 ������ �� --> �׳� ����
				{
					a[appointedTime-1] = appointer[time]; // ������ ������� ����� ������� �迭�ϱ� ���ؼ� ���
				}
				else // ������ �ð��� ���� ���� �� --> Exception
				{
					throw new InvalidTimeException("");
				}

				if (time>=1) // �ι�° �����ں��� �ش�Ǵ� ����
				{
					for (int x=0; x<time; x++)
					{
						if (b[x] == b[time]) // �̹� ����� �ð��� ������ �õ��� �� --> Exception
							throw new TimeInUseException("");
					}
				}
			}
			catch(InvalidTimeException e)
			{
				Scanner keyboard = new Scanner(System.in);
				System.out.println("Sorry, that is not a legal time");
				System.out.println("When would you like the appointment?");
				appointedTime = keyboard.nextInt();
				b[time] = appointedTime;

				if (appointedTime >= 1 && appointedTime <= 6) // ������ �ð��� 1~6 ������ ��
				{
					if (time > 0) // 2��° �����ں��� �ش��
					{
						for (int x=0; x<time; x++) /* �̹� ����� �ð��� ������ �õ��� �� -->
													�� �ð��� ������ ������ �ٽ� �õ��ϰ� ���� */
						{
							while (b[x] == b[time])
							{
								System.out.println("Sorry, that time is already in use");
								System.out.println("When would you like the appointment?");
								appointedTime = keyboard.nextInt();
								b[time] = appointedTime;
							}
						}
					}
				}
				while (appointedTime < 1 || appointedTime > 6) // ������ �ð��� ���� ���� ��
				{
					System.out.println("Sorry, that is not a legal time");
					System.out.println("When would you like the appointment?");
					appointedTime = keyboard.nextInt();
					b[time] = appointedTime;

					if (time > 0) // 2��° �����ں��� �ش��
					{
						for (int x=0; x<time; x++) /* �̹� ����� �ð��� ������ �õ��� �� -->
													�� �ð��� ������ ������ �ٽ� �õ��ϰ� ���� */
						{
							while (b[x] == b[time])
							{
								System.out.println("Sorry, that time is already in use");
								System.out.println("When would you like the appointment?");
								appointedTime = keyboard.nextInt();
								b[time] = appointedTime;
							}
						}
					}
				}
				a[appointedTime-1] = appointer[time];
			}
			catch(TimeInUseException e)
			{
				Scanner keyboard = new Scanner(System.in);
				System.out.println("Sorry, that time is already in use");
				System.out.println("When would you like the appointment?");
				appointedTime = keyboard.nextInt();
				b[time] = appointedTime;

				if (appointedTime >= 1 && appointedTime <= 6) // ������ �ð��� 1~6 ������ ��
				{
					if (time > 0) // 2��° �����ں��� �ش��
					{
						for (int x=0; x<time; x++) /* �̹� ����� �ð��� ������ �õ��� �� -->
													�� �ð��� ������ ������ �ٽ� �õ��ϰ� ���� */
						{
							while (b[x] == b[time])
							{
								System.out.println("Sorry, that time is already in use");
								System.out.println("When would you like the appointment?");
								appointedTime = keyboard.nextInt();
								b[time] = appointedTime;
							}
						}
					}
				}
				while (appointedTime < 1 || appointedTime > 6) // ������ �ð��� ���� ���� ��
				{
					System.out.println("Sorry, that is not a legal time");
					System.out.println("When would you like the appointment?");
					appointedTime = keyboard.nextInt();
					b[time] = appointedTime;

					if (time > 0)
					{
						for (int x=0; x<time; x++) /* �̹� ����� �ð��� ������ �õ��� �� -->
													�� �ð��� ������ ������ �ٽ� �õ��ϰ� ���� */
						{
							while (b[x] == b[time])
							{
								System.out.println("Sorry, that time is already in use");
								System.out.println("When would you like the appointment?");
								appointedTime = keyboard.nextInt();
								b[time] = appointedTime;
							}
						}
					}
				}
				a[appointedTime-1] = appointer[time];
			}
			catch(Exception e)// ��Ÿ ���� ����(����ð��� ���ڷ� �Է��� ��� ��)
			{
				System.out.println("Sorry, you should only enter number to make appointment.");
			}
		}

		System.out.println("All appointments made");
		for (int i=0; i<6; i++) // �����ڵ��� ������ �°� ����
		{
			System.out.println("At " + (i+1) + "PM is " + a[i]);
		}
	}
}