
public class Chapter04_ex {
	public static void main(String[] args) {
//		4-1
		int[] points = new int[3];
		double[] weights = new double[4];
		boolean[] answers = new boolean[2];
		String[] names = new String[2];
		
//		4-2
		int[] moneyList = {121902, 8302, 55100};
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		for (int value : moneyList) {
			System.out.println(value);
		}
		
//		4-4
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int n : numbers) {
			if (n == input) {
				System.out.println("当たり！");
			}
		}
	}
}
