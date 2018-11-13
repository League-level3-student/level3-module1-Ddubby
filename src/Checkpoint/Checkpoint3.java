package Checkpoint;

import java.util.HashMap;

public class Checkpoint3 {
public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<String, String>();
	map.put("Hello", "Ni Hao");
	map.put("Bye", "Zai Jian");
	map.put("Duck", "Ya Zi");
	map.put("Chicken", "Ji");
	map.put("Thank you", "Zai Jian");
	for (int i = 0; i < 1; i++) {
		System.out.println(map.entrySet());
	}
}
}
