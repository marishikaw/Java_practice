package Chapter09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Sample[] samples = {
			new Sample(2, "B"),
			new Sample(3, "C"),
			new Sample(1, "A")
		};
		List<Sample> list = new ArrayList<Sample>(Arrays.asList(samples));
		list.sort(new SampleComparator());
		for (Sample s : list) {
			System.out.print(s.getName());
		}
		System.out.println();
		List<Integer> list2 = Arrays.asList(new Integer[] {1, 2, 3});
		list2.sort((a, b) -> -a.compareTo(b));
		for (Integer num : list2) {
			System.out.print(num);
		}
		System.out.println();
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("A");
		list3.add(1,"B");
		for (String str : list3) {
			System.out.print(str);
		}
		System.out.println();
		ArrayList<Item> list4 = new ArrayList<>();
		list4.add(new Item("A", 100));
		list4.add(new Item("B", 200));
		list4.add(new Item("C", 300));
		list4.add(new Item("A", 100));
		list4.remove(new Item("A", 500));
		for (Item item : list4) {
			System.out.print(item.getName());
		}
		System.out.println();
		ArrayList<String> list5 = new ArrayList<>();
		list5.add("A");
		list5.add("B");
		list5.add("C");
		for (String str2 : list5) {
			if("B".equals(str2)) {
				list.remove(str2);
			} else {
				System.out.print(str2);
			}
		}
		System.out.println();
		ArrayList<String> list6 = new ArrayList<>();
		list6.add("A");
		list6.add("B");
		list6.add("C");
		list6.add("D");
		list6.add("E");
		for (String str6 : list6) {
			if("C".equals(str6)) {
				list6.remove(str6);
			}
		}
		for (String str6 : list6) {
			System.out.print(str6);
		}
	}

}
