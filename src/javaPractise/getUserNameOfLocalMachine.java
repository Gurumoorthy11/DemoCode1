package javaPractise;

public class getUserNameOfLocalMachine {

	public static void main(String[] args) {
		
		
		String username = System.getProperty("user.name");
		System.out.println(username);
		
		String path = "C:\\Users\\"+username+"\\Downloads";

	
		
		
	}
}
