class Datatype_Test{
	int a;
	short b;
	long c;
	double m;
	float h;
	void show(){
	System.out.println("int"+a);
	System.out.println("short"+b);
	System.out.println("long"+c);
	System.out.println("double"+m);
	System.out.println("float"+h);
}
public static void main(String args[])
{
	Datatype_Test object=new Datatype_Test();
	object.show();
}
}