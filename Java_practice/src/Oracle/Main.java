package Oracle;

public class Main {
	public static void main(String[] args) {
		int a1 = 3;
		int b1 = a1 += 5;
		System.out.println(a1 + b1);
		
		byte a3 = (byte)0b10000000;
		short b3 = 128 + 128;
		int c3 = (int)(2 * 3L);
		float d3 = (float)10.0;
		
		int a4 = 10;
		int b4 = a4++ + a4 + a4-- - a4-- + ++a4;
		System.out.println(b4);
		
		Sample a = new Sample(10, "a");
		Sample b = new Sample(10, "b");
		System.out.println(a.equals(b));
	}
}
