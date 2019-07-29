package pm1;




import java.io.IOException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class M1  {
	public static String Apk="CoreoPG.apk";
	public static AndroidDriver<AndroidElement> Driver;
	public static void main(String[] args) throws IOException, InterruptedException    {
		// TODO Auto-generated method stub
		
		
	//	Naukri.SetupAndrd();
	//	Naukri.NaukriLogin();
	//	Naukri.NaukriLogout();
	
		CoreoPG.SetupAndrd();
		CoreoPG.CameraAndroidPermission();
		CoreoPG.AudioAndroidPermission();
		//CoreoPG.PasscodeVrfn();
		CoreoPG.LogIn("Lori.whitfoot@mailinator.com","Emids@123");
		CoreoPG.ViewProfile();
		CoreoPG.Logout();
	}

}
