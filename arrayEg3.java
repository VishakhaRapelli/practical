package Array;
import java.util.Scanner; 
public class arrayEg3 {
	int n;
	int[]s=new int[n];
	public static void main(String[] args) {
		arrayEg3 obj = new arrayEg3();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n= sc.nextInt();
		int sum=0,avg=0,multi=1;
		for(int i=0;i<obj.n;i++) {
			obj.s[i]=sc.nextInt();
			sum=sum+obj.s[i];
			avg=sum/n;
			multi=multi*obj.s[i];
		}
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(multi);
	}

}
