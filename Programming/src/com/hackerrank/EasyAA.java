package com.hackerrank;
/*
 * 12시 AM/PM 표기법을
 * 24시로 컨버팅
 * 
 * 입력
 * 07:05:45PM
 * 출력
 * 19:05:45
 */
public class EasyAA {
	public static void main(String[] args) {
		System.out.println(timeConversion("12:40:22PM"));
	}
	
	public static String timeConversion(String s) {
		String type = s.substring(s.length()-2);
		s = s.substring(0, s.length()-2);
		
		int hour = Integer.valueOf(s.substring(0,2));
		switch(type) {
		case "PM":
			if(hour != 12) {
				hour += 12;
			}
			break;
		case "AM":
			if(hour == 12) {
				hour = 0;
			}
			break;
		default:
			break;
		}

		StringBuilder sb = new StringBuilder();
		sb.append(hour < 10 ? "0"+hour : hour).append(s.substring(2));
		
		return sb.toString();
	}
}
