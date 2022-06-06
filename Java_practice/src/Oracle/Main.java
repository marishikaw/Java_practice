package Oracle;

public class Main {
	public static void main(String[] args) {
		int[] array = new int[0];
		System.out.println(array);
		
		int c[] = new int[2 * 3];
		int x = 2, y = 3;
		int[] d = new int[x * y];
		int f[][] = new int[2][];
		
		Item[] items = new Item[3];
		int total = 0;
		for (int i = 0; i < items.length; i++) {
			total += items[i].price;
		}
		System.out.println(total);
	}
}
