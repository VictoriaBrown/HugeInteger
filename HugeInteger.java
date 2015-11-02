// HugeInteger.java
// Victoria Brown 10/28/2015
// Has 40-element array
public class HugeInteger {
	
	// Instance variables for 2 strings.
	private String number1;
	
	// Constructor for HugeInteger:
	// Accepts only 1 String
	public HugeInteger(String number1) {
		this.number1 = number1;
	}
	
	// Method parse:
	// Receive a String holding the number, extract
	// each digit and place that digit into the
	// correct place in array.
	public void parse() {
		// Create an array for the string that the object created.
		int[] integers = new int[number1.length()];
		
		// Loop through each number of the string
	    for (int i = number1.length() - 1 ; i >= 0; i--) {
	    	// If number if negative:
	    	if (number1.charAt(i) == '-') {
	        System.out.println("This is a negative number.");
	        System.out.println("Please retry");
	        // If number isn't negative:
	        } else {
	        System.out.println("Converting to number: " + number1.charAt(i));
	        integers[i] = number1.charAt(i) - '0';
	        }
	    }
	    System.out.println();
	}
			
			
	// Method toString:
	// Return toString of object of HugeInteger
	public String toString() { 
		return number1;
	}
	
			
	// Method add:
	// Add two objects of HugeInteger together
	public void add(String number1, String number2) {
		// Change the Strings into integers:
		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);
		int sum = num1 + num2;
		System.out.println("The sum of the two numbers is: " + sum);
		System.out.println();
	}
	
	// Method subtract:
	// Subtract two objects of HugeInteger together
		public void subtract(String number1, String number2) {
			// Change the Strings into integers:
			int num1 = Integer.parseInt(number1);
			int num2 = Integer.parseInt(number2);
			
			// Subtract smaller number from bigger number.
			if (num1 > num2) {
				int total = num1 - num2;
				System.out.println("The difference of the two numbers is: " + total);
			} else {
				int total = num2 - num1;
				System.out.println("The difference of the two numbers is: " + total);
			}
			System.out.println();
		}
		
		// METHODS FOR COMPARING THE 2 OBJECTS:
		
		// isEqualTo:
		// Says false if numbers aren't equal, true otherwise.
		public boolean isEqualTo(String a, String b) {
			// Change the Strings into integers:
			int num1 = Integer.parseInt(a);
			int num2 = Integer.parseInt(b);
			
			System.out.println("The two values are equal:");
			// If nums are equal, return true, if not, return false.
			if (num1 == num2) {
				System.out.println("True");
				System.out.println();
				return true;
			} else {
				System.out.println("False");
				System.out.println();
				return false;
			}
		}
		
		// isNotEqualTo:
		// Says true if values aren't equal; true otherwise.
		public boolean isNotEqualTo(String a, String b) {
			// Change the Strings into integers:
			int num1 = Integer.parseInt(a);
			int num2 = Integer.parseInt(b);
			
			System.out.println("The two values are not equal:");
			// If nums are not equal return true; if they are, return false.
			if (num1 != num2) {
				System.out.println("True");
				System.out.println();
				return true;
			} else {
				System.out.println("False");
				System.out.println();
				return false;
			}
		}
		
		// isLessThan:
		// Says true if number 1 is less than number 2;
		// false otherwise.
		public boolean isLessThan(String a, String b) {
			// Change the Strings into integers:
			int num1 = Integer.parseInt(a);
			int num2 = Integer.parseInt(b);
						
			System.out.println(num1 + " is less than " + num2 + ":");
			// If num1 is less than num2 return true; otherwise return false.
			if (num1 < num2) {
				System.out.println("True");
				System.out.println();
				return true;
			} else {
				System.out.println("False");
				System.out.println();
				return false;
			}
		}
		
		// isGreaterThan:
		// Says true if number 1 is greater than number 2;
		// false otherwise.
		public boolean isGreaterThan(String a, String b) {
		// Change the Strings into integers:
			int num1 = Integer.parseInt(a);
			int num2 = Integer.parseInt(b);
							
			System.out.println(num1 + " is greater than " + num2 + ":");
			// If num1 is greater than num2 return true; otherwise return false.
			if (num1 > num2) {
				System.out.println("True");
				System.out.println();
				return true;
			} else {
				System.out.println("False");
				System.out.println();
				return false;
			}
		}
				
		// isLessThanOrEqualTo:
		// Says true if number 1 is less than or equal to number 2;
		// false otherwise.
		public boolean isLessThanOrEqualTo(String a, String b) {
			// Change the Strings into integers:
			int num1 = Integer.parseInt(a);
			int num2 = Integer.parseInt(b);
								
			System.out.println(num1 + " is less than or equal to " + num2 + ":");
			// If num1 is less than or equal to num2 return true; otherwise return false.
			if (num1 <= num2) {
				System.out.println("True");
				System.out.println();
				return true;
			} else {
				System.out.println("False");
				System.out.println();
				return false;
			}
		}
				
		// isGreaterThanOrEqualTo:
		// Says true if number 1 is greater than number 2;
		// false otherwise.
		public boolean isGreaterThanOrEqualTo(String a, String b) {
			// Change the Strings into integers:
			int num1 = Integer.parseInt(a);
			int num2 = Integer.parseInt(b);
			
			System.out.println(num1 + " is greater than or equal to " + num2 + ":");
			// If num1 is greater than or equal to num2 return true; otherwise return false.
			if (num1 > num2) {
				System.out.println("True");
				System.out.println();
				return true;
			} else {
				System.out.println("False");
				System.out.println();
				return false;
			}
		}
		
		// isZero:
		public boolean isZero() {
			// Change string into an integer.
			int num1 = Integer.parseInt(number1);
			
			System.out.println(num1 + " is zero:");
			// If number is 0, return true; otherwise return false.
			if (num1 == 0) 
				return true;
			else 
				return false;
		}
			
}