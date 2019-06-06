import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void sumarTest() {
		Double numero1 = 32D;
		Double numero2 = 2D;
		Double resultado = Calculadora.sumar(numero1, numero2);
		
		System.out.println("El resultado es: " + resultado);
	}
	
	@Test
	public void restarTest() {
		Double numero1 = 32D;
		Double numero2 = 2D;
		Double resultado = Calculadora.resta(numero1, numero2);
		
		System.out.println("El resultado es: " + resultado);
	}
	
	@Test
	public void multiplicacionTest() {
		Double numero1 = 32D;
		Double numero2 = 2D;
		Double resultado = Calculadora.multiplicacion(numero1, numero2);
		
		System.out.println("El resultado es: " + resultado);
	}
	
	@Test
	public void divisionTest() {
		Double numero1 = 32D;
		Double numero2 = 2D;
		Double resultado = Calculadora.division(numero1, numero2);
		
		System.out.println("El resultado es: " + resultado);
	}

}
