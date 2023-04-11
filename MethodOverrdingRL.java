package Final;
class Father{
	void shoot() {
		System.out.println("I am the father! I am a right-handed shooter");
	}
	}
	class Child extends Father{
		void shoot() {
			System.out.println("I am the son! I am a left-handed shooter");
		}
	}
public class MethodOverrdingRL {
	public static void main(String[] args) {
		Father f = new Father();
		f.shoot();
		Father fc = new Child();
		fc.shoot();
	}

}
