package Method;

public class Userdefined_Method {
	public int add(int a, int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		Userdefined_Method obj = new Userdefined_Method();
		System.out.println(obj.add(20, 3));
	}
}
