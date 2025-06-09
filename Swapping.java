import java.util.Scanner;
class Swapping
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number:");
		int a=sc.nextInt();
		System.out.println("Enter a second  number:");
		int b=sc.nextInt();
		System.out.println("Before swapping: a = " + a + ", b = " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping:a = " + a + ", b = " + b);
		sc.close();
	}
} 