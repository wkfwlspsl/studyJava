package com.programmers.level2;
/*
	코딩테스트 연습 > 연습문제 > 124 나라의 숫자
	
	문제 설명
	124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.
	
	124 나라에는 자연수만 존재합니다.
	124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
	예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.
	
	10진법	124 나라	10진법	124 나라
	1		1		6		14
	2		2		7		21
	3		4		8		22
	4		11		9		24
	5		12		10		41
	자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.
			
	제한사항
	n은 500,000,000이하의 자연수 입니다.
	
	입출력 예
	n	result
	1	1
	2	2
	3	4
	4	11
 */

public class PracticeAA {
	public static final String[] NUMBER_STR_ARRAY = {"1", "2", "4"};
	public static void main(String[] args) {
		for(int i=1; i<100; i++) {
			System.out.println(i + "\t" + solution(i));
		}
//		System.out.println(solution(13));
	}
	
	public static String solution(int n) {
		/*
		 * 3으로 나눈 나머지가 0일때
		 * div-1의 124나라 숫자 + 124나라 마지막 숫자
		 * 
		 * 0이 아닐때
		 * 		div가 124나라 숫자 개수보다 클 때
		 * 		div의 124나라 숫자 + mod번째 124나라 숫자
		 * 
		 * 		안 클 때
		 * 		div번째 124나라 숫자 + mod번째 124나라 숫자
		 */
		if(n==0) {
			return "";
		}
		
		int div = Math.floorDiv(n, NUMBER_STR_ARRAY.length);//몫
		int mod = Math.floorMod(n, NUMBER_STR_ARRAY.length);//나머지
		
		if(mod == 0) {
			return solution(div-1) + NUMBER_STR_ARRAY[NUMBER_STR_ARRAY.length-1];
		}else {
			if(div > NUMBER_STR_ARRAY.length) {
				return solution(div) + NUMBER_STR_ARRAY[mod-1];
			}else {
				return (div==0 ? "" : NUMBER_STR_ARRAY[div-1]) + NUMBER_STR_ARRAY[mod-1];
			}
		}
	}
}
