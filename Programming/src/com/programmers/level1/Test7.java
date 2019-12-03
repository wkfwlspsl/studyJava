package com.programmers.level1;

import java.util.stream.Stream;

/*
	코딩테스트 연습 > 2018 KAKAO BLIND RECRUITMENT > [1차] 비밀지도

	문제 설명
	
	비밀지도
	네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다. 
	그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다. 다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.
	
		1. 지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 공백(" ") 또는벽("#") 두 종류로 이루어져 있다.
		2. 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 
		각각 지도 1과 지도 2라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다. 
		지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
		3. 지도 1과 지도 2는 각각 정수 배열로 암호화되어 있다.
		4. 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
	
	네오가 프로도의 비상금을 손에 넣을 수 있도록, 비밀지도의 암호를 해독하는 작업을 도와줄 프로그램을 작성하라.

	입력 형식
	입력으로 지도의 한 변 크기 n 과 2개의 정수 배열 arr1, arr2가 들어온다.
	
	1 ≦ n ≦ 16
	arr1, arr2는 길이 n인 정수 배열로 주어진다.
	정수 배열의 각 원소 x를 이진수로 변환했을 때의 길이는 n 이하이다. 즉, 0 ≦ x ≦ 2n - 1을 만족한다.
	
	출력 형식
	원래의 비밀지도를 해독하여 '#', 공백으로 구성된 문자열 배열로 출력하라.
	
	입출력 예제
	매개변수	값
	n		5
	arr1	[9, 20, 28, 18, 11]
	arr2	[30, 1, 21, 17, 28]
	
	출력		["#####","# # #", "### #", "# ##", "#####"]
	
	매개변수	값
	n		6
	arr1	[46, 33, 33 ,22, 31, 50]
	arr2	[27 ,56, 19, 14, 14, 10]
	출력		["######", "### #", "## ##", " #### ", " #####", "### # "]
 */
public class Test7 {
	public static void main(String[] args) {
		String[] answer = solution(5, new int[] {9,20,28,18,11}, new int[] {30,1,21,17,28});
		for(String str : answer) {
			System.out.println(str);
		}
	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		int[][] map1 = new int[n][n];
		int[][] map2 = new int[n][n];
		
		setMap(arr1, map1);
		setMap(arr2, map2);
		
		return addMap(map1, map2);
	}
	
	//map 만들기. 이진수로 채움
	public static void setMap(int[] arr, int[][] map) {
		for(int i=0; i<arr.length; i++) {
			String binary = Integer.toBinaryString(arr[i]);
			map[i] = setRow(map[i].length, binary);
		}
	}
	
	//map의 각 row 채우기.
	public static int[] setRow(int length, String binary) {
		//이진수로 바꾼 string을 int 배열로
		int[] arr = Stream.of(binary.split("")).mapToInt(Integer::parseInt).toArray();
		
		//이진수로 바꿨을때 길이가 작으면 0으로 채우기
		if(arr.length < length) {
			int diff = length - arr.length;
			int[] temp = new int[length];
			for(int i=0; i<diff; i++) {
				temp[i] = 0;
			}
			for(int i=diff; i<length; i++) {
				temp[i] = arr[i-diff];
			}
			
			return temp;
		}else {
			return arr;
		}
	}
	
	public static String[] addMap(int[][] map1, int[][] map2) {
		StringBuilder sb = new StringBuilder();
		String[] answer = new String[map1.length];
		
		for(int i=0; i<map1.length; i++) {
			for(int j=0; j<map1[i].length; j++) {
				int m1 = map1[i][j], m2 = map2[i][j];
				if(m1 == 1 || m2 == 1) {
					sb.append("#");
				}else {
					sb.append(" ");
				}
			}
			answer[i] = sb.toString();
			sb.delete(0, sb.length());
		}
		
		return answer;
	}
}



