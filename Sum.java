package Method;
import java.util.*;

public class Sum {
	
	
 public static void main(String[] args) {
	 int a, b, c ,avg;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter value of a");
	 a=sc.nextInt();
	 Scanner sc1=new Scanner(System.in);
	 System.out.println("Enter value of b");
	 b=sc.nextInt();
	 Scanner sc2=new Scanner(System.in);
	 System.out.println("Enter value of c");
	 c=sc2.nextInt();
	 System.out.println("Average:");
	 int sum=a+b+c;
	 avg=sum/3;
		System.out.println(avg);
}
}
