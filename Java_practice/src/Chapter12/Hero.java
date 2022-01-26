package Chapter12;

public class Hero extends Character {
	String name = "ミナト";
	int hp = 100;
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("5ポイントのダメージを与えた！");
	}
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}
