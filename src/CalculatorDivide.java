

/**
 * @author Emilija
 * 
 */
public class CalculatorDivide {

	DivisionResult dr;

	public CalculatorDivide() {
		super();
		dr = new DivisionResult();
	}

	public void division(int x, int y) {
		int quotient = x / y;
		dr.setQuotient(quotient);
		int remainder = x % y;
		dr.setRemainder(remainder);
		dr.print();
	}
}
