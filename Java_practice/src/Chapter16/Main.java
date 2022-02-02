package Chapter16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		for (int i : points) {
			System.out.println(i);
		}
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("湊");
		names.add("朝香");
		names.add("菅原");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
		
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		System.out.println("色は" + colors.size() + "種類");
		for (String s : colors) {
			System.out.print(s + "→");
		}
		System.out.println("");
		
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for (String s : words) {
			System.out.print(s + "→");
		}
		System.out.println("");
		
		Map<String,Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は、" + tokyo);
		prefs.remove("京都府");
		prefs.put("熊本県", 182);
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は、" + kumamoto);
		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + "の人口は、" + value);
		}
	}
}
