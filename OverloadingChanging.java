package Polymorphism;

public class OverloadingChanging {
	static int sum(int a,int b) { //two parameters/arguments
		return a+b;
	}
	static int sum(int x,int y,int z) { //three parameters/arguments
		return x+y+z;
	}
	public static void main(String[] args) {
		System.out.println(OverloadingChanging.sum(2,3));
		System.out.println(OverloadingChanging.sum(2,3,4));
	}

}
