package Polymorphism;

public class TestOverring {
	void run() { //method 1
		System.out.println("Running mode on");
	}
}
class Overriding extends TestOverring {
	
	//defining same name method as its declared in the parent class
	void run() {
		System.out.println("running mode off");
	}
	public static void main(String[] args) {
		//Creating a object of child class
		Overriding obj=new Overriding();
		obj.run();
		
	}

}
