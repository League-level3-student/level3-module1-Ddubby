package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		int larger;
		int smaller;
		// 1. Create a Stack of Doubles
		// Don't forget to import the Stack class
		Stack<Double> doubles = new Stack<Double>();
		// 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random random = new Random();
		double number = random.nextInt(100);
		for (int i = 0; i < 99; i++) {
			number = random.nextInt(100);
			doubles.push(number);
		}
		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		String number1 = JOptionPane.showInputDialog("Enter a number between 0 and 100 (inclusive)");
		String number2 = JOptionPane.showInputDialog("Enter a number between 0 and 100 (inclusive)");
		// 4. Pop all the elements off of the Stack. Every time a double is popped that
		// is between the two numbers entered by the user, print it to the screen.
		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);
		if (num1 > num2) {
			larger = num1;
			smaller = num2;
		} else {
			smaller = num1;
			larger = num2;
		}
		System.out.println("Popping elements off stack...");
		System.out.println("Elements between " + smaller + " and " + larger + ": ");
		for (int i = 0; i < doubles.size(); i++) {
			double num = doubles.pop();
			if (smaller < num && num < larger) {
				System.out.println(num);
			}

		}

		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}
