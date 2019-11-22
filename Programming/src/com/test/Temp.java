package com.test;

public class Temp {
	public static void main(String[] args) {
		System.out.println(tossQuiz(700));
	}
	
	public static int tossQuiz(int n) {
		return (int) (Math.random() * (n/100));
	}
}
