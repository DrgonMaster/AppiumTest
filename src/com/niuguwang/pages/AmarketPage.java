package com.niuguwang.pages;

import com.niuguwang.base.PageAppium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AmarketPage extends PageAppium {

	public AmarketPage(AndroidDriver driver) {
		super(driver);
	}
	public final String markettext = "行情";
	public final String Stockttext = "中国铝业";
	public final String buyxpath = "com.niuguwang.stock:id/buyStockBtn";
	
	public AndroidElement getMarket(){
		return findByName(markettext);
		
	}
	public AndroidElement getStock(){
		return findByName(Stockttext);
		
	}
	public AndroidElement getBuyBotton(){
		return findById(buyxpath);
		
		
	}
	
	
}
