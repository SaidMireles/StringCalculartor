package Calculator;

/*Estandares
 * 
 * Variables en español
 * Codigo Identado
 * 
 * 
 */

public class StringCalculator {

	public String agrega(String stgCadena) {
		
		
		String valor = validaString(stgCadena);
		return valor;
		
		//String[] sinComas = validaComas(tipoDato);
	    //return sinComas;
		
	}

public String validaString(String stgCadena) {
		
		String tipoDato = stgCadena.getClass().getName();
		if (tipoDato == "java.lang.String") {
			return tipoDato;			
		}
		return null;
	}
	
public String validaComas(String stgCadena) {
		
	String[] sinComas = stgCadena.split(",");

		return sinComas.toString();
	}

		
}
