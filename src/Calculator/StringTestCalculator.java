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
	
	
	@Test
	
	public void validaComas() {
		
		System.out.println("hola mundo");
	 	StringCalculator cadenaComas = new StringCalculator();	
		 /*	assertEquals("",cadenaComas.validaComas("") ); 
		 	assertEquals({},cadenaComas.validaComas("1,2") ); 
		 	assertEquals("1.2",cadenaComas.validaComas("1.2") ); 
		 	assertEquals("1.12.2",cadenaComas.validaComas("1.1,2.2") ); 
		 	assertEquals("1.12.2",cadenaComas.validaComas("1.1,2.2,") ); */
	 	
	 	//System.out.println(cadenaComas.validaComas("1.1,2.2"));
	 	
	}
}
