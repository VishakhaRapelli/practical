package Super;
class shape2 {
	void Shape2()
	{
		System.out.println("Hello");
	}
}
class Size2 extends shape2 {
	Size2() {
		super();
		System.out.println("Hii");
	}
}
public class Supercons {
	public static void main(String[] args) {
		Size2 obj = new Size2();
	}

}
