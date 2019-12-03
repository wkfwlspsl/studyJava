package com.programmers.level1;

import java.util.Arrays;

/*
	�ڵ��׽�Ʈ ���� > 2018 KAKAO BLIND RECRUITMENT > [1��] ��Ʈ ����

	���� ����
	īī���忡 �� �� ��° ��! �ɽ��� ��? īī���� ���Ӻ�~
	
	īī���� ���Ӻ��� �Ϲݱ� �ű� ���񽺷� ��Ʈ ������ ����ϱ�� �ߴ�. 
	��Ʈ ������ ��Ʈ�ǿ� ��Ʈ�� �� ���� ���� �� ������ �հ�� �Ƿ��� �ܷ�� ��������, ��ΰ� ������ ��� �� �ִ�.
	�� �Ի��� ������ �ڵ� �Ƿ��� �����޾� ������ �ٽ� �κ��� ���� ��� ������ �ð� �Ǿ���. 
	��Ʈ ������ ���� ��� ������ �Ʒ��� ����.
	
	��Ʈ ������ �� 3���� ��ȸ�� �����ȴ�.
	�� ��ȸ���� ���� �� �ִ� ������ 0������ 10�������̴�.
	������ �Բ� Single(S), Double(D), Triple(T) ������ �����ϰ� �� ���� ��÷ �� �������� 1����, 2����, 3���� (����1 , ����2 , ����3 )���� ���ȴ�.
	�ɼ����� ��Ÿ��(*) , ������(#)�� �����ϸ� ��Ÿ��(*) ��÷ �� �ش� ������ �ٷ� ���� ���� ������ �� 2��� �����. ������(#) ��÷ �� �ش� ������ ���̳ʽ��ȴ�.
	��Ÿ��(*)�� ù ��° ��ȸ������ ���� �� �ִ�. �� ��� ù ��° ��Ÿ��(*)�� ������ 2�谡 �ȴ�. (���� 4�� ����)
	��Ÿ��(*)�� ȿ���� �ٸ� ��Ÿ��(*)�� ȿ���� ��ø�� �� �ִ�. �� ��� ��ø�� ��Ÿ��(*) ������ 4�谡 �ȴ�. (���� 4�� ����)
	��Ÿ��(*)�� ȿ���� ������(#)�� ȿ���� ��ø�� �� �ִ�. �� ��� ��ø�� ������(#)�� ������ -2�谡 �ȴ�. (���� 5�� ����)
	Single(S), Double(D), Triple(T)�� �������� �ϳ��� �����Ѵ�.
	��Ÿ��(*), ������(#)�� �������� �� �� �ϳ��� ������ �� ������, �������� ���� ���� �ִ�.
	0~10�� ������ ���� S, D, T, *, #�� ������ ���ڿ��� �Էµ� �� �������� ��ȯ�ϴ� �Լ��� �ۼ��϶�.
	
	�Է� ����
	����|���ʽ�|[�ɼ�]���� �̷���� ���ڿ� 3��Ʈ.
	��) 1S2D*3T
	
	������ 0���� 10 ������ �����̴�.
	���ʽ��� S, D, T �� �ϳ��̴�.
	�ɼ��� *�̳� # �� �ϳ��̸�, ���� ���� �ִ�.
	
	��� ����
	3���� ��ȸ���� ���� ���� �հ迡 �ش��ϴ� �������� ����Ѵ�.
	��) 37
	
	����� ����
	����	dartResult	answer	����
	2 8 27
	1	1S2D*3T		37		1^1 * 2 + 2^2 * 2 + 3^3
	2	1D2S#10S	9		1^2 + 2^1 * (-1) + 10^1
	3	1D2S0T		3		1^2 + 2^1 + 0^3
	4	1S*2T*3S	23		1^1 * 2 * 2 + 2^3 * 2 + 3^1
	5	1D#2S*3S	5		1^2 * (-1) * 2 + 2^1 * 2 + 3^1
	6	1T2D3D#		-4		1^3 + 2^2 + 3^2 * (-1)
	7	1D2S3T*		59		1^2 + 2^1 * 2 + 3^3 * 2
 */
public class Test9 {
	public static void main(String[] args) {
		System.out.println(solution("1S2D*3T"));
		System.out.println(solution("1D2S#10S"));
		System.out.println(solution("1D2S0T"));
		System.out.println(solution("1S*2T*3S"));
		System.out.println(solution("1D#2S*3S"));
		System.out.println(solution("1T2D3D#"));
		System.out.println(solution("1D2S3T*"));
		
	}
	
	public static int solution(String dartResult) {
		int[] scoreArr = new int[3];
		int opCnt = 0;
		Arrays.fill(scoreArr, 0);
		
		for(int i=1; i<dartResult.length(); i++) {
			try {
				int score = Integer.parseInt(String.valueOf(dartResult.charAt(i-1)));
				//score 10 ����
				if(score == 0 && i-2 >= 0 && dartResult.charAt(i-2) == '1') {
					score = 10;
				}
				char option = i+1 == dartResult.length() ? 0 : dartResult.charAt(i+1);
				switch(dartResult.charAt(i)) {
				case 'S':
					setScore(opCnt, scoreArr, score, option);
					opCnt++;
					break;
				case 'D':
					setScore(opCnt, scoreArr, score*score, option);
					opCnt++;
					break;
				case 'T':
					setScore(opCnt, scoreArr, score*score*score, option);
					opCnt++;
					break;
				}
			}catch(NumberFormatException e) {
				continue;
			}
		}
		
		return Arrays.stream(scoreArr).sum();
	}
	
	public static void setScore(int opCnt, int[] scoreArr, int score, char option) {
		scoreArr[opCnt] = score;
		
		switch(option) {
		case '*':
			if(opCnt != 0) {
				scoreArr[opCnt-1] = scoreArr[opCnt-1] * 2;
			}
			scoreArr[opCnt] = scoreArr[opCnt] * 2;
			break;
		case '#':
			scoreArr[opCnt] = scoreArr[opCnt] * (-1);
			break;
		}
	}
	
}
