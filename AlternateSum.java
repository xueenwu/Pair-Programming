import java.util.Scanner;

public class AlternateSum 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[0];
		int[] current = new int[0];
		boolean yet = false;
		int hello = 0;
		while (!yet)
		{
			nums = new;
		}
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
