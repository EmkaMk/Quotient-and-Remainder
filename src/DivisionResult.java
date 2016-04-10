/**
 * 
 */

/**
 * @author Emilija
 * 
 */
public class DivisionResult {

	private int quotient;
	private int remainder;

	public void setQuotient(int quotient) {
		this.quotient = quotient;
	}

	public void setRemainder(int remainder) {
		this.remainder = remainder;
	}

	public void print() {
		System.out.println("The quotient is " + this.quotient);
		System.out.println("The remainder is " + this.remainder);
	}

}
