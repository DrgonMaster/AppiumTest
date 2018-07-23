package com.niuguwang.cases;
import com.niuguwang.base.Assertion;
import com.niuguwang.base.InitAppium;
import com.niuguwang.operation.LoginOperate;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class login  extends InitAppium{
	 
	private LoginOperate LoginO;
  
	    @BeforeClass
	    public void initDriver(){
	        Assert.assertNotNull(driver);
	        LoginO = new LoginOperate(driver);
	    }
	    @Test(priority = 1)
	    public void login(){
	    	System.out.println("��ʼ������¼�Ĳ���-------------");
	    	 boolean flag = LoginO.login("13269060670","123456");
	         Assertion.verifyEquals(flag,true,"�ʺŶ�������Ƿ��¼�ɹ�");
	         print("�ʺ�������ȷ�����¼:"+ flag);
	         Reporter.log("���һ�β���");
	    }
	    @Test(priority = 3)
	    
	    public void loginpasserror(){
	    	System.out.println("�޷�����������¼�Ĳ���-------------");
	    	boolean flag = LoginO.login("13311151061","lj12345");
	    	Assertion.verifyEquals(flag,false,"�ʺŶ���������Ƿ��¼�ɹ�");
	         print("�ʺ�������������¼:"+ flag); 
	         
	    }
	    
}
