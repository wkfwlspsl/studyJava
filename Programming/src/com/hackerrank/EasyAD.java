package com.hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/*
큰 숫자 오름차순 정렬

입력
6 --> 개수
31415926535897932384626433832795
1
3
10
3
5

출력
1
3
3
5
10
31415926535897932384626433832795
 */
public class EasyAD {
	public static void main(String[] args) {
		String[] result = bigSorting4(new String[] {
				"31415926535897932384626433832795",
				"1",
				"3",
				"10",
				"3",
				"5"
		});
		System.out.println(result);
	}
	
	//시간복잡도땜에 테케 4개 통과못함
    public static String[] bigSorting(String[] unsorted) {
    	List<BigInteger> biList = new ArrayList<>();
    	
    	for(int i=0; i<unsorted.length; i++) {
    		biList.add(new BigInteger(unsorted[i]));
    	}
    	
    	Collections.sort(biList);
    	
    	String[] result = new String[unsorted.length];
    	for(int i=0; i<result.length; i++) {
    		result[i] = biList.get(i).toString();
    	}
    	
    	return result;
    }
    
  //시간복잡도땜에 테케 4개 통과못함
    public static String[] bigSorting2(String[] unsorted) {
    	PriorityQueue<BigInteger> biList = new PriorityQueue<>();
    	
    	for(int i=0; i<unsorted.length; i++) {
    		biList.offer(new BigInteger(unsorted[i]));
    	}
    	
    	String[] result = new String[unsorted.length];
    	for(int i=0; i<result.length; i++) {
    		result[i] = biList.poll().toString();
    	}
    	
    	return result;
    }
    
  //시간복잡도땜에 테케 4개 통과못함
    public static String[] bigSorting3(String[] unsorted) {
    	BigInteger[] bArr = new BigInteger[unsorted.length];
    	for(int i=0; i<unsorted.length; i++) {
    		bArr[i] = new BigInteger(unsorted[i]);
    	}
    	
    	Arrays.sort(bArr);
    	
    	String[] result = new String[unsorted.length];
    	for(int i=0; i<result.length; i++) {
    		result[i] = bArr[i].toString();
    	}
    	return result;
    }
    
    //테스트케이스 제일 적게 통과 ㅋㅋ;;
    public static String[] bigSorting4(String[] unsorted) {
    	for(int i=0; i<unsorted.length; i++) {
    		int minIdx=i;
    		String minStr = unsorted[i];
    		String temp;
    		for(int j=i+1; j<unsorted.length; j++) {
    			if(unsorted[j].length() < minStr.length()) {
    				minIdx = j;
    				minStr = unsorted[j];
    			}else if(unsorted[j].length() == minStr.length()) {
    				if(Integer.parseInt(unsorted[j]) < Integer.parseInt(minStr)) {
    					minIdx = j;
    				}
    			}
    		}
    		temp = unsorted[i];
    		unsorted[i] = unsorted[minIdx];
    		unsorted[minIdx] = String.valueOf(temp);
    	}
    	return unsorted;
    }
    
}



