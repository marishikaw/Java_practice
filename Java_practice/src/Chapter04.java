
public class Chapter04 {
	public static void main(String[] args) {
		// 'new int[]'は省略可
		int [] scores = new int[] {20, 30, 40, 50, 80};
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println("合計店：" + sum);
		System.out.println("平均点：" + avg);
		
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の科目の数は：" + count);
		
		int[] seq = new int[10];
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		for (int i = 0; i < seq.length; i++) {
			char[] base = {'A', 'T', 'G', 'C'};
			System.out.print(base[seq[i]] + " ");
		}
		System.out.println("");
		
		int[] scores2 = {20, 30, 40, 50, 80};
		for(int value : scores2) {
			System.out.print(value + " ");
		}
	}
}
