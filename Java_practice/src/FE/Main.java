package FE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		
		for (int i : points) {
			System.out.println(i);
		}
		
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");
		System.out.println("色は" + colors.size() + "種類");
		for (String s : colors) {
			System.out.println(s + "→");
		}
		
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		int tokyo = prefs.get("東京都");
		System.out.println("東京の人口は、" + tokyo);
		prefs.remove("京都府");
		prefs.put("熊本県", 182);
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本の人口は、" + kumamoto);
		
		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + "の人口は、" + value);
		}
	}
}
