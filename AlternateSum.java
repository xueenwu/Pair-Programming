import java.util.Scanner;

public class AlternateSum 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[0];
		int newInt;
		while (sc.hasNextInt())
		{
			newInt = sc.nextInt();
			int[] replacement = new int[nums.length + 1];
			for (int i = 0; i < nums.length; i++)
			{
				replacement[i] = nums[i];
			}
			replacement[nums.length] = newInt;
			nums = new int[nums.length + 1];
			for (int i = 0; i < nums.length; i++)
			{
				nums[i] = replacement[i]	;
			}
		}
		System.out.println(alternateSum(nums));
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