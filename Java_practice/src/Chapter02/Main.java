package Chapter02;

public class Main {

	public static void main(String[] args) {
		int val = 7;
		boolean flg = true;
		if (flg == true) {
			do {
				System.out.println(val);
			} while (val > 10);
		}
		
		char c = 25001;
		System.out.println(c);
		
		String str = "abcde";
		System.out.println(str.indexOf("abcdef"));
		
		String substr = "abcde";
		System.out.println(str.substring(2, 4));
		
		String strnull = null;
		strnull += "null";
		System.out.println(strnull);
		
		StringBuilder sb = new StringBuilder();
		sb.append("abcde");
		sb.reverse();
		sb.replace(1, 3, "a");
		System.out.println(sb);
	}
}
