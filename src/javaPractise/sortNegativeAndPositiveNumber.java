package javaPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sortNegativeAndPositiveNumber {

	// -----------------Description-------------------------//

	/**
	 * @author Gurumoorthy
	 * @Date 05/01/2020
	 * 
	 *       Description of this Program - To sort the list of integers in
	 *       numerical order.
	 * 
	 * @param arr
	 */

	public void sortNumberOfList(int[] arr) {
		try {

			ArrayList<Integer> negativelist = new ArrayList<>();
			ArrayList<Integer> positivelist = new ArrayList<>();
			ArrayList<Integer> zero = new ArrayList<>();

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < 0) {
					negativelist.add(arr[i]);
				} else if (arr[i] > 0) {
					positivelist.add(arr[i]);
				} else if (arr[i] == 0) {
					zero.add(arr[i]);
				}
			}
			Collections.sort(negativelist);
			negativelist.addAll(zero);
			Collections.sort(positivelist);
			negativelist.addAll(positivelist);
			System.out.println(negativelist);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		sortNegativeAndPositiveNumber obj = new sortNegativeAndPositiveNumber();
		System.out.println("Enter the count of number: ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("enter a number: ");
			arr[i] = sc.nextInt();
		}

		sc.close();

		obj.sortNumberOfList(arr);
	}

}
