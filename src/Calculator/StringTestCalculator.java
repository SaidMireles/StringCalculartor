package Calculator;
import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.Test;

public class StringTestCalculator {

	@Test
	
	public void validaCadena () {
		
	 	StringCalculator cadenaCalc = new StringCalculator();	
	 	assertEquals("java.lang.String",cadenaCalc.agrega("") ); 
	 	assertEquals("java.lang.String",cadenaCalc.agrega("1,2") ); 
	 	assertEquals("java.lang.String",cadenaCalc.agrega("1.2") ); 
	 	assertEquals("java.lang.String",cadenaCalc.agrega("1.1,2.2") ); 
	 	
	}
		
}
