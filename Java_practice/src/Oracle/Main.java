package Oracle;

public class Main {
	public static void main(String[] args) {
		int[][] dimention = {{2,5},{2,7},{8,3}};
		for (int[] xx : dimention) {
			for (int yy : xx) {
				System.out.print(yy);
			}
			System.out.println(" ");
		}
	}
}
