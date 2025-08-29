package gitready.assignment1;
import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int input1;
		int input2;
		int solution;
		System.out.println("Welcome to the Java Calculator!");
		System.out.println("Please select an opperation: (add, sub, mul, div)");
		String opperationType=scnr.nextLine();
		switch(opperationType.toLowerCase()){
			case "add":
				System.out.println("Integer 1:");
				input1 = scnr.nextInt();
				System.out.println("Integer 2:");
				input2 = scnr.nextInt();
				solution=input1+input2;
				System.out.println("Your sum is: " + solution);
				break;
			case "sub":
				System.out.println("Integer 1:");
				input1 = scnr.nextInt();
				System.out.println("Integer 2:");
				input2 = scnr.nextInt();
				solution=input1-input2;
				System.out.println("Your difference is: " + solution);
				break;
			case "mul":
				System.out.println("Integer 1:");
				input1 = scnr.nextInt();
				System.out.println("Integer 2:");
				input2 = scnr.nextInt();
				solution=input1*input2;
				System.out.println("Your product is: " + solution);
				break;
			case "div":
				System.out.println("Would you like to perform integer divition? (y/n)");
				String divChoice = scnr.nextLine();
				switch (divChoice.toLowerCase()) {
					case "y":
						System.out.println("Integer 1:");
						input1 = scnr.nextInt();
						System.out.println("Integer 2:");
						input2 = scnr.nextInt();
						solution = input1/input2;
						int remainder = input1%input2;
						System.out.printf("Your solution is: %d\nRemainder: %d", solution, remainder);
						break;
					case "n":
						System.out.println("Integer 1:");
						double double1 = scnr.nextDouble();
						System.out.println("Integer 2:");
						input2 = scnr.nextInt();
						double quotient;
						quotient = double1/input2;
						System.out.printf("Your Quotient is: %f\n", quotient);
						break;
					default:
						System.out.println("Incorrect Input, please enter y or n");
						break;
				}
			default:
				System.out.println("Incorrect input, please select between add, sub, mul, div");
				break;
				
			
				
		}
		System.out.println("Thanks for using Java Calculator!");

	}

}
