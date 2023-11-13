package fizzbuzz;

public class App {

	public static void main(String[] args) {
		
		for(int i=-5; i<=103; i++) {
			System.out.println(i +": \t" + Fizzbuzz.check(i));
		}
	}
}
