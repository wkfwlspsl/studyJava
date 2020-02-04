package com.project.offwork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*
 * ��ٽð�, �Ϸ�ٹ��ð� �Է�
 * �����ð� ������ ���
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
				return "����ϼ���";
			}else {
				return String.valueOf(offWorkTime);
			}
		}catch(NumberFormatException | ParseException e) {
			return "��ٽð� �߸� �Է�";
		}
	}

	private static String getCurrentTime() {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		String currentTime = (new SimpleDateFormat("HH:mm").format(date));
		return currentTime;
	}
}
