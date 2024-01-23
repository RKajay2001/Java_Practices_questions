package Java_Practices_problem;
import java.util.*;
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*-------------Assignment Operators--------------*/
		
		//Declare an integer variable num and assign it the value 10. Increase its value by 5 using an assignment operator, and then print the result.
		int num = 10;
		num = num + 5;
		System.out.println("Value of num " + num);

		//Initialize a double variable price with the value 20.99. Reduce its value by 10 using an assignment operator, and then print the updated price.
		double price = 20.99;
		price = price - 10;
		System.out.println("Value of price " + price);
		

		/*-------------Arithmetic Operators--------------*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("press 1 for Sum \npress 2 for product");
		int Cal_value;
		
		Cal_value = input.nextInt();
		int a, b, result;
		
		System.out.println("Enter value of a");
		a = input.nextInt();
		
		System.out.println("Enter value of b");
		b = input.nextInt();
		
		//1.Write a Java program to calculate the sum of two numbers and display the result.
		if(Cal_value == 1) {
			result = a + b;
		}
		//2.Create a Java program that takes two integers as input and calculates their product.
		else {
			result = a * b;
		}
		System.out.println("result: " + result);
		
		
		/*-----------Relational Operators-------------*/
		
		//1.Write a Java program to compare two variables and print whether they are equal or not.
		if(a == b) {
			System.out.println("given two number are equal");
		}
		else {
			System.out.println("given two number are not equal");
		}
		
		
		//2.Declare two integers a and b. Write a program that checks if a is greater than or equal to b, and print the result.
		if(a >= b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		
		
		/*--------------Logical Operators------------------*/
		
		//1.Create a Java program that checks if a given number is both greater than 10 and less than 20. Print the result.
		
		if((a >= 10) && (a <= 20)) {
			System.out.println("given number a is greater than 10 and its less than 20");
		}
		else {
			System.out.println("given number a is not greater than 10 and its less than 20");
		}
		
		//2.Declare two boolean variables, hasMoney and isWeekend. Write a program that prints whether a person can go shopping. They can go shopping if they have money (hasMoney) or if it's the weekend (isWeekend).
		
		boolean hasMoney, isWeakend;
		
		hasMoney = input.nextBoolean();
		System.out.println("boolean value for hasMoney");
		isWeakend = input.nextBoolean();
		System.out.println("boolean value for isWeakend");
		
		if(hasMoney || isWeakend) {
			System.out.println("You can go for shopping");
		}
		else {
			System.out.println("You can't go for shopping");
		}
	}

}
