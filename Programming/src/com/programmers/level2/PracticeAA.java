package com.programmers.level2;
/*
	�ڵ��׽�Ʈ ���� > �������� > 124 ������ ����
	
	���� ����
	124 ���� �ֽ��ϴ�. 124 ���󿡼��� 10������ �ƴ� ������ ���� �ڽŵ鸸�� ��Ģ���� ���� ǥ���մϴ�.
	
	124 ���󿡴� �ڿ����� �����մϴ�.
	124 ���󿡴� ��� ���� ǥ���� �� 1, 2, 4�� ����մϴ�.
	���� �� 124 ���󿡼� ����ϴ� ���ڴ� ������ ���� ��ȯ�˴ϴ�.
	
	10����	124 ����	10����	124 ����
	1		1		6		14
	2		2		7		21
	3		4		8		22
	4		11		9		24
	5		12		10		41
	�ڿ��� n�� �Ű������� �־��� ��, n�� 124 ���󿡼� ����ϴ� ���ڷ� �ٲ� ���� return �ϵ��� solution �Լ��� �ϼ��� �ּ���.
			
	���ѻ���
	n�� 500,000,000������ �ڿ��� �Դϴ�.
	
	����� ��
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
		 * 3���� ���� �������� 0�϶�
		 * div-1�� 124���� ���� + 124���� ������ ����
		 * 
		 * 0�� �ƴҶ�
		 * 		div�� 124���� ���� �������� Ŭ ��
		 * 		div�� 124���� ���� + mod��° 124���� ����
		 * 
		 * 		�� Ŭ ��
		 * 		div��° 124���� ���� + mod��° 124���� ����
		 */
		if(n==0) {
			return "";
		}
		
		int div = Math.floorDiv(n, NUMBER_STR_ARRAY.length);//��
		int mod = Math.floorMod(n, NUMBER_STR_ARRAY.length);//������
		
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
