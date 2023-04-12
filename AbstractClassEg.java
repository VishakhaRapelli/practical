package Abstraction;
abstract class Parentabs{
	Parentabs () {
		System.out.println("No-args Cons");
	}
	abstract void show();
	void run() {
		System.out.println("Non abstract method");
	}
}
class Childabs extends Parentabs{
	@override
	void show() {
		System.out.println("Parent class abstract method");
	}
}
public class AbstractClassEg {
	public static void main(String[] args) {
		Parentabs object = new Childabs();
		object.show();
		object.run();
	}

}
