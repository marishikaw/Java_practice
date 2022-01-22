
public class Chapter02 {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int m = Math.max(a, b);
		System.out.println("比較実験：" + 
				a + "と" + b + "とで大きいほうは…" + m);
		
		String age = "31";
		int n =Integer.parseInt(age);
		System.out.println
			("あなたは来年、" + (n + 1) + "歳になりますね。");
	
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、" + r + "歳ですね？");
		
		System.out.println("あなたの名前を入力してください。");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int age2 = new java.util.Scanner(System.in).nextInt();
		System.out.println
			("ようこそ、" + age2 + "歳の" + name + "さん");
		
//		2-1
		int x = 5;
		int y = 10;
		String ans = "x+yは" + (x + y);
		System.out.println(ans);
		
//		2-3
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください。");
		String name2 = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age3 = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		++fortune;
		System.out.println("占いの結果が出ました！");
		System.out.println(age3 + "歳の" + name2 + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("１：大吉　２：中吉　３：吉　４：凶");
	}
}
