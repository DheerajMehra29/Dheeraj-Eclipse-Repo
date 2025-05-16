package HashMapJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("USA", 200);
		map.put("UK", 175);
		map.put("INDIA", 300);
		map.put("CHINA", 350);
		System.out.println(map);
		map.put("SWEDEN", 100);
		System.out.println(map);
		map.put("INDIA", 325);
		System.out.println(map);
		System.out.println(map.get("INDIA"));
		System.out.println(map.get("SOUTH AFRICA"));
		map.remove("USA");
		System.out.println(map);
		System.out.println(map.containsKey("INDIA"));
		System.out.println(map.containsKey("USA"));
		System.out.println("***************");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
		System.out.println("*********");
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);

		}
		System.out.println("*************");
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		for (Map.Entry<String, Integer> entry : entrys) {
			System.out.println(entry);
		}
		System.out.println("***********");
		String str = "aabbaaabcdda";
		System.out.println(getMaxFreq(str));
		System.out.println("**************");
		int[] one = { 5, 1, 3, 4, 7 };
		int[] two = { 2, 4, 3, 5, 7, 10, 15 };
		ArrayList<Integer> list = getIntersection(one, two);
		System.out.println(list);

	}

	public static char getMaxFreq(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (map.containsKey(cc)) {
				int oldvalue = map.get(cc);
				int newval = oldvalue + 1;
				map.put(cc, newval);
			} else {
				map.put(cc, 1);

			}
		}
		char maxChar = '\0';
		int max = 0;
		Set<Map.Entry<Character, Integer>> entrys = map.entrySet();
		for (Map.Entry<Character, Integer> entry : entrys) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				maxChar = entry.getKey();
			} 
		}
		return maxChar;
	}

	public static ArrayList<Integer> getIntersection(int[] one, int[] two) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < one.length; i++) {
			map.put(one[i], false);
		}
		for (int j = 0; j < two.length; j++) {
			if (map.containsKey(two[j])) {
				map.put(two[j], true);
			}
		}
		Set<Map.Entry<Integer, Boolean>> entrys = map.entrySet();
		for (Map.Entry<Integer, Boolean> entry : entrys) {
			if (entry.getValue()) {
				list.add(entry.getKey());
			}
		}
		return list;
	}
}