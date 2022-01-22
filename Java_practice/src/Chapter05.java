
public class Chapter05 {
	public static void main(String[] args) {
		int ans = add(100, 10);
		System.out.println("100 + 10 = " + ans);
		
		System.out.println(add2(10, 20));
		System.out.println(add2(3.5, 2.7));
		System.out.println(add2("Hello", "World"));
		
		System.out.println("10+20=" + add3(10, 20));
		System.out.println("10+20+30=" + add3(10, 20, 30));
		
		int[] array = {1, 2, 3};
		printArray(array);
		
		int[] array2 = {1, 2, 3};
		incArray(array2);
		for (int i : array2) {
			System.out.println(i);
		}
		
		int[] array3 = makeArray(3);
		for (int i : array3) {
			System.out.println(i);
		}
	}
	
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	
	public static int add2(int x, int y) {
		return x + y;
	}
	public static double add2(double x, double y) {
		return x + y;
	}
	public static String add2(String x, String y) {
		return x + y;
	}
	
	public static int add3(int x, int y) {
		return x + y;
	}
	public static int add3(int x, int y, int z) {
		return x + y + z;
	}
	
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
	}
	
	public static void incArray(int[] array2) {
		for (int i = 0; i < array2.length; i++) {
			array2[i]++;
		}
	}
	
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}
}
