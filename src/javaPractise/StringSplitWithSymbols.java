package javaPractise;

import java.util.Scanner;

public class StringSplitWithSymbols {
	
	//--------------_--------Description----------------------------//
	
	/**
	 * @author Gurumoorthy
	 * @Date 05/01/2020
	 * 
	 * Description of this program - Calculate the values in Runtime. Simple Calculator.
	 * 
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Currently Usable Functionality:");
			System.out.println("+ , *, -, /");
			
			System.out.print("Enter Value:");
			String str=sc.next();
			
			String[] sysmbols=new String[]{"+","-","*","/"};
			String sign = null;
			int firstNumber = 0;
			int secondNumber = 0;
			int Output=0;
			for(int j=0;j<sysmbols.length;j++){
				if(str.contains(sysmbols[j])){
					sign=sysmbols[j];
					String[] str1=str.split("\\"+sysmbols[j]);
					for(int i=0;i<str1.length;i++){
						//System.out.println(str1[i]);
						firstNumber=Integer.parseInt(str1[0]);
						secondNumber=Integer.parseInt(str1[1]);
					}
					
				}
				
			}
			System.out.println(firstNumber);
			System.out.println(secondNumber);
			if(sign.contains("+")){
				 Output=firstNumber+secondNumber;
			}
			else if(sign.contains("-")){
				Output=firstNumber-secondNumber;
				
			}
			else if(sign.contains("*")){
				Output=firstNumber*secondNumber;
			}
			else if(sign.contains("/")){
				Output=firstNumber/secondNumber;
			}
			else{
				System.out.println("Dude something you doing wrong");
			}
			
			System.out.println("Calculated output is :"+Output);
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
