package fizzbuzz;

public class Fizzbuzz {
	
	public static String check(Integer i) {
	
		if(i<1) {
			return "doit être supérieur à 0";
		}
		if(i>100) {
			return "doit être inférieur à 100";
		}else if((i%3==0)&&(i%5==0)) {
			return "FIZZBUZZ";	
		}else if(i%3==0) {
			return "FIZZ";
		}else if(i%5==0) {
			return "BUZZ";
		}else {
			return String.valueOf(i);
		}
	}
}
