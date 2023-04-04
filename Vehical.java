package Inheritance;

public class Vehical {
	void running() {
		System.out.println("running mode on ");
		
	}
}
	class Car extends Vehical{
		void run() {
			System.out.println("car run mode on");
		}
	}
	class I10 extends Car {
		void speed() {
			System.out.println("speed is very high");
		}
	
public static void main(String args[]) {
	I10 d = new I10();
	d.running();
	d.run();
	d.speed();
}
}
