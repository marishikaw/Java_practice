package Oracle;

public class Main {
	public static void main(String[] args) {
		AbstractSample s = new ConcreteSample();
		s.sample();
		
		Ao a = new Ao();
		Ao b = new Bo();
		System.out.print(a.val);
		System.out.println(b.val);
		a.print();
		b.print();
		
		System.out.println();
		Worker worker = new Engineer();
		worker.work();
	}
}
