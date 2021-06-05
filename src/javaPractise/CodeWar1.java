package javaPractise;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CodeWar1 {

	public static  int count=0;
	public static void main (String args[]){
		try {
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter no. of Elements:");
			int noOfElements=sc.nextInt();
			System.out.println(noOfElements);
			
			
			ArrayList<Integer> oddNumberList=new ArrayList<>();
			ArrayList<Integer> evenNumberList=new ArrayList<>();
			sc.close();
			
			for(int iterate=1;iterate<=noOfElements;iterate++){
				if(iterate%2!=0){
					oddNumberList.add(iterate);
				}
				else{
					evenNumberList.add(iterate);
				}
			}
			System.out.println(oddNumberList);
			System.out.println(evenNumberList);
			ArrayList<Integer> lastarr= new ArrayList<>();
			
			for(int i=evenNumberList.size()-1;i>=0;i--){
				
				lastarr.add(evenNumberList.get(i) );
				for(int j=0;j<oddNumberList.size();j++){
					
					lastarr.add(oddNumberList.get(count));
					count++;
					break;
				}
				
			}
			
			System.out.println(lastarr);
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}
	
	
}
