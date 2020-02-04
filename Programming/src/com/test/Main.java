package com.test;

import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) {
		LocalDateTime sessionTime = LocalDateTime.parse("2020-01-28T16:50:10.525");
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime EndSessionTime = sessionTime.plusMinutes(30);
		System.out.println(now);
		if(now.isAfter(EndSessionTime)) {
			System.out.println("new Session");
		}else {
			System.out.println("old Session");
		}
	}
}
