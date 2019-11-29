package com.programmers.level1;
/*
	코딩테스트 연습 > 연습문제 > 최대공약수와 최소공배수
	
	문제 설명
	두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
	배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
	예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
	
	제한 사항
	두 수는 1이상 1000000이하의 자연수입니다.
	
	입출력 예
	n	m	return
	3	12	[3, 12]
	2	5	[1, 10]
	
	입출력 예 설명
	입출력 예 #1
	위의 설명과 같습니다.
	
	입출력 예 #2
	자연수 2와 5의 최대공약수는 1, 최소공배수는 10이므로 [1, 10]을 리턴해야 합니다.
 */

public class PracticeAW {
	public static void main(String[] args) {
		int[] result = solution(3, 12);
		for(int n: result) {
			System.out.println(n);
		}
	}
	
	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		answer[0] = getGreatestCommonDivisor(Math.min(n, m), Math.max(n, m));
		answer[1] = getLeastCommonMultiple(n, m, answer[0]);
		return answer;
	}
	
	//최대공약수: 큰 수를 작은 수로 나누어 나머지를 구함. 
	//나머지가 0이면 작은수가 최대공약수. 
	//0이 아니면 나머지와 작은수의 나누기 반복
	public static int getGreatestCommonDivisor(int min, int max) {
		int r = max%min;
		if(r == 0) {
			return min;
		}
		
		return getGreatestCommonDivisor(Math.min(min, r), Math.max(min, r));
	}
	//최소공배수: n * m / gcd
	public static int getLeastCommonMultiple(int n, int m, int gcd) {
		return n * m / gcd;
	}
}
