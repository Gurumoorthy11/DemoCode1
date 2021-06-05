package javaPractise;

public class CallingMethods {

	public int sumOfNumbers(int a,int b, int c){
		
		int output=a+b+c;
		return output;
		
		
	}
	public static void spiltText(String text){
		String[] text1 = null;
		for(int i=0;i<text.length();i++){
			 text1=text.split("", i);
			
		}
		System.out.println(text1);
	}
}
