package Oracle;

public class Main {
	public static void main(String[] args) {
		for (int i = 0, j = 0; i < 3 && j< 5; i++) {
			System.out.println(i++);
			j += i;
		}
		
		for (int i = 0; i < 3; i++, period()) {
			System.out.print(i);
		}
		

	}
	private static void period() {
		System.out.print(",");
	}
}
