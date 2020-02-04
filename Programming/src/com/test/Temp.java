package com.test;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Temp {
	public static void main(String[] args) throws ScriptException {
		String ruleFormula = "false && (false && (true || (false || false)) && false) || (true || false) && true";
		
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine engine = sem.getEngineByName("JavaScript"); // 엔진 가져오는게 오래걸림
		long beforeTime = System.currentTimeMillis();
		boolean result = (boolean) engine.eval(ruleFormula); // 실제 evaluate는 크게 오래걸리지는 않음
		long afterTime = System.currentTimeMillis();
		
		System.out.println(result);
		long diff = (afterTime - beforeTime);
		System.out.println(diff);
		
		String foo = "sj:1,sh:9,hj:3";
		Map<String, Integer> map = Arrays.asList(foo.split(",")).stream().map(s -> s.split(":"))
				.collect(Collectors.toMap(e -> e[0], e -> Integer.parseInt(e[1])));
		System.out.println(map.toString());
		
		int a=1, b=2;
		engine.put("a", a);
		engine.put("b", b);
		String str = "a>b";
		long st = System.currentTimeMillis();
		boolean test = (boolean) engine.eval(str);
		long en = System.currentTimeMillis();
		long d = en - st;
		
		if(test) {
			System.out.println("참입니다");
		}else {
			System.out.println("거짓입니다");
		}
		System.out.println(d);
	}
}
