/*
* DrawingShapes.java
* Author: Kellen Brown
* Statement of Academic Honesty: *
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from anywhere other than the authorized
* sources. I recognize that any unauthorized sharing, assistance,
* or plagiarism will be handled in accordance with both the
* University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based on
* an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing or posting * of source code at any time for this project is prohibited.
*/
import java.util.Scanner;
public class DrawingShapes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	//User enters a letter representing what shape they want to print
		System.out.println("Enter a shape: r t h o p");
		char shapeLetterChoice = scan.next().charAt(0);
		int length;
		int height;
		
	//Based on the chosen shape and if it is valid, the switch statement executes different code
	// depending on the shape
		switch (shapeLetterChoice) {
		case 'r': //Rectangle
		
		System.out.println("Enter a length");
		length = scan.nextInt();
		if (length <= 1) {
			System.out.println("Length must be greater than 1");
			System.out.println("Goodbye!");
			System.exit(0);
		}
		
		System.out.println("Enter a height");
		height = scan.nextInt();
		if (height <= 1) {
			System.out.println("Height must be greater than 1");
			System.out.println("Goodbye!");
			System.exit(0);
		}
		
		System.out.println("Below is a " + length + " by " +  height + " rectangle of *");
		
	//Nested for loop that prints stars consecutively height and length times
		for (int i = 0; i < height; ++i) {
			for (int j = 0; j < length; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		break;
		case 't': //Triangle
		
		System.out.println("Enter a length");
		length = scan.nextInt();
		if (length <= 1) {
			System.out.println("Length must be greater than 1");
			System.out.println("Goodbye!");
			System.exit(0);
		}
		
		System.out.println("Below is a triangle with two side lengths of " + length + " *");
	
	//Nested for loop that prints stars consecutively length times, prints more stars as 'i' increases.
		for (int i = 0; i < length; ++i) {
			for (int j = 1; j < (length * 2); ++j) {
				if (j >= (length - i) && j <= (length + i)) {
					System.out.print("*");
				}
				else if (j < (length - i) || j > (length + i)) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		break;
		case 'h': //Hexagon
			
		System.out.println("Enter a length");
		length = scan.nextInt();
		if (length <= 1) {
			System.out.println("Length must be greater than 1");
			System.out.println("Goodbye!");
			System.exit(0);
		}
		
		System.out.println("Below is a hexagon with side lengths of " + length + " *");
		int k = length - 1; //Iteration variable that increments for the bottom section
		
	//Nested for loop that prints stars consecutively length times, 2 branches to 
	// differentiate between the top and bottom half of the hexagon.
		for (int i = 0; i < (length * 2) - 1; ++i) {
			if (i < length) { //Top section, prints more stars per row as 'i' increases.
			for (int j = 1; j <= (length * 3) - 2; ++j) {
		
					if (j >= length - i && j < 2 * length + i) {
					System.out.print("*");
					}
					else {
					System.out.print(" ");
				}
				}
			}
			else { //Bottom section, prints less stars per row as 'i' increases.
				for (int j = 1; j <= (length * 3) - 2; ++j)
					if (j >= length - k + 1 && j < 2 * length + k - 1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
				}
			}
			k = i >= length ? --k : k;
			System.out.println();
			}
		
		break;
		case 'o': //Octagon
			
		System.out.println("Enter a length");
		length = scan.nextInt();
		if (length <= 1) {
			System.out.println("Length must be greater than 1");
			System.out.println("Goodbye!");
			System.exit(0);
		}
		
		System.out.println("Below is an octagon with side lengths of " + length + " *");
		k = length - 2; //Iteration variable that increments for the bottom section
		
	//Nested for loops with three different branches differentiating between the top, middle, and 
	// bottom sections of the octagon.
		for (int i = 0; i < (length * 3) - 2; ++i) {
			if (i < length - 1) { //Top section, prints more stars per row as 'i' increases.
				for (int j = 1; j <= (length * 3) - 2; ++j) {
					if (j >= length - i && j < length * 2 + i) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			else if (i >= length - 1 && i < length * 2 - 2) { //Middle section, prints the same amount of stars per row for the body.
				for (int j = 1; j <= (length * 3) - 2; ++j) {
					System.out.print("*");
				}
			}
			else {
				for (int j = 1; j <= (length * 3) - 2; ++j) { //Bottom section, prints less stars per row as 'i' increases.
					if (j >= length - k - 1 && j <= (length * 3 - 2) + (k - (length - 2))) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			k = i >= length * 2 - 2 ? --k : k;
			System.out.println();
		}

		
		break;
		case 'p': //Pentagon
			
		System.out.println("Enter a length");
		length = scan.nextInt();
		if (length <= 1) {
			System.out.println("Length must be greater than 1");
			System.out.println("Goodbye!");
			System.exit(0);
		}
		
		System.out.println("Below is a pentagon with 4 side lengths of " + length + " *");
		
	//Nested for loops with two branches differentiating between the top and body of a pentagon
		for (int i = 0; i < length * 2 - 1; ++i) {
			if (i < length) { //Top section, prints more stars per row as 'i' increases.
				for (int j = 0; j < length * 2 - 1; ++j) {
					if (j >= length - i - 1 && j <= length + i - 1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			else { //Body section, prints the same amount of stars per row.
				for (int j = 1; j <= length * 2 - 1; ++j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		break;
		default: //Prints if not a valid shape
			System.out.println("Invalid shape");
			System.out.println("Goodbye!");
		break;
		}
		
	}
}
