package Oracle;

public class Main {
	public static void main(String[] args) {
		String a = "abc";
		String b = new String(a);
		
		int count = 0;
		if (a.intern() == "abc") {
			count++;
		}
		if (b.intern() == "abc") {
			count++;
		}
		if (a.intern() == b.intern()) {
			count++;
		}
		System.out.println(count);
		
		int num = 10;
		if (num <= 10);
		System.out.println("ok");
		
		if(false)
		System.out.println("A");
		System.out.println("B");
		
		int number = 1;
		switch (number) {
		case 1:
		case 2:
		case 3: System.out.println("A");
		case 4: System.out.println("B");
		default:
			System.out.println("C");
		}
	}
}
