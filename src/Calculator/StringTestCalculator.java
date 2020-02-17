package Calculator;
import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.Test;

public class StringTestCalculator {

	@Test
	
	void validaCadena (String stgCadena) {
		
	 	StringCalculator cadenaCalc = new StringCalculator();
	 	
	 	assertEquals("lalo",cadenaCalc.agrega("1,2") );

	 	
	 	
	}


}
