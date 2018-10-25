package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	String currentWord = "";
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	String space = "";
	Stack<String> stack = new Stack<String>();
	public static void main(String[] args) {
		new HangMan().GUI();
	}

	void GUI() {
		String size = JOptionPane.showInputDialog("Enter a number:");
		int wordSize = Integer.parseInt(size);
		frame.setVisible(true);
		frame.add(panel);
		frame.add(label);
		frame.setSize(500, 500);
		frame.addKeyListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < Utilities.getTotalWordsInFile("dictionary.txt"); i++) {
			String word = Utilities.readRandomLineFromFile("dictionary.txt");
			if (!stack.contains(word)) {
				if (word.length() == wordSize) {
					stack.push(word);
					//System.out.println(word);
				}
			} 
		}
		currentWord = stack.pop();
		for (int i = 0; i < currentWord.length(); i++) {
			space = "_" + space;
		}
		label.setText(space);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String guess = String.valueOf(e.getKeyCode());
		String newDisplayed = "";
		String displayedWord = label.getText();
		for (int i = 0; i < currentWord.length(); i++) {
			if(e.getKeyChar() == currentWord.charAt(i)) {
				newDisplayed += currentWord.charAt(i);
			} else {
				newDisplayed += displayedWord.charAt(i);
			}
			}
		displayedWord = newDisplayed;
		label.setText(displayedWord);
		}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
