package Final;
 class FinalMethod1 {
	 final void display() {
		 System.out.println("This is a final method");
	 }
}
 class Child1 extends FinalMethod1{
	 public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.display();
	}
 }
