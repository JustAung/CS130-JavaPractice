public class CommandLineMultipleIntegerArgument
{

	public static void main(String[] args)

	{
		for(String str: args)
		{
		int argument = Integer.parseInt(str);
		System.out.println("Argument in Integer form : " + argument);
		}

	}

}
		