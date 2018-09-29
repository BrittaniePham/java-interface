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
		double perim = 2 * Math.PI * getRadius();
		return Math.round(perim * 10) / 10d;
	}

	@Override
	public double area() {
		double area = Math.PI * getRadius() * getRadius();
		return Math.round(area * 10) / 10d;
	}
}
