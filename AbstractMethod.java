package Abstraction;
abstract class Testabstract{
	abstract void display();
}
class Demo1 extends Testabstract {
	void display(){
	System.out.println("Demo1 method invoked");
}
}
class Demo2 extends Testabstract{
	void display() {
		System.out.println("demo2 method invoked");
	}
}


public class AbstractMethod {
	public static void main(String[] args) {
		Demo1 child1 = new Demo1();
		Demo2 child = new Demo2();
		child1.display();
		child2.display();
	}

}
