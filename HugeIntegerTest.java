// HugeIntegerTest.java
// Victoria Brown 10/30/2015
// Test program to test the HugeInteger program.

import java.util.Scanner;
public class HugeIntegerTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// String variables that go into objects.
		String string1;
		String string2;
		
		
		System.out.print("Please enter a positive value for object 1: ");
		string1 = input.next();
		System.out.print("Please enter a positive value for object 2: ");
		string2 = input.next();
		
		// Objects of HugeInteger
		HugeInteger number1 = new HugeInteger(string1);
		HugeInteger number2 = new HugeInteger(string2);
		
		// Testing Object 1 first.
		System.out.println("The first object: ");
		
		// Test the parse method for each of the objects.
		number1.parse();
		
		// Test the toString method for each of the objects.
		//number1.toString();
		
		// Test the add method.
		number1.add(string1, string2);
		
		// Test the subtract method.
		number1.subtract(string1, string2);
		
		// Test the isEqualTo method.
		number1.isEqualTo(string1, string2);
		
		// Test the isNotEqualTo method.
		number1.isNotEqualTo(string1, string2);
		
		// Test the isLessThan method.
		number1.isLessThan(string1, string2);
		
		// Test the isGreaterThan method.
		number1.isGreaterThan(string1, string2);
		
		// Test the isLessThanOrEqualTo method.
		number1.isLessThanOrEqualTo(string1, string2);

		// Test the isGreaterThanOrEqualTo method.
		number1.isGreaterThanOrEqualTo(string1, string2);

		// Test the isZero method.
		System.out.println(number1.isZero());

		// Testing Object 2 now.
		System.out.println("The second object: ");
				
		// Test the parse method for each of the objects.
		number2.parse();
				
		// Test the toString method for each of the objects.
		//number1.toString();
				
		// Test the add method.
		number2.add(string1, string2);
				
		// Test the subtract method.
		number2.subtract(string2, string1);
				
		// Test the isEqualTo method.
		number2.isEqualTo(string2, string1);
				
		// Test the isNotEqualTo method.
		number2.isNotEqualTo(string1, string2);
				
		// Test the isLessThan method.
		number2.isLessThan(string2, string1);
				
		// Test the isGreaterThan method.
		number2.isGreaterThan(string2, string1);
				
		// Test the isLessThanOrEqualTo method.
		number2.isLessThanOrEqualTo(string2, string2);

		// Test the isGreaterThanOrEqualTo method.
		number2.isGreaterThanOrEqualTo(string2, string1);

		// Test the isZero method.
		System.out.println(number2.isZero());
		
	}
}
