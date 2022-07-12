package Chapter03;

public class Main {
	public static void main(String[] args) {
		int num = 9;
		if (num == 100) {
			System.out.println("A");
		} else if (10 < num) {
			System.out.println("B");
		} else {
			if (num == 10) {
				System.out.println("C");
			} else {
				if (num < 10) {
					System.out.println("D");
				}
			}
		}
		
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




