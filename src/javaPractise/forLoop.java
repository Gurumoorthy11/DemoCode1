package javaPractise;

public class forLoop {

	public static void main(String args[]){
		int arr[]=new int[]{1,2,3,4,5,6,7,8};
		
		System.out.print("[");
		for(int i:arr){
			
			System.out.print(i+",");
			
		}
		System.out.print("\t]");
	}
}
