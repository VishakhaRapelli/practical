package Array;

public class DuplicateArray {
	public static void main(String[] args) {
	int[] ar =new int[] {1,2,3,4,2,7,8,8,2};
		System.out.println("Duplicate element in given array:");
		for(int i=0;i<ar.length;i++) {
			for(j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j])
					System.out.println(ar[j]);
			}
		}
	}
	

}
