package com.niuguwang.base;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;;

public class Assertion {
	public static boolean flag = true;
	public static List<Error> errors = new ArrayList<>();
	/**
	 * @param actual
	 * @param expected
	 */
	public static void verifyEquals(Object actual,Object expected){
		try {
			Assert.assertEquals(actual, expected);
		} catch (Error e) {
			flag=false;
			errors.add(e);
		}
	}
	public static void verifyEquals(Object actual,Object expected,String message){
		try {
			Assert.assertEquals(actual, expected,message);
		} catch (Error e) {
			flag=false;
			errors.add(e);
		}
	}
}
