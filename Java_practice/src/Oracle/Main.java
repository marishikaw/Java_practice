package Oracle;

public class Main {
	public static void main(String[] args) {
		String[] array = { "A", "B", "C"};
		for (String str : array) {
			str = "D";
		}
		for (String str : array) {
			System.out.println(str);
		}
		
		int num = 10;
		do {
			num++;
		} while (++num < 10);
		System.out.println(num);
		
		num = 10;
		while (num++ <= 10) {
			num++;
		}
		System.out.println(num);
		
		int[] array2 = { 1, 2, 3, 4, 5};
		int total = 0;
		for (int i : array2) {
			if (i % 2 == 0) {
				continue;
			}
			total += i;
		}
		System.out.println(total);
		
		System.out.println(1 % 2);
		
		total = 0;
		a: for (int i = 0; i < 5; i++) {
			b: for (int j = 0; j < 5; j++) {
				if (i % 2 == 0) continue a;
				if (3 < j) break b;
				total += j;
			}
		}
		System.out.println(total);
	}
}
