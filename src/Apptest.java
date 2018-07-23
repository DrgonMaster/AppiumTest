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
		 cap.setCapability("platformName", "Android"); //指定测试平台 
		 cap.setCapability("deviceName", "Redmi 4"); //指定测试机的ID,通过adb命令`adb devices`获取
		 cap.setCapability("platformVersion", "6.0.1"); //将上面获取到的包名和Activity名设置为值 
		 cap.setCapability("appPackage", "com.niuguwang.stock"); 
		 cap.setCapability("appActivity", ""); //A new session could not be created的解决方法 
		 cap.setCapability("appWaitActivity",""); //每次启动时覆盖session，否则第二次后运行会报错不能新建session 
		 cap.setCapability("sessionOverride", true);
		 cap.setCapability("appActivity", "");
		 AndroidDriver<?> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		 System.out.println("驱动为"+driver);
		 

	}

}
