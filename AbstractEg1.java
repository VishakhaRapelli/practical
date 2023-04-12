package Abstraction;

abstract class Rectangle {
    double length;
    double width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    abstract double areaOfRectangle();
    
    abstract double perimeterOfRectangle();
}
class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
    
    double areaOfRectangle() {
        return length * width;
    }
    
    double perimeterOfRectangle() {
        return 2 * (length + width);
    }
}
public class AbstractEg1 {
	public static void main(String[] args) {
		Rectangle object = new Square();
		object.areaOfRectangle();
		object.perimeterOfRectangle();
	}

}
