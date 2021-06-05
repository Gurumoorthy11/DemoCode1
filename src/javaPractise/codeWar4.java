package javaPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class codeWar4 {

	//---------------------Description-------------------------//
	/**
	 * @author Guru
	 * 
	 * @Description - To filter the number of values in odd and even. odd numbers are in ascending order 
	 * and the even number are in descending orders. Odd numbers are followed by Even numbers in list of values.
	 * 
	 * @Date - 04/01/2019
	 * 
	 * @Example:
	 * 	input - Enter number of values : 7
	 * 
	 * 	output - [1, 5, 7, 6, 4, 2]
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
		int enterOFNumber;
		ArrayList<Integer> FirstArrlist=new ArrayList<>();
		ArrayList<Integer> SecondArrlist=new ArrayList<>();

		System.out.println("Enter count of number: ");
		enterOFNumber=sc.nextInt();
		int[] arr=new int[enterOFNumber];
		
		for(int i=0;i<enterOFNumber;i++){
			System.out.println("Enter a number: ");
			arr[i]=sc.nextInt();
		}
		
		sc.close();
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				FirstArrlist.add(arr[i]);
			}
			else{
				SecondArrlist.add(arr[i]);
			}
		}
		
		Collections.sort(FirstArrlist, Collections.reverseOrder());
		
		SecondArrlist.addAll(FirstArrlist);
		System.out.println(SecondArrlist);
	}

}
