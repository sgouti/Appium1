package pm1;




import java.io.IOException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class M1  {
	public static AndroidDriver<AndroidElement> Driver;
	public static void main(String[] args) throws IOException, InterruptedException    {
		// TODO Auto-generated method stub
		
		
		Naukri.SetupAndrd();
		Naukri.NaukriLogin();
		Naukri.NaukriLogout();
	
	
	
	}
	public static void Runcmd() throws IOException
	{
		Process p = Runtime
                .getRuntime()
                .exec("cmd /c start cmd.exe /K \"cd C:\\Users\\siddh\\AppData\\Local\\Android\\Sdk\\emulator &&  emulator -avd Sid1");
		Process p1 = Runtime
                .getRuntime()
                .exec("cmd /c start cmd.exe /K  \"cd C:\\Users\\siddh");
		
	}

	
	
}
