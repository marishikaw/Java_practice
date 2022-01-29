package Chapter14_ex;

public class Main {
	public static void main(String[] args) {
		Account a = new Account();
		a.balance = 1592;
		a.accountNumber = "4649";
		System.out.println(a);
		
		Account a1 = new Account();
		Account a2 = new Account();
		
		if (a1.equals(a2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
	}
}
