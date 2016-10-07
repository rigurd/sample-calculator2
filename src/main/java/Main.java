
/**
 * Main class. 
 **/

public class Main {
	public static void main(String[] args){
		
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(5, 8));
		System.out.println(calc.multiply(9, 9));
		System.out.println(calc.divide(10, 100));
		System.out.println(calc.subtract(25, 35));
		
	}

}
