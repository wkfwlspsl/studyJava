package com.test;

public class Temp {
	public static void main(String[] args) {
		System.out.println(test(""));
		System.out.println(test("zzz"));
		System.out.println(test("zzzz"));
		System.out.println(test("zzzzz"));
		System.out.println(test("undefined"));
		System.out.println(test(null));
	}
	
	public static boolean test(String str) {
		return str != null && str.length() >= 4 && !"undefined".equals(str);
	}
	
}
