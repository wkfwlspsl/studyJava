package com.programmers.level1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
	코딩테스트 연습 > 연습문제 > 2016년

	문제 설명
	2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
	두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
	요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다. 
	예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
	
	제한 조건
	2016년은 윤년입니다.
	2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
	
	입출력 예
	a	b	result
	5	24	TUE
 */
public class PracticeAA {
	private static final Map<Integer, String> dayMap;
	static {
		dayMap = new HashMap<>();
		dayMap.put(1, "SUN");
		dayMap.put(2, "MON");
		dayMap.put(3, "TUE");
		dayMap.put(4, "WED");
		dayMap.put(5, "THU");
		dayMap.put(6, "FRI");
		dayMap.put(7, "SAT");
	}
	
	public static void main(String[] args) throws ParseException {
		System.out.println(solution(5, 24));
		System.out.println(solution2(5, 24));
	}
	
	public static String solution(int a, int b) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = sdf.parse(getYYYYMMDD(2016, a, b));
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		return dayMap.get(cal.get(Calendar.DAY_OF_WEEK));
	}
	
	public static String getYYYYMMDD(int y, int m, int d) {
		StringBuilder sb = new StringBuilder();
		sb.append(y);
		
		if(m < 10) {
			sb.append("0");
		}
		sb.append(m);
		if(d < 10) {
			sb.append("0");
		}
		sb.append(d);
		
		return sb.toString();
	}
	
	//date관련 api없이 ..
	public static String  solution2(int a, int b) {
		int[] monthArr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int day = 0;
		
		for(int i=0; i<a-1; i++) {
			day += monthArr[i];
		}
		day += b;
		
		switch(day%7) {
			case 0:
				return "THU";
			case 1:
				return "FRI";
			case 2:
				return "SAT";
			case 3:
				return "SUN";
			case 4:
				return "MON";
			case 5:
				return "TUE";
			case 6:
				return "WED";
		}
		
		return null;
	}
}
