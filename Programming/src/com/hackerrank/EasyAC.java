package com.hackerrank;

/*
�Է����� s = {a,b,c} �� t = {d,e,f}�� �־�����
int k �� �־�����
s�� t�� �ٲٴµ� k������ �����ϸ� Yes, �ƴϸ� No

String�� �� �ڿ� ���� �� �ִ�
String�� �� �ں��� ���� �� �ִ�.

�Է�
aba
aba
7
���
Yes

�Է�
ashley
asha
2
���
No

�Է�
y
yu
2
���
Yes

�Է�
abcd
abcdert
10
���
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
		 * s�� t�� Ʋ�� �ε���. index
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
		int opCnt = (totalLength - index * 2); //�� string�� ���� ���� 
		
		if(opCnt > k) { //���̰� k���� ũ�� �ȵ�
			return "No";
		}else if(opCnt%2 == k%2) { //���̿� k�� Ȧ¦�� ������ �� ������ k������ ���� ����
			return "Yes";
		}else if(totalLength < k) { //��ü���̰� k���� ������ k������ ���� ����
			return "Yes";
		}else {
			return "No";
		}
	}
	
}
