package Chapter17;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
		} catch (IOException e) {
			System.out.println("エラーが発生しました。");
		}
		
		try (FileWriter fw2 = new FileWriter("data.txt");){
			fw2.write("hello!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		} 
	}
	
}
