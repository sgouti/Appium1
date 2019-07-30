package pm1;

import java.util.List;

import org.openqa.selenium.interactions.ClickAction;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;

public class CoreoPG extends GlobalLocators {
	
	public static void AndroidPermission()
	{
		String PsrmsnId="Eid#com.android.packageinstaller:id/permission_allow_button";
		String[] temp=PsrmsnId.split("#");
		System.out.println(temp[0]+" and "+temp[1]);
		
		while(Driver.findElementsById(temp[1]).size()>0)
		{
			GetAndrdEleemnt(PsrmsnId).click();
		}
		
		
	}
	 
	public static void PasscodeVrfn()
	{	String PsrmsnId="Expath#//android.widget.TextView[@text='OK']";
		String[] temp=PsrmsnId.split("#");
		System.out.println(temp[0]+"  and  "+temp[1]);
			
			while((Driver.findElementsById(temp[1]).size()>0))
			{
				System.out.println("Please add Passcode to the device ");
				GetAndrdEleemnt(PsrmsnId).click();
				
			}
		
	}

	public static void LogIn(String UserName,String Password)
	{	//AndroidElement driver;
	String SignInBtn="Expath#//android.widget.TextView[@text='Login']";
		GetAndrdEleemnt(SignInBtn).click();
	String EmailIDTxtFld="Expath#//android.widget.EditText[@text='Enter Email Address']";	//EAndiodUi#Enter Email Address
		GetAndrdEleemnt(EmailIDTxtFld).sendKeys(UserName);
	String PassTxtFld="Expath#//android.widget.EditText[@text='Enter Password']";			//EAndiodUi#Enter Password
		GetAndrdEleemnt(PassTxtFld).sendKeys(Password);
	String LoginBtn="Expath#//android.widget.TextView[@text='Login']";
		GetAndrdEleemnt(LoginBtn).click();
	}
	public static void Logout()
{
	String MenuOptn="Expath#(//android.widget.TextView[@text='Menu'])[last()]";
		GetAndrdEleemnt(MenuOptn).click();
		String UserName="Expath#(//android.widget.ImageView)[1]/following-sibling::android.widget.TextView[1]";
		String Nnme=GetAndrdEleemnt(UserName).getText();
		System.out.println(Nnme); 
		String LogoutIcon="Expath#(//android.widget.TextView[@text='Menu'])[1]//ancestor::android.view.ViewGroup[1]//android.view.ViewGroup[2]";
	
		GetAndrdEleemnt(LogoutIcon).click();
		
}
	public static void ViewProfile()
	{
		String MenuOptn="Expath#(//android.widget.TextView[@text='Menu'])[last()]";
	GetAndrdEleemnt(MenuOptn).click();
	String UserName="Expath#(//android.widget.ImageView)[1]/following-sibling::android.widget.TextView[1]";
	AndroidElement Name=GetAndrdEleemnt(UserName);
	String Nnme=Name.getText();
		Name.click();
		String PatientName="Expath#//android.widget.TextView[@text='Profile']/following-sibling::android.widget.TextView[1]";
		System.out.println(GetAndrdEleemnt(PatientName).getText());
		String PatientGndr="Expath#//android.widget.TextView[@text='Profile']/following-sibling::android.widget.TextView[2]";
		System.out.println(GetAndrdEleemnt(PatientGndr).getText());
		String PatientAge="Expath#//android.widget.TextView[@text='Profile']/following-sibling::android.widget.TextView[3]";
		System.out.println(GetAndrdEleemnt(PatientAge).getText());
		String Backicon= "Expath#//android.widget.TextView[@text='Profile']/preceding-sibling::android.view.ViewGroup[1]";
		GetAndrdEleemnt(Backicon).click();
	}
public static boolean EditProfile(String FIrstNme,String LstNme,String gender,String age,String Descr,String PhneNmbr) throws InterruptedException
	{
	String UserName="Expath#(//android.widget.ImageView)[1]/following-sibling::android.widget.TextView[1]";
	String EditProfilIcon="Expath#//android.widget.TextView[@text='Profile']/following-sibling::android.view.ViewGroup[1]";
	String HeadingLabel="Expath#//android.widget.TextView[@text='Edit Personal Details']";//Edit Personal Details
	String FirstNmeTxfld="Expath#//android.widget.TextView[@text='First Name']/following-sibling::android.widget.EditText[1]";
	String LastNmeTxfld="Expath#//android.widget.TextView[@text='Last Name']/following-sibling::android.widget.EditText[1]";
	String Genderdropdwn="Expath#//android.widget.TextView[@text='Gender']/following-sibling::android.view.ViewGroup[1]";
	String Gendervlue="Expath#//android.widget.TextView[@text='Female']";
	String Agetxtfld="Expath#//android.widget.TextView[@text='Age']/following-sibling::android.widget.EditText[1]";
	String Descriptiontxtfld="Expath#//android.widget.TextView[@text='Description']//ancestor::android.view.ViewGroup[1]//android.widget.EditText";
	String PhnNmbrtxtfld="Expath#//android.widget.TextView[@text='Phone Number']/following-sibling::android.widget.EditText[1]";
	String Savebtn="Expath#//android.widget.TextView[@text='Save']";
	String MenuOptn="Expath#(//android.widget.TextView[@text='Menu'])[last()]";
	
	GetAndrdEleemnt(MenuOptn).click();
	GetAndrdEleemnt(UserName).click();
	GetAndrdEleemnt(EditProfilIcon).click();
	
	if(!GetAndrdEleemnt(HeadingLabel).getText().isEmpty())
	{
		System.out.println("Profile detials are dispalying");
	}
	else
	{
		System.out.println("hEADER lable is not expected");
		return false;		
	}
	AndroidElement Drvr;
	GetAndrdEleemnt(Genderdropdwn).click();
	GetAndrdEleemnt(Gendervlue).click();
	Drvr=	GetAndrdEleemnt(FirstNmeTxfld);
	ClearTextfield(Drvr);
	GetAndrdEleemnt(FirstNmeTxfld).sendKeys(FIrstNme);
	Drvr=	GetAndrdEleemnt(LastNmeTxfld);
	ClearTextfield(Drvr);
	Drvr.sendKeys(LstNme);
	
	Drvr=	GetAndrdEleemnt(Agetxtfld);
	ClearTextfield(Drvr);
	Drvr.sendKeys(age);
	
	Drvr=	GetAndrdEleemnt(Descriptiontxtfld);
	ClearTextfield(Drvr);
	Drvr.sendKeys(Descr);
	Thread.sleep(3000);
	ScrollToview("Phone Number");
	Drvr=	GetAndrdEleemnt(PhnNmbrtxtfld);
	ClearTextfield(Drvr);
	Drvr.sendKeys(PhneNmbr);
	GetAndrdEleemnt(Savebtn).click();
	
	return true;
	}
}

