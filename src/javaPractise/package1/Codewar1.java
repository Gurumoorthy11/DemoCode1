package javaPractise.package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ELCOT
 *
 */
public class Codewar1 {

	public static void main(String[] args) {


		ArrayList<Integer> list=new ArrayList<Integer>(); 
		ArrayList<Integer> list1=new ArrayList<Integer>(); 
		ArrayList<Integer> list2=new ArrayList<Integer>(); 
		HashMap<Integer, Integer> hashVarible= new HashMap<Integer, Integer>();
		
		int[] array={8,2,3,5,17,7};
		
		for(int j=0;j<array.length;j++){
			int count=0;
			for(int i=2;i<=array[j];i++){
				if(array[j]%i ==0){
					count++;
					hashVarible.put(array[j], count);
				}
				/*else{
					hashVarible.put(array[j], 1);
				}*/
			}
		}
		System.out.println(hashVarible);
		
		
		for(Map.Entry<Integer, Integer> entry : hashVarible.entrySet()) {
			if(entry.getValue()==1){
				list1.add(entry.getKey());
			}else{
				list.add(entry.getValue());
			}
			
		}
		
		Collections.sort(list, Collections.reverseOrder());
		//Collections.sort(list1, Collections.reverseOrder());
		Collections.reverse(list1);
		for(int iterate=0;iterate<list.size();iterate++){
			for(Map.Entry<Integer, Integer> entry : hashVarible.entrySet()) {
				if(entry.getValue().equals(list.get(iterate))){
					list2.add(entry.getKey());
				}
				
			}
		}
		
		list2.addAll(list1);
		for(int i=0;i<list2.size();i++){
			System.out.print(list2.get(i)+" ");
		}
		
		
	}

}
