import java.util.Scanner;
import calculate.*;
public class Calc
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int ch = 0;
	System.out.println("Enter No. 1 : ");
	int a = sc.nextInt();
	System.out.println("Enter No. 2 : ");
	int b = sc.nextInt();
	while (true)
	{
		System.out.println("Enter Choice: ");
		System.out.println("\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Modulus\n6.Exit");
		ch = sc.nextInt();
		System.out.println("\nResult is : ");
		switch (ch)
		{
			case 1 :calculate.add ad = new calculate.add(a,b);	
				break;
			case 2 : calculate.sub sb = new calculate.sub(a,b);	
				break;
			case 3 : calculate.mul mu = new calculate.mul(a,b);	
				break;
			case 4 : calculate.div di = new calculate.div(a,b);	
				break;
			case 5 : calculate.mod mo = new calculate.mod(a,b);	
				break;
			default :System.exit(0);
		}
	}
}
}
