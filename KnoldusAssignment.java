import java.util.Scanner;

public class Knoldus {
	public static boolean ispal(int num)
	{
		int n = num,reverse=0;
		while(num!=0) {
			int dig = num%10;
			reverse=reverse*10+dig;
			num/=10;
		}
		if(reverse==n)
			return true;
		else
			return false;
	}
	
	public static void smallestPal(int num)
	{
		while(num<1000000){
			if(ispal(num)==true)
			{
				System.out.print(num+" ");
				break;
			}else {
				num++;
			}
				
		}
	}	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		int[] numbers = new int[testcases];
		for (int i =0;i<testcases;i++)
		{
			numbers[i] = sc.nextInt();
		}
		
		for(int j =0;j<testcases;j++)
		{
			smallestPal(numbers[j]);
		}
	}
}
