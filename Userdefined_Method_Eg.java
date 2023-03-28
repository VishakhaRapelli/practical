package Method;
import java.util.*;
public class Userdefined_Method_Eg {
  public static void positive_or_negative(int number) {
	  if(number>0) {
		  System.out.println("positive");
	  }
	  else {
		  System.out.println("negative");
	  }
	  
  }
  public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the numbers:");
	int number = sc.nextInt();
	positive_or_negative(number);
}
  }
