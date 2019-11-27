package com.programmers.level1;

import java.util.LinkedList;
import java.util.List;

/*
	�ڵ��׽�Ʈ ���� > �������� > ���� ��ȣ

	���� ����
	� ������ �� ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� �ٲٴ� ��ȣȭ ����� ���� ��ȣ��� �մϴ�. 
	���� ��� AB�� 1��ŭ �и� BC�� �ǰ�, 3��ŭ �и� DE�� �˴ϴ�. 
	z�� 1��ŭ �и� a�� �˴ϴ�. 
	���ڿ� s�� �Ÿ� n�� �Է¹޾� s�� n��ŭ �� ��ȣ���� ����� �Լ�, solution�� �ϼ��� ������.
	
	���� ����
	������ �ƹ��� �о �����Դϴ�.
	s�� ���ĺ� �ҹ���, �빮��, �������θ� �̷���� �ֽ��ϴ�.
	s�� ���̴� 8000�����Դϴ�.
	n�� 1 �̻�, 25������ �ڿ����Դϴ�.
	
	����� ��
	s		n	result
	AB		1	BC
	z		1	a
	a B z	4	e F d
 */
public class PracticeAN {
	public static final List<Character> lowerList;
	public static final List<Character> upperList;
	static {
		lowerList = new LinkedList<>();
		upperList = new LinkedList<>();
		lowerList.add('a');lowerList.add('b');lowerList.add('c');lowerList.add('d');lowerList.add('e');lowerList.add('f');lowerList.add('g');lowerList.add('h');lowerList.add('i');lowerList.add('j');lowerList.add('k');lowerList.add('l');lowerList.add('m');lowerList.add('n');lowerList.add('o');lowerList.add('p');lowerList.add('q');lowerList.add('r');lowerList.add('s');lowerList.add('t');lowerList.add('u');lowerList.add('v');lowerList.add('w');lowerList.add('x');lowerList.add('y');lowerList.add('z');
		upperList.add('A');upperList.add('B');upperList.add('C');upperList.add('D');upperList.add('E');upperList.add('F');upperList.add('G');upperList.add('H');upperList.add('I');upperList.add('J');upperList.add('K');upperList.add('L');upperList.add('M');upperList.add('N');upperList.add('O');upperList.add('P');upperList.add('Q');upperList.add('R');upperList.add('S');upperList.add('T');upperList.add('U');upperList.add('V');upperList.add('W');upperList.add('X');upperList.add('Y');upperList.add('Z');
	}
	
	public static void main(String[] args) {
		System.out.println(solution("AB", 1));
		System.out.println(solution("z", 1));
		System.out.println(solution("a B z", 4));
	}
	
	public static String solution(String s, int n) {
		StringBuilder answer = new StringBuilder();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(' ' == c) {
				answer.append(" ");
				continue;
			}
			
			
			if(Character.isUpperCase(c)) {
				int idx = upperList.indexOf(c);
				int caesarIdx = (idx + n) > 25 ? (idx + n - 26) : (idx + n);
				answer.append(upperList.get(caesarIdx));
			}else {
				int idx = lowerList.indexOf(c);
				int caesarIdx = (idx + n) > 25 ? (idx + n - 26) : (idx + n);
				answer.append(lowerList.get(caesarIdx));
			}
		}
		return answer.toString();
	}
}
