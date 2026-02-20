/**
	* Lesson: Input
	* Author: Mikah Ho
	* Date Created: February 17, 2026
	* Date Last Modified: February 18, 2026
	*/

	import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here

		Scanner input = new Scanner(System.in);

		String name;

		System.out.print("What is your name: ");
		name = input.nextLine();

		System.out.println(name);

	}

	public static void q2() {
		//Write question 2 code here

		Scanner input = new Scanner(System.in);

		int num;

		System.out.print("Input a whole number: ");
		num = input.nextInt();
		input.nextLine();

		System.out.println(2*num + 2);
		
	}

	public static void q3() {
		//Write question 3 code here

		Scanner input = new Scanner(System.in);

		double radius;

		System.out.print("Input a radius: ");
		radius = input.nextDouble();
		input.nextLine();

		System.out.println(2*3.14*radius); //circumference
		System.out.println(3.14*radius*radius); //area
		
	}

	public static void q4() {
		//Write question 4 code here

		Scanner input = new Scanner(System.in);

		String firstName;
		String lastName;
		int age;

		System.out.print("Input a first name: ");
		firstName = input.nextLine();

		System.out.print("Input a last name: ");
		lastName = input.nextLine();

		System.out.print("Input an age: ");
		age = input.nextInt();
		input.nextLine();
		
		System.out.println(lastName + ", " + firstName + " - " + age);
	}

	public static void q5() {
		//Write question 5 code here

		Scanner input = new Scanner(System.in);

		String name;
		int age;
		int iq;

		System.out.print("Input a name: ");
		name = input.nextLine();

		System.out.print("Input an age: ");
		age = input.nextInt();

		iq = age;
		age = age + 3;

		System.out.print(name + age + "\n" + iq + "\n");
		
	}

}
