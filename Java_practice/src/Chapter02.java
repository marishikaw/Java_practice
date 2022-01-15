
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
	}
}
