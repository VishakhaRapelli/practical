package Inheritance;

public class SingleInheritance {
	public static void main(String[] args) {
		SIChild child = new SIChild();
		child.display();
		child.show();
		
	}

}
	class SIParent {
		void show() {
			System.out.println("show the details of parent class");
		}
	}
	
