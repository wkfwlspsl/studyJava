package com.programmers.level1;

import java.util.LinkedList;
import java.util.List;

/*
������ ó�� �������� �ǰ� ���� ����ġ�� ���ڿ��� �����ϴ� ����� ���� ���θ� �ϰ� �ֽ��ϴ�. 
�ֱٿ� �뷮�� ������ ó���� ���� ������ ��ս� ���� ����� ���� ���θ� �ϰ� �ִµ�, 
���ڿ����� ���� ���� �����ؼ� ��Ÿ���� ���� �� ������ ������ �ݺ��Ǵ� ������ ǥ���Ͽ� �� ª�� ���ڿ��� �ٿ��� ǥ���ϴ� �˰����� �����ϰ� �ֽ��ϴ�.
������ ���� aabbaccc�� ��� 2a2ba3c(���ڰ� �ݺ����� �ʾ� �ѹ��� ��Ÿ�� ��� 1�� ������)�� ���� ǥ���� �� �ִµ�, 
�̷��� ����� �ݺ��Ǵ� ���ڰ� ���� ��� ������� ���ٴ� ������ �ֽ��ϴ�. 
���� ���, abcabcdede�� ���� ���ڿ��� ���� ������� �ʽ��ϴ�. 
����ġ�� �̷��� ������ �ذ��ϱ� ���� ���ڿ��� 1�� �̻��� ������ �߶� �����Ͽ� �� ª�� ���ڿ��� ǥ���� �� �ִ��� ����� ã�ƺ����� �մϴ�.

���� ���, ababcdcdababcdcd�� ��� ���ڸ� 1�� ������ �ڸ��� ���� ������� ������, 2�� ������ �߶� �����Ѵٸ� 2ab2cd2ab2cd�� ǥ���� �� �ֽ��ϴ�. 
�ٸ� ������� 8�� ������ �߶� �����Ѵٸ� 2ababcdcd�� ǥ���� �� ������, �̶��� ���� ª�� �����Ͽ� ǥ���� �� �ִ� ����Դϴ�.

�ٸ� ����, abcabcdede�� ���� ���, ���ڸ� 2�� ������ �߶� �����ϸ� abcabc2de�� ������, 3�� ������ �ڸ��ٸ� 2abcdede�� �Ǿ� 3�� ������ ���� ª�� ���� ����� �˴ϴ�. 
�̶� 3�� ������ �ڸ��� �������� ���� ���ڿ��� �״�� �ٿ��ָ� �˴ϴ�.

������ ���ڿ� s�� �Ű������� �־��� ��, ���� ������ ������� 1�� �̻� ������ ���ڿ��� �߶� �����Ͽ� ǥ���� ���ڿ� �� ���� ª�� ���� ���̸� return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
s�� ���̴� 1 �̻� 1,000 �����Դϴ�.
s�� ���ĺ� �ҹ��ڷθ� �̷���� �ֽ��ϴ�.

����� ��
s							result
"aabbaccc"					7
"ababcdcdababcdcd"			9
"abcabcdede"				8
"abcabcabcabcdededededede"	14
"xababcdcdababcdcd"			17
 */


public class Test2 {
	public static void main(String[] args) {
//		String str = "abcabcabcabcdededededede";
//		int length = str.length();
//		System.out.println(str.substring(4, 24));
		System.out.println(solution("ababcdpp"));
//		List<String> a = new ArrayList<>();
//		System.out.println(a.stream().reduce((s1, s2) -> s1 + s2).get());
	}
	
	public static int solution(String s) {
		int answer = s.length();
		int halfLength = s.length()/2;
		List<String> strList = new LinkedList<>();
		
		//1~halfLength���� �߶� �۾�..
		for(int i=1; i<=halfLength; i++) {
			String tempStr = "";
			int tempInt = 0;
			//i���� �߶� ��
			for(int j=0; j<s.length(); j+=i) {
				//�ڸ� index�� �ѹ��ڿ� ���̺��� �۰ų� ���ƾ���..
				if(j+i <= s.length()) {
					String substr = s.substring(j, j+i);
					//�ڸ� ���ڿ��� tempStr ��. ������ count++
					//�ٸ��� count���� tempStr ���ؼ� list�� �־���
					if(substr.equals(tempStr)) {
						tempInt++;
					}else {
						if(!"".equals(tempStr)) {
							String tIntStr = tempInt == 0 ? "" : "" + (tempInt+1);
							strList.add(tIntStr + tempStr);
						}
						tempStr = substr;
						tempInt = 0;
					}
				}
				//�������� �����ִ� temp�� list�� �־��ֱ�
				if(j+i >= s.length()) {
					String tIntStr = tempInt == 0 ? "" : "" + (tempInt+1);
					strList.add(tIntStr + tempStr);
				}
				if(j+i > s.length()) {
					strList.add(s.substring(j, s.length()));
				}
			}
			//���̰� ������ answer��
			String resultStr = strList.stream().reduce((s1, s2) -> s1 + s2).get();
			answer = Math.min(answer, resultStr.length());
			strList.clear();
		}
		
		return answer;
	}
}
