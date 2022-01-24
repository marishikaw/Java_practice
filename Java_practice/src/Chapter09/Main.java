package Chapter09;

public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		
		Hero h1 = new Hero("ミナト");
		h1.sword = s;
		System.out.println("現在の武器は" + h1.sword.name);
		
		Hero h2 = new Hero();
		
		System.out.println(h1.hp);
		System.out.println(h2.hp);
		
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
	}
}
