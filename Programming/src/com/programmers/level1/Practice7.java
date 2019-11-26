package com.programmers.level1;
/*
	�ڵ��׽�Ʈ ���� > �������� > ���ڿ� �� p�� y�� ����

	���� ����
	�빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. 
	s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 
	'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. 
	��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.
	
	���� ��� s�� pPoooyY�� true�� return�ϰ� Pyy��� false�� return�մϴ�.
	
	���ѻ���
	���ڿ� s�� ���� : 50 ������ �ڿ���
	���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.
	
	����� ��
	s		answer
	pPoooyY	true
	Pyy		false
	
	����� �� ����
	����� �� #1
	'p'�� ���� 2��, 'y'�� ���� 2���� �����Ƿ� true�� return �մϴ�.
	
	����� �� #2
	'p'�� ���� 1��, 'y'�� ���� 2���� �ٸ��Ƿ� false�� return �մϴ�.
 */
public class Practice7 {
	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("Pyy"));
	}
	
	public static boolean solution(String s) {
        s = s.toLowerCase();
        
        int pCnt = s.length() - ((s.replace("p", "")).length());
        int yCnt = s.length() - ((s.replace("y", "")).length());
        
        return pCnt == yCnt;
    }
}
