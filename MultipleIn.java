package Abstraction;
interface Vehical {
	void running();
}
interface Heavy_vehical {
	void capacity();
}
class Car implements Vehical,Heavy_vehical {
	void speed() {
		System.out.println("Car speed is very high");
	}
	@Override
	public void capacity() {
		System.out.println("2nd parent interface method");
	}
@Override
public void running() {
		System.out.println("1st parent interface method");
	}
	
}
public class MultipleIn {
	public static void main(String[] args) {
		Car d = new Car();
		d.speed();
		d.running();
		d.running();
	}

}
