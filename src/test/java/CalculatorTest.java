import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorTest {

	Calculator calc = new Calculator();
	Random rand1 = new Random();
	public static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	DecimalFormat df = new DecimalFormat("#.###");
	

	@Test
	public void test1() {
		
		double first = 0.0;
		double second = 0.0;
		double result = 0.0;
		
		for (int i = 0; i < 5; i++){
			
			first = rand1.nextDouble()*10;
			second =rand1.nextDouble()*10;
			
			
			result = first + second;
			
			LOG.info("Testing the method add with" +first+" and "+second);
			assertEquals(Math.round(calc.add(first, second)), Math.round(result));
		}
	}


}
