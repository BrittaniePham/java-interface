/* 
* Brittanie Pham
* CSIS1410
* A04 Inheritance
*/

package a05_interface;

public class Circle implements Shape{
	private final int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int diameter() {
		return radius * 2;
	}
	
	public double circumference() {
		double circumference = 2 * Math.PI * radius;
	    return Math.round(circumference * 10)/10d;
		
	}

	public int getRadius() {
		return radius;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" + getRadius() + ")";
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
}
