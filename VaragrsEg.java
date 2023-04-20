package Encapsulation;

public class VaragrsEg {
	static void show(String...text) {
		System.out.println("show method invoked");
		for(String s:text) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		show();
		show("hi");
		show("I","Love","coding");
		show("a","v","d","e","h");
	}

}
