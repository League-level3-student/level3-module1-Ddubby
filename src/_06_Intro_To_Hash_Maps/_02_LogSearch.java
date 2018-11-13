package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons.
	 * 
	 * Button 1: Add Entry When this button is clicked, use an input dialog to ask
	 * the user to enter an ID number. After an ID is entered, use another input
	 * dialog to ask the user to enter a name. Add this information as a new entry
	 * to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	HashMap<Integer, String> log = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton search = new JButton();
	JButton view = new JButton();
	JButton remove = new JButton();

	void GUI() {
		frame.add(panel);
		panel.add(add);
		panel.add(search);
		panel.add(view);
		panel.add(remove);
		add.setText("Add a log entry");
		search.setText("Search a log entry");
		view.setText("View entire log");
		remove.setText("Remove a log entry");
		frame.setVisible(true);
		add.addActionListener(this);
		search.addActionListener(this);
		view.addActionListener(this);
		remove.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new _02_LogSearch().GUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if (pressed.equals(add)) {
			String num = JOptionPane.showInputDialog("Enter an ID number:");
			int ID = Integer.parseInt(num);
			String name = JOptionPane.showInputDialog("Enter a name:");
			log.put(ID, name);
		}
		if (pressed.equals(search)) {
			String num = JOptionPane.showInputDialog("Search (ID#):");
			int ID = Integer.parseInt(num);
			for (int i = 0; i < log.size(); i++) {
				if (log.containsKey(ID)) {
					String name = log.get(ID);
					JOptionPane.showMessageDialog(null, name + " has this ID (" + ID + ")");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "This ID cannot be found");
					break;
				}
			}
		}
		if (pressed.equals(view)) {
			JOptionPane.showMessageDialog(null, "Viewing list...");
			for (Integer ints : log.keySet()) {
				String name = log.get(ints);
				JOptionPane.showMessageDialog(null, "ID: " + ints + " Name: " + name);
			}
		}
		if (pressed.equals(remove)) {
			String num = JOptionPane.showInputDialog("Enter an ID number:");
			int ID = Integer.parseInt(num);
			for (int i = 0; i < log.size(); i++) {
				if (log.containsKey(ID)) {
					log.remove(ID);
					JOptionPane.showMessageDialog(null, "Entry with ID " + ID + " has been removed.");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "This ID is not in the log");
					break;
				}
			}
		}
	}
}
