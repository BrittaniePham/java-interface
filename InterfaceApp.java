package a05_interface;

public class InterfaceApp {
	public static void main(String[] args) {
		Shape[] shapes = { 
					new Rectangle(6, 3), 
					new Rectangle(5, 4), 
					new Square(4), 
					new Square(3),
					new IsoscelesRightTriangle(5), 
					new IsoscelesRightTriangle(3), 
					new Circle(7), 
					new Circle(2) 
				};
		System.out.println("Shape Array: ");
		System.out.println("------------");
	}
}
