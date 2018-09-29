/* 
* Brittanie Pham
* CSIS1410
* A04 Inheritance
*/

package a05_interface;

/**
 * Class to create an Isosceles Right Triangle
 * @author Brittanie Pham
 *
 */
public class IsoscelesRightTriangle {
	private final int leg;
	
	/**
	 * Constructor to initialize fields of an Isosceles Right Triangle
	 * @param leg
	 */
	public IsoscelesRightTriangle(int leg) {
		this.leg = leg;
	}
	
	/**
	 * method to calculate and return the hypotenuse of a right triangle
	 * @return
	 */
	public double hypotenuse() {
		double hyp = Math.hypot(leg, leg);
		return Math.round(hyp * 10) / 10d;
	}

	/**
	 * getter method to return the leg of a right triangle
	 * @return
	 */
	public int getLeg() {
		return leg;
	}
	
	/**
	 * override toString method that returns the class name and parameter of the triangle (leg)
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" + getLeg() + ")";	
	}
}
