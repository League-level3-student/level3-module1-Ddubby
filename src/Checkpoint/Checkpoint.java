package Checkpoint;

import java.util.ArrayList;
import java.util.Random;

public class Checkpoint {
public static void main(String[] args) {
	ArrayList<Cow> cows = new ArrayList<Cow>();
	Random random = new Random();
	int num = random.nextInt(20);
	for (int i = 0; i < num; i++) {
		cows.add(new Cow());
	}
	for (int i = 0; i < cows.size(); i++) {
		Cow e = cows.get(i);
		e.feed();
	}
}
}
