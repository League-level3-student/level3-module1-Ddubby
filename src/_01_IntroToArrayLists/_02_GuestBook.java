package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	public static void main(String[] args) {
		new _02_GuestBook().GUI();
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	ArrayList<String> names = new ArrayList<String>();

	void GUI() {
		frame.add(panel);
		frame.setVisible(true);
		panel.add(button);
		panel.add(button2);
		button.addActionListener(this);
		button2.addActionListener(this);
		button.setText("Add Name");
		button2.setText("View Names");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (button.equals(buttonPressed)) {
			String name = JOptionPane.showInputDialog("Add a name:");
			names.add(name);
		}
		if (button2.equals(buttonPressed)) {
			for (int i = 1; i < names.size()+1; i++) {
				String s = names.get(i-1);
				System.out.println("Guest #" + i + ": " + s);
			}
		}
	}

}
