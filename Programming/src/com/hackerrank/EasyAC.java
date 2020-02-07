package com.hackerrank;

/*
입력으로 s = {a,b,c} 와 t = {d,e,f}가 주어지고
int k 가 주어진다
s를 t로 바꾸는데 k번으로 가능하면 Yes, 아니면 No

String은 맨 뒤에 붙일 수 있다
String은 맨 뒤부터 지울 수 있다.

입력
aba
aba
7
출력
Yes

입력
ashley
asha
2
출력
No

입력
y
yu
2
출력
Yes

입력
abcd
abcdert
10
출력
Yes
 */
public class EasyAC {
	public static void main(String[] args) {
//		System.out.println(appendAndDelete("aba", "aba", 7));
//		System.out.println(appendAndDelete("ashley", "ash", 2));
//		System.out.println(appendAndDelete("y", "yu", 2));
		System.out.println(appendAndDelete("abcd", "abcdert", 10));
	}
	
	public static String appendAndDelete(String s, String t, int k) {
		/*
		 * s와 t가 틀린 인덱스. index
		 */
		int min = Math.min(s.length(), t.length());
		int index = -1;
		for(int i=0; i<min; i++) {
			if(s.charAt(i) != t.charAt(i)) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			if(s.length() == t.length()) {
				return "Yes";
			}else {
				index = min;
			}
		}
		
		int totalLength = s.length() + t.length();
		int opCnt = (totalLength - index * 2); //두 string의 차이 개수 
		
		if(opCnt > k) { //차이가 k보다 크면 안됨
			return "No";
		}else if(opCnt%2 == k%2) { //차이와 k의 홀짝이 같은지 비교 같으면 k번으로 수정 가능
			return "Yes";
		}else if(totalLength < k) { //전체길이가 k보다 작으면 k번으로 수정 가능
			return "Yes";
		}else {
			return "No";
		}
	}
	
}
