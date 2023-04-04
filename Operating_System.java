package Inheritance;

public class Operating_System {
	void Boost() {
		System.out.println("Boosting mode on ");
	}
}

	class Windows extends  Operating_System{
		void run() {
			System.out.println("run mode on");
		}
	}
	class Linux extends  Operating_System {
		void storage_capasity() {
			System.out.println("storage capasity is very high");
		}
	}
public class Hierarchical {
	public static void main(String[] args) {
		Linux b = new Linux();
		b.Boost();
		b.storage_capasity();
		Windows c = new Windows ();
		c.run();
		c.Boost();
	}
}
