/* 
* Brittanie Pham
* CSIS1410
* A04 Inheritance
*/

package a05_interface;

/**
 * This class creates a Rectangle
 * @author Brittanie Pham
 *
 */
public class Rectangle implements Shape, Printable{
	private final int length;
	private final int width;
	
	/**
	 * constructor to initialize fields of a Rectangle
	 * @param length length of a rectangle
	 * @param width width of a rectangle
	 */
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	/**
	 * getter that returns length of a rectangle
	 * @return
	 */
	public int getLength() {
		return length;
	}

	/**
	 * getter that returns width of a rectangle
	 * @return
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * toString method to print Class name and params
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" + getLength() + "x" + getWidth() + ")";	
	}

	@Override
	public double perimeter() {
		return 2 * (getLength() + getWidth());
	}

	@Override
	public double area() {
		return getWidth() * getLength();
	}

	@Override
	public void print() {
		for(int i = 1; i <= width; i++) {
			for(int j = 1; j <= length; j++) {
				if (i == 1 || i == width || j == 1 || j == length)             
	                System.out.print("o ");             
	            else
	                System.out.print("  ");   
			}
			System.out.println();
		}
		System.out.println();
	}	
}
