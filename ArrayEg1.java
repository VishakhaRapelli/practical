package Array;
public class ArrayEg1 {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=2;
		a[1]=9;
		a[2]=5;
		a[3]=7;
		a[4]=1;
		System.out.println("Traversing an array by using For each loop");
		for(int i:a)
			System.out.println(i);
		System.out.println("Traversing an array by using forloop");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
	}

}
