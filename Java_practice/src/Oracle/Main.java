package Oracle;

public class Main {
	public static void main(String[] args) {
		Object a = new Sample(10);
		Object b = new Sample(10);
		System.out.println(a.equals(b));
		
		String a12 = new String("sample");
		String b12 = "sample";
		System.out.print(a12 == b12);
		System.out.print(", ");
		System.out.print(a12.equals(b12));
	}
}
