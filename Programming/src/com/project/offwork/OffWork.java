package com.project.offwork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*
 * 출근시간, 하루근무시간 입력
 * 남은시간 분으로 출력
 */
public class OffWork {
	public static void main(String[] args) throws ParseException {
		System.out.println(solution("09:47",9));
		
	}
	
	public static String solution(String startTime, int total) {
		try {
			
			int totalWorkingTime = total * 60;
			String currentTime = getCurrentTime();
			
			SimpleDateFormat f = new SimpleDateFormat("HH:mm", Locale.KOREA);
			Date startDate = f.parse(startTime);
			Date currentDate = f.parse(currentTime);
			int diff = (int) (currentDate.getTime() - startDate.getTime());
			int elapsedTime = diff / 1000 / 60;
	
			int offWorkTime = totalWorkingTime - elapsedTime;
			
			if(offWorkTime <= 0) {
				return "퇴근하세요";
			}else {
				return String.valueOf(offWorkTime);
			}
		}catch(NumberFormatException | ParseException e) {
			return "출근시간 잘못 입력";
		}
	}

	private static String getCurrentTime() {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		String currentTime = (new SimpleDateFormat("HH:mm").format(date));
		return currentTime;
	}
}
