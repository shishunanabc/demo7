package com.shishunan.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String str="";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		String str="1";
		boolean b = StringUtil.hasText(str);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString(3);
		System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 6; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);
		}
	}

}
