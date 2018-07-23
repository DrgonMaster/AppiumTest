import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Apptest {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "");
		 cap.setCapability("platformName", "Android"); //ָ������ƽ̨ 
		 cap.setCapability("deviceName", "Redmi 4"); //ָ�����Ի���ID,ͨ��adb����`adb devices`��ȡ
		 cap.setCapability("platformVersion", "6.0.1"); //�������ȡ���İ�����Activity������Ϊֵ 
		 cap.setCapability("appPackage", "com.niuguwang.stock"); 
		 cap.setCapability("appActivity", ""); //A new session could not be created�Ľ������ 
		 cap.setCapability("appWaitActivity",""); //ÿ������ʱ����session������ڶ��κ����лᱨ�����½�session 
		 cap.setCapability("sessionOverride", true);
		 cap.setCapability("appActivity", "");
		 AndroidDriver<?> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		 System.out.println("����Ϊ"+driver);
		 

	}

}
