package com.programmers.level1;

import java.util.HashMap;
import java.util.Map;

/*
	�ڵ��׽�Ʈ ���� > �ؽ� > �������� ���� ����
	
	���� ����
	������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
	�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, 
	�������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	
	���ѻ���
	������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
	completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
	�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
	������ �߿��� ���������� ���� �� �ֽ��ϴ�.
	����� ��
	participant	completion	return
	[leo, kiki, eden]	[eden, kiki]	leo
	[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
	[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
	����� �� ����
	���� #1
	leo�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.
	
	���� #2
	vinko�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.
	
	���� #3
	mislav�� ������ ��ܿ��� �� ���� ������, ������ ��ܿ��� �� ��ۿ� ���� ������ �Ѹ��� �������� ���߽��ϴ�.
*/
public class Test1 {
	public static void main(String[] args) {
		String[] arr1 = {"mislav", "stanko", "mislav", "ana"};
		String[] arr2 = {"ana", "mislav", "mislav"};
		System.out.println(solution(arr1, arr2));
	}
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for(String p : participant) {
        	if(map.containsKey(p)) {
        		int n = map.get(p);
        		map.put(p, n+1);
        	}else {
        		map.put(p, 1);
        	}
        }
        
        for(String c : completion) {
        	int n = map.get(c);
        	map.put(c, n-1);
        }
        
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
        	if(entry.getValue().equals(1)) {
        		answer = entry.getKey();
        	}
        }

        return answer;
    }
}
