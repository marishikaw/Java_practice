package Chapter03;

public class Main {
	public static void main(String[] args) {
		int a1 = 3;
		int b1 = a1 += 5;
		System.out.println(a1 + b1);
	
		int num2 = -10;
		System.out.println(10 * -num2);
		
		int a = 10;
		int b = a++ + a + a-- - a-- + ++a;
		System.out.println(b);
	}
}
