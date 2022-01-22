
public class Chapter05_ex {
	public static void main(String[] args) {
		introduceOneself();
		
		String title = "タイトル";
		String address = "1@example.com";
		String text = "メールの本文です";
		email(title, address, text);
		
		String address2 = "2@example.com";
		String text2 = "オーバーロールしたメールの本文です";
		email(address2, text2);
		
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積：" + triangleArea + "平方cm");
		
		double circleArea = calcCircleArea(5.0);
		System.out.println("円の面積：" + circleArea + "平方cm");
	}
	
	//5-1
	public static void introduceOneself() {
		String name = "石川";
		int age = 35;
		double tall = 160.0;
		char eto = '寅';
		System.out.println(name + " (" + age + ") " + tall + "cm " + eto + "年");
	}
	
	//5-2
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	//5-3
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
	
	//5-4
	public static double calcTriangleArea(double bottom, double height) {
		double area = (bottom * height) / 2;
		return area;
	}
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
}
