package Oracle;

public class Main {
	public static void main(String[] args) {
		String[][] array = {{ "A", "B"}, { "C", "D", "E"}};
		int total = 0;
		for (String[] tmp : array) {
			total += tmp.length;
		}
	
		test_a[] array2 = {new test_c(), null, new test_d()};
		Object[] objArray = array2;
		
		int[][] arrayA = {{1, 2}, {1, 2}, {1, 2, 3}};
		int[][] arrayB = arrayA.clone();
		int total2 = 0;
		
		System.out.println(arrayA == arrayB);
		
		for (int[] tmp : arrayB) {
			for (int val : tmp) {
				total2 += val;
				System.out.print(val + ",");
			}
			System.out.println();
			
			System.out.println(total2);
		}
		
		Object obj = null;
		System.out.println(obj);
	}
}
