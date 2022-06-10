package Oracle;

public class Main {
	public static void main(String[] args) {
		Sample s = new Sample();
		String val = s.setValue("Hello");
		s.getValue();
		System.out.println(val);
	}
}
