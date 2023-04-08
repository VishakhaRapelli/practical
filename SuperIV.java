package Super;
class Shape {
	String name = "circle";
}
class Size extends Shape{
	String name="No size";
	void print() {
		System.out.println(name);
		System.out.println(super.name);
	}
}
public class SuperIV {
	public static void main(String[] args) {
		Size obj = new Size();
		obj.print();
	}
}
