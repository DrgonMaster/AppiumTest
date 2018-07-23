package com.niuguwang.cases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.niuguwang.base.InitAppium;
import com.niuguwang.operation.LoginOperate;
import com.niuguwang.operation.MarketOperate;

public class AMarket extends InitAppium {
	private MarketOperate marketopg;
	 @BeforeClass
	    public void initDriver(){
	        Assert.assertNotNull(driver);
	        marketopg = new MarketOperate(driver);
	    }
	@Test
	public void dobuy(){
		marketopg.buyInto();
	}
}
