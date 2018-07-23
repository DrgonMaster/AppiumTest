package com.niuguwang.pages;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.niuguwang.base.PageAppium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPage extends PageAppium{
	
	public final String UPDATE_CANCEL_BUTTON_ID = "cancelBtn";
	public final String MY_TAB_BUTTON_ID = "menuUserBtn";
	public final String LOGIN_BUTTON_ID = "loginBtn";
	public final String LOIN_USERNAME ="userName";
	public final String LOIN_TEXT_ID ="loginText";
	public final String LOGIN_TEXT="登录/注册";
	public final String SET_CENTER_XPATH ="//android.widget.TextView[@text='设置中心']";
	public final String UPDATE_TEXT = "检测到新版本:";
	public final String QUID_BUTTON = "quitBtn";
	public final String REG_BUTTON_TEXT = "新用户注册";
	public final String BACK_id = "titleBackImg";
	public LoginPage(AndroidDriver driver){
        super(driver);
    }
	
	public AndroidElement getUpdateCancelButton(){
		return waitAutoById(UPDATE_CANCEL_BUTTON_ID,100);
	}
	
		
	public AndroidElement getmenuUserBtn(){
		return findById(MY_TAB_BUTTON_ID);
	}
	
	public AndroidElement getloginBtn(){
		return findById(LOGIN_BUTTON_ID);
	}
	public AndroidElement getSetCenter(){
		return findByXpath(SET_CENTER_XPATH);
	}
	
	public boolean findUserName(){
		return isIdElementExist(LOIN_USERNAME);
	}
	 public boolean findUpdate(){
		 return isTextExist(UPDATE_TEXT);
	 }
	public boolean findlogintext(){
		return isTextExist(LOGIN_TEXT);
	}
	public boolean findRegtext(){
		return isTextExist(REG_BUTTON_TEXT);
	}
	public AndroidElement getLoginText(){
		return findById(LOIN_TEXT_ID);
	}
	public AndroidElement getQuitButton(){
		return findById(QUID_BUTTON);
	}
	public AndroidElement getbackButton(){
		return findById(BACK_id);
	}
}
