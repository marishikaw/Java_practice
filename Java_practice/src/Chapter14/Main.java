package Chapter14;

public class Main {
	public static void main(String[] args) {
		Empty e = new Empty();
		String s = e.toString();
		System.out.println(s);
		
		Object o1 = new Empty();
		Object o2 = new Hero();
		Object o3 = "こんにちは";
		
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		System.out.println(h1.toString());
		
		Hero h2 = new Hero();
		h2.name = "ミナト";
		h2.hp = 100;
		
		if (h1.equals(h2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
		
		Hero.money = 100;
		System.out.println(Hero.money);
		System.out.println(h1.money);
		h1.money = 300;
		System.out.println(h2.money);
		
		Hero.setRandomMOney();
		System.out.println(Hero.money);
		Hero h3 = new Hero();
		System.out.println(h3.money);
	}
	public void printAnything(Object o) {
		System.out.println(o.toString());
	}
}
