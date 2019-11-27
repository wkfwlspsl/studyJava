package com.programmers.level1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
	�ڵ��׽�Ʈ ���� > �������� > 2016��

	���� ����
	2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? 
	�� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
	������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT�Դϴ�. 
	���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� TUE�� ��ȯ�ϼ���.
	
	���� ����
	2016���� �����Դϴ�.
	2016�� a�� b���� ������ �ִ� ���Դϴ�. (13�� 26���̳� 2�� 45�ϰ��� ��¥�� �־����� �ʽ��ϴ�)
	
	����� ��
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
	
	//date���� api���� ..
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
