import java.util.*;
public class calculator {
        
	public static void main(String[] args)
	{
		// Stores two numbers
		double num1, num2;

		// Take input from the user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers:");

		// Take the inputs
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();

		System.out.println("Enter the operator (+,-,*,/):");

		char ch = sc.next().charAt(0);
		double result = 0;

		switch (ch) {
		// case to add two numbers
		case '+':
			result = num1 + num2;
			break;

		// case to subtract two numbers
		case '-':
			result = num1 - num2;
			break;

		// case to multiply two numbers
		case '*':
			result = num1 * num2;
			break;

		// case to divide two numbers
		case '/':
			result = num1 / num2;
			break;

		default:
			System.out.println("You enter wrong input");
		}

		System.out.println("The final result:");

		System.out.println();

		// print the final result
		System.out.println(num1 + " " + ch + " " + num2
						+ " = " + result);
	}
}



