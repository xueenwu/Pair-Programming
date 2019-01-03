import java.util.Scanner;

public class AlternatingSum 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int[] numbers = parseString(input);
		int sum = alternateSum(numbers);
		System.out.println(sum);
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
	
	public static int[] parseString(String input)
	{
		input = reduce(input);
		int doneIndex = input.indexOf("done");
		input = input.substring(0, doneIndex);
		int count = countSpaces(input);
		int[] numbers = new int[count];
		int space;
		for (int i = 0; i < count; i++)
		{
			space = input.indexOf(" ");
			numbers[i] = Integer.parseInt(input.substring(0, space));
			input = input.substring(space + 1);
		}
		return numbers;
	}
	
	public static int countSpaces(String str)
	{
		int count = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == ' ')
			{
				count++;
			}
		}
		return count;
	}
	
	public static String reduce(String str)
	{
		String reduced = "";
		boolean spaces = true;
		while (spaces)
		{
			if (str.charAt(0) == ' '	)
			{
				str = str.substring(1);
			}
			else
			{
				spaces = false;
			}
		}
		for (int i = 0; i < str.length(); i++) 
		{
			if (str.charAt(i) != ' ' || i == str.length() - 1 
					|| str.charAt(i + 1) != ' ')
			{
				reduced += str.substring(i, i + 1);
			}
		}
		return reduced;
	}
}