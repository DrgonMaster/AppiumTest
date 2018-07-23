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
	    	System.out.println("开始正常登录的操作-------------");
	    	 boolean flag = LoginO.login("13269060670","123456");
	         Assertion.verifyEquals(flag,true,"帐号对密码对是否登录成功");
	         print("帐号密码正确情况登录:"+ flag);
	         Reporter.log("完成一次测试");
	    }
	    @Test(priority = 3)
	    
	    public void loginpasserror(){
	    	System.out.println("无法进行正常登录的操作-------------");
	    	boolean flag = LoginO.login("13311151061","lj12345");
	    	Assertion.verifyEquals(flag,false,"帐号对密码错误是否登录成功");
	         print("帐号密码错误情况登录:"+ flag); 
	         
	    }
	    
}
