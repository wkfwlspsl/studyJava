package com.programmers.level1;
/*
	�ڵ��׽�Ʈ ���� > �������� > ���￡�� �輭�� ã��
	
	���� ����
	String�� �迭 seoul�� element�� Kim�� ��ġ x�� ã��, �輭���� x�� �ִٴ� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���. 
	seoul�� Kim�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.
	
	���� ����
	seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
	seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
	Kim�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.
	
	����� ��
	seoul		return
	[Jane, Kim]	�輭���� 1�� �ִ�
 */
public class Practice10 {
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"Jane", "Kim"}));
	}
	
	public static String solution(String[] seoul) {
		String[] answer = {"�輭���� ", "", "�� �ִ�"};
		
		for(int i=0; i<seoul.length; i++) {
			if("Kim".equals(seoul[i])) {
				answer[1] = ""+i;
				break;
			}
		}
		
		return String.join("", answer);
	}
}
