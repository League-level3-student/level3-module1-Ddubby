package Checkpoint;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Checkpoint2 {
public static void main(String[] args) {
	Stack<Integer> ints = new Stack<Integer>();
	Random random = new Random();
	int num = 0;
	int sum = 0;
	for (int i = 0; i < 10; i++) {
		num = random.nextInt(20);
		ints.push(num);
	}
	for (int i = 0; i < 10; i++) {
		int popped = ints.pop();
		sum = sum + popped;
	}
	JOptionPane.showMessageDialog(null, "The sum is " + sum);
}
}
