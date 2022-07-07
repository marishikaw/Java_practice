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
		
		int a6 = 10;
		int b6 = 10;
		if ( 10 < a && 10 < ++b6 ) {
			a++;
		}
		System.out.println(a6 + b6);
		
		Object a10 = new Sample(10);
		Object b10 = new Sample(10);
		System.out.println(a10.equals(b10));
	}
}
