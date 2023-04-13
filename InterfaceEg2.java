package Abstraction;
interface shapes{
	void sides();
	default void show() {
		System.out.println("Default Method");
	}
	static int square (int a) {
		return a*a;
	}
}
class Rectangle1 implements shapes{
	@Override
	public void sides() {
		System.out.println("Parent abstract method");
	}
}
public class InterfaceEg2 {
	public static void main(String[] args) {
		shapes obj= new Rectangle1();
		obj.show();
		obj.sides();
		System.out.println(shapes.square(2));
		
	}

}
