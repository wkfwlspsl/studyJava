package com.programmers.level1;
/*
	�ڵ��׽�Ʈ ���� > �������� > �̻��� ���� �����

	���� ����
	���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. 
	�� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. 
	�� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
	
	���� ����
	���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�.
	ù ��° ���ڴ� 0��° �ε����� ���� ¦����° ���ĺ����� ó���ؾ� �մϴ�.
	
	����� ��
	s				return
	try hello world	TrY HeLlO WoRlD
	
	����� �� ����
	try hello world�� �� �ܾ� try, hello, world�� �����Ǿ� �ֽ��ϴ�. 
	�� �ܾ��� ¦����° ���ڸ� �빮�ڷ�, Ȧ����° ���ڸ� �ҹ��ڷ� �ٲٸ� TrY, HeLlO, WoRlD�Դϴ�. 
	���� TrY HeLlO WoRlD �� �����մϴ�.
 */
public class PracticeAP {
	public static void main(String[] args) {
		System.out.println(solution("try hello world"));
	}
	
	public static String solution(String s) {
		s = s.toUpperCase();
		char[] sArr = s.toCharArray();
		int wordIdx = 0;
		
		for(int i=0; i<sArr.length; i++) {
			//���鹮��
			if(sArr[i] == 32) {
				wordIdx=0;
				continue;
			}
			if(wordIdx%2 != 0) {
				sArr[i] = Character.toLowerCase(sArr[i]);
			}
			wordIdx++;
		}
		
		return String.valueOf(sArr);
	}
	
}
