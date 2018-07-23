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
			System.out.println("�ҵ�������ʾ��");
			clickView(LoginP.getUpdateCancelButton());
			LoginP.getmenuUserBtn().click();
			LoginP.getLoginText().click();
			System.out.println("�Ѿ�������ת���ҵ�tab��¼ҳ��");
		}else if(LoginP.findUserName()==true){
			System.out.println("�û��Ѿ���¼����Ҫ�˳���¼����");
			LoginP.getSetCenter().click();
			LoginP.getQuitButton().click();
			System.out.println("�˳���¼��ɣ�������¼����");
			LoginP.getLoginText().click();
		}
		else{
			System.out.println("δ�ҵ�Ԫ��");
			return false;
		}

		inputManyText(name,pass);
		LoginP.getloginBtn().click();
		return LoginP.findUserName();
		
	}
}
