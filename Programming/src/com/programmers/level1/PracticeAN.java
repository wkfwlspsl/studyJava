package com.programmers.level1;

import java.util.LinkedList;
import java.util.List;

/*
	코딩테스트 연습 > 연습문제 > 시저 암호

	문제 설명
	어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
	예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. 
	z는 1만큼 밀면 a가 됩니다. 
	문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
	
	제한 조건
	공백은 아무리 밀어도 공백입니다.
	s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
	s의 길이는 8000이하입니다.
	n은 1 이상, 25이하인 자연수입니다.
	
	입출력 예
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
