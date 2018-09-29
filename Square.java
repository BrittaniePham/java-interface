/* 
* Brittanie Pham
* CSIS1410
* A04 Inheritance
*/

package a05_interface;

/**
 *  This class creates a square
 * @author Brittanie Pham
 *
 */
public class Square extends Rectangle implements Shape, Printable{

	/**
	 * constructor to initialize fields of a square
	 * @param side side of square
	 */
	public Square(int side) {
		super(side, side);
	}
	
	/**
	 * getter method that returns the length of a side of the square
	 * @return
	 */
	public int getSide() {
		return super.getLength();
	}
	
	/**
	 * toString method override to print the Class name and the param side
	 */
	@Override
	public String toString() {
		// Override the toString method so that it 
		// will return a String of the following form:
		// Square(side) e.g. Square(4)
		return getClass().getSimpleName() + "(" + getLength() + ")";
	}

}
