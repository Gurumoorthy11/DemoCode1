package javaPractise;

public class launchCMD {

	public static void main(String[] args) {

		try{
			
			Runtime.getRuntime().exec(new String[] {"cmd", "/K", "Start" });
			Runtime.getRuntime().exec("guru");
			
			Thread.sleep(2000);
			Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
			Runtime.getRuntime().totalMemory();
			//Process pro= Runtime.getRuntime().exec((System.getenv("windir") +"\\system32\\"+"tasklist.exe"));
			Process pro= Runtime.getRuntime().exec("tasklist.exe");
			System.out.println(pro);
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
