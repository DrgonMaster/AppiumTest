package com.niuguwang.operation;

import com.niuguwang.base.OperateAppium;
import com.niuguwang.pages.AmarketPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MarketOperate extends OperateAppium {
	private AmarketPage amarketP;
	AndroidDriver driver;
	public MarketOperate(AndroidDriver<AndroidElement> driver) {
		super(driver);
		amarketP = new AmarketPage(driver);
		this.driver=driver;
	}
	
	public void buyInto(){
		amarketP.getMarket().click();
		amarketP.getStock().click();
		amarketP.getBuyBotton().click();		
	}
			
}
