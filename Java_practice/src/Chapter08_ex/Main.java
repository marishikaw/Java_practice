package Chapter08_ex;

public class Main {
	public static void main(String[] args) {
		Cleric c = new Cleric();
		c.name = "クレリック";
		
		c.selfAid();
		c.pray(3);
	}
}
