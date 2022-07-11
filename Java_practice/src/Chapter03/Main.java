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
		
		Object a11 = new Object();
		Object b11 = null;
		System.out.println(a11.equals(b11));
		
		String a12 = "sample";
		String b12 = "sample";
		System.out.print(a12 == b12);
		System.out.print(", ");
		System.out.println(a12.equals(b12));
		
		String a13 = new String ("sample");
		String b13 = "sample";
		System.out.print(a13 == b13);
		System.out.print(", ");
		System.out.println(a13.equals(b13));
		
		String a14 = "abc";
		String b14 = new String(a14);
		int count = 0;
		if (a14.intern() == "abc") {
			count++;
		}
		if (b14.intern() == "abc") {
			count++;
		}
		if (a14.intern() == b14.intern()) {
			count++;
		}
		System.out.println(count);
	}
}




