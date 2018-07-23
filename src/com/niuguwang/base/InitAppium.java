package com.niuguwang.base;

import org.apache.http.util.TextUtils;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * ���������ĸ���
 * 
 */
@Listeners({com.niuguwang.base.AssertionListener.class})
public class InitAppium {
    //�����豸����
    public static String deviceName = "OPPO A53m";
    //�����豸ϵͳ�汾
    public static String platformVersion = "5.1.1";
    //app·��
    public static String appPath = System.getProperty("user.dir") + "/src/apps/niuguwang-68.apk";

    //����
    public static String appPackage = "com.niuguwang.stock";

    //�Ƿ���Ҫ���°�װ
    public static String noReset = "True";

    //�Ƿ�����ǩ��
    public static String noSign = "True";

    //�Ƿ�ʹ��unicode���뷨������֧������
    public static String unicodeKeyboard = "True";

    //�Ƿ����Ĭ�������뷨
    public static String resetKeyboard = "True";

    //Ҫ������Activity
    //public static String appActivity = appPackage + ".activity.login.WelcomeActivity";
    public static String appActivity = "";

    public static  AndroidDriver<AndroidElement> driver = null;


    //���췽��
    public InitAppium() {
        this(new Builder());
    }

    public InitAppium(Builder builder) {

        appActivity = builder.appActivity;
        appPackage = builder.appPackage;
        appPath = builder.appPath;
        deviceName = builder.deviceName;
        noReset = builder.noReset;
        noSign = builder.noSign;
        unicodeKeyboard = builder.unicodeKeyboard;
        resetKeyboard = builder.resetKeyboard;
    }

    /**
     * appium��������
     *
     * @throws MalformedURLException
     */
    @BeforeSuite
    public void beforeSuite() throws MalformedURLException {


        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("app", new File(appPath).getAbsolutePath());
        capabilities.setCapability("appPackage", appPackage);
        //֧������
        capabilities.setCapability("unicodeKeyboard", unicodeKeyboard);
        //�������֮�󣬱��ϵͳ�����뷨
        capabilities.setCapability("resetKeyboard", resetKeyboard);
        //���ظ���װ
        capabilities.setCapability("noReset", noReset);
        //������ǩ��
        capabilities.setCapability("noSign", noSign);
        //�򿪵�activity
        if(!TextUtils.isEmpty(appActivity)){
            capabilities.setCapability("appActivity", appActivity);
        }

        //����Driver
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }


    @AfterTest
    public void afterTest() {
       // driver.quit();
    }

    @AfterClass
    public void afterClass(){
      
//        driver.quit();
    }

    /**
     * ��ӡ�ַ�
     *
     * @param str Ҫ��ӡ���ַ�
     */
    public <T> void print(T str) {
        if (!TextUtils.isEmpty(String.valueOf(str))) {
            System.out.println(str);
        } else {
            System.out.println("����˿��ַ�");
        }
    }

}