import java.util.Scanner;

public class AlternateSum 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[0];
		int nextInt = sc.nextInt();
		numbers = new int[1];
		numbers[0] = nextInt;
		sc.close();
	}
	
	public static int alternateSum(int[] intArray)
	{
		int sum = 0;
		for (int i = 0; i < intArray.length; i++)
		{
			if (i % 2 == 0)
			{
				sum += intArray[i];
			}	
			else
			{
				sum -= intArray[i];
			}
		}
		return sum;
	}
}
