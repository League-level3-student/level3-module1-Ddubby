package _01_IntroToArrayLists;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	ArrayList<Song> songs = new ArrayList<Song>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	Song currentSong;
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		Song song = new Song("demo.mp3");	
		Song song2 = new Song("338986__drfx__music-box-melody-1.mp3");
		Song song3 = new Song("262259__shadydave__snowfall-final.mp3");
		Song song4 = new Song("326553__shadydave__the-sonata-piano-loop.mp3");
		songs.add(song);
		songs.add(song2);
		songs.add(song3);
		songs.add(song4);
		frame.setVisible(true);
		button.addActionListener(this);
		frame.add(panel);
		panel.add(button);
		panel.setPreferredSize(new Dimension(200, 50));
		frame.pack();
		button.setText("Surprise Me!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(currentSong != null) {
			currentSong.stop();
		}
		JButton buttonPressed = (JButton) e.getSource();
		Random random = new Random();
		int songNumber = random.nextInt(4);
		if(button.equals(buttonPressed)) {
		currentSong = songs.get(songNumber);
		currentSong.play();
		}
		
	}
}