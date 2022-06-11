package Oracle;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		System.out.println(m.calc(2.0, 3));
	
		Sample s = new Sample();
	}
	
	private double calc(double a, int b) {
		return (a + b) / 2;
	}
	private double calc(int a, double b) {
		return (a + b) / 2;
	}
}
