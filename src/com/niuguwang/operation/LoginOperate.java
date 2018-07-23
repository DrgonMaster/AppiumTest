package com.niuguwang.operation;

import com.niuguwang.base.OperateAppium;
import com.niuguwang.pages.LoginPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginOperate extends OperateAppium{
	private LoginPage LoginP;
    AndroidDriver driver;
	public LoginOperate(AndroidDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		LoginP = new LoginPage(driver);
		this.driver=driver;
	}

	public boolean login(String name,String pass){
		
		sleep(20000);
//		
		if(LoginP.findUpdate()){
			System.out.println("找到更新提示了");
			clickView(LoginP.getUpdateCancelButton());
			LoginP.getmenuUserBtn().click();
			LoginP.getLoginText().click();
			System.out.println("已经正常跳转到我的tab登录页面");
		}else if(LoginP.findUserName()==true){
			System.out.println("用户已经登录了需要退出登录操作");
			LoginP.getSetCenter().click();
			LoginP.getQuitButton().click();
			System.out.println("退出登录完成，继续登录操作");
			LoginP.getLoginText().click();
		}
		else{
			System.out.println("未找到元素");
			return false;
		}

		inputManyText(name,pass);
		LoginP.getloginBtn().click();
		return LoginP.findUserName();
		
	}
}
