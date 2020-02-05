package com.programmers.level2;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/*
�ڵ��׽�Ʈ ���� > ����Ž�� > �Ҽ� ã��

���ڸ� ���ڰ� ���� ���� ������ ������ֽ��ϴ�. ����� ���� ������ �ٿ� �Ҽ��� �� �� ���� �� �ִ��� �˾Ƴ��� �մϴ�.

�� ���� ������ ���� ���ڰ� ���� ���ڿ� numbers�� �־����� ��, ���� �������� ���� �� �ִ� �Ҽ��� �� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
numbers�� ���� 1 �̻� 7 ������ ���ڿ��Դϴ�.
numbers�� 0~9���� ���ڸ����� �̷���� �ֽ��ϴ�.
013�� 0, 1, 3 ���ڰ� ���� ���� ������ ������ִٴ� �ǹ��Դϴ�.

����� ��
numbers	return
17		3
011		2

����� �� ����
���� #1
[1, 7]���δ� �Ҽ� [7, 17, 71]�� ���� �� �ֽ��ϴ�.

���� #2
[0, 1, 1]���δ� �Ҽ� [11, 101]�� ���� �� �ֽ��ϴ�.

11�� 011�� ���� ���ڷ� ����մϴ�.
 */
public class TestAJ {
	public static void main(String[] args) {
		System.out.println(solution("17"));
	}
	
	public static int solution(String numbers) {
        int answer = 0;
        String[] numberArr = numbers.split("");
        Set<String> combineNum = Arrays.stream(numberArr).collect(Collectors.toSet());
        
        for(int i=1; i<=numberArr.length; i++) {
        	combineNum.addAll(getCombine(numberArr, i));
        }
        
        return answer;
    }
	
	public static Set<String> getCombine(String[] numberArr, int combNum){
		
		return null;
	}
	
}
