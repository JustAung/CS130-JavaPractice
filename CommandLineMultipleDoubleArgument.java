public class CommandLineMultipleDoubleArgument
{
	public static void main(String[] args)
	{
		for(String String1:args)
		{
		double number = Double.parseDouble(String1);
		System.out.println(number);
		}
	}
}

		