package Calculator;
import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.Test;

public class StringTestCalculator {

	@Test
	
	public void validaCadena () {
		
	 	StringCalculator cadenaCalc = new StringCalculator();
	 	
	 	assertEquals("1,2",cadenaCalc.agrega("1,2") );

	 	
	 	
	}


}
