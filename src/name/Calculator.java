package name;

class Calculator

{

	Calculator()

	{

		System.out.println("Basic arithmetic operation ");

	}

	Calculator(int x)

	{

		this();

		System.out.println(x + " " + "is the only operand supplied");

	}

	Calculator(int x, int y)

	{

		this(5);

		System.out.println("Two operands supplied are multiplied and the resultant is " + x * y);

	}

	public static void main(String args[])

	{

		new Calculator(8, 10);

	}

}