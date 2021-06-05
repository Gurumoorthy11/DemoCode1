package javaPractise.package1;

import java.util.ArrayList;
import java.util.Scanner;



public class codeWark1Practise {

	public static int number=0;
	public static int count=0;
	public static void main(String[] args) {
	
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the no. of Elements:");
		int num=sc.nextInt();
		int[] arr=new int[num];
		sc.close();
	
		for(int iterate=0;iterate<num;iterate++){
			arr[iterate]=iterate+1;
		}
		
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		ArrayList<Integer> al3=new ArrayList<>();
		number=arr.length/2;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]<=number){
				al1.add(arr[i]);
			}
			else{
				al2.add(arr[i]);
			}
				
		}
		
		System.out.println(al1);
		System.out.println(al2);
		for(int i=al2.size()-1;i>=0;i--){
			al3.add(al2.get(i));
			if(count<al1.size()){
				for(int j=0;j<al1.size();){
					al3.add(al1.get(count));
					count++;
					break;
				}
			}
			
		}
		
		System.out.println(al3);
	}

}
