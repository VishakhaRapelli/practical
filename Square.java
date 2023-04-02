import java.util.*;
public class Square {
	public static void main(String args[]) {
		float side, area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side length of square:");
		side= sc.nextFloat();
		area = 4*side;
		System.out.println("Area ="+area);
	}

}
