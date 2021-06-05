package javaPractise;

public class SimpleClass extends CallingMethods{

	public static void main(String[] args) {

		
		CallingMethods obj= new CallingMethods();
		
		int result=obj.sumOfNumbers(12, 13, 10);
		System.out.println(result);
		
		spiltText("Guru"); 		//Calling method from different class
	}

}
