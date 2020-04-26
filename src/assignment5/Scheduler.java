/* 	User's Guide: 이 프로그램은 스케줄을 예약해주는 프로그램입니다.
	예약시간은 반드시 숫자로 입력이 되어야 합니다.
	문자로 입력 시 저장되지 않습니다.
	예약시간은 1~6시 사이에 있어야 합니다.
	그 범위 밖의 숫자를 입력하면 예약이 불가능하니 다시 예약하셔야 합니다.
	또한 예약하려는 시간이 이미 예약되어 있으면, 다른 시간에 예약할 수 있도록 다시 질문이 나옵니다.
	이 프로그램은 1~6시까지, 각 시간당 한 명씩 예약이 완료되기 전까지, 종료되지 않습니다.
	6명이 각기 다른 시간에 예약을 완료하면, 시간 순서대로 예약자의 이름이 표시됩니다.
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

				if (appointedTime>=1 && appointedTime<=6) // 예약한 시간이 1~6 사이일 때 --> 그냥 진행
				{
					a[appointedTime-1] = appointer[time]; // 예약한 사람들을 예약된 순서대로 배열하기 위해서 사용
				}
				else // 예약한 시간이 범위 밖일 때 --> Exception
				{
					throw new InvalidTimeException("");
				}

				if (time>=1) // 두번째 예약자부터 해당되는 내용
				{
					for (int x=0; x<time; x++)
					{
						if (b[x] == b[time]) // 이미 예약된 시간에 예약을 시도할 때 --> Exception
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

				if (appointedTime >= 1 && appointedTime <= 6) // 예약한 시간이 1~6 사이일 때
				{
					if (time > 0) // 2번째 예약자부터 해당됨
					{
						for (int x=0; x<time; x++) /* 이미 예약된 시간에 예약을 시도할 때 -->
													빈 시간에 예약할 때까지 다시 시도하게 만듬 */
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
				while (appointedTime < 1 || appointedTime > 6) // 예약한 시간이 범위 밖일 때
				{
					System.out.println("Sorry, that is not a legal time");
					System.out.println("When would you like the appointment?");
					appointedTime = keyboard.nextInt();
					b[time] = appointedTime;

					if (time > 0) // 2번째 예약자부터 해당됨
					{
						for (int x=0; x<time; x++) /* 이미 예약된 시간에 예약을 시도할 때 -->
													빈 시간에 예약할 때까지 다시 시도하게 만듬 */
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

				if (appointedTime >= 1 && appointedTime <= 6) // 예약한 시간이 1~6 사이일 때
				{
					if (time > 0) // 2번째 예약자부터 해당됨
					{
						for (int x=0; x<time; x++) /* 이미 예약된 시간에 예약을 시도할 때 -->
													빈 시간에 예약할 때까지 다시 시도하게 만듬 */
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
				while (appointedTime < 1 || appointedTime > 6) // 예약한 시간이 범위 밖일 때
				{
					System.out.println("Sorry, that is not a legal time");
					System.out.println("When would you like the appointment?");
					appointedTime = keyboard.nextInt();
					b[time] = appointedTime;

					if (time > 0)
					{
						for (int x=0; x<time; x++) /* 이미 예약된 시간에 예약을 시도할 때 -->
													빈 시간에 예약할 때까지 다시 시도하게 만듬 */
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
			catch(Exception e)// 기타 예외 사항(예약시간을 문자로 입력한 경우 등)
			{
				System.out.println("Sorry, you should only enter number to make appointment.");
			}
		}

		System.out.println("All appointments made");
		for (int i=0; i<6; i++) // 예약자들을 순서에 맞게 정렬
		{
			System.out.println("At " + (i+1) + "PM is " + a[i]);
		}
	}
}