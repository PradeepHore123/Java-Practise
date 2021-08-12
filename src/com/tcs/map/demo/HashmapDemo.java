package com.tcs.map.demo;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
	public static void main(String[] args) {
		createHashMap();
	}

	private static void createHashMap() {
		Map<String,Student> mathScores = new HashMap<>();
		for(int i=0;i<20;i++) {
			mathScores.put("student"+i,
					new Student(new Float(100*Math.random()),new Float(100*Math.random()),new Float(100*Math.random())));
		}
		Boolean exits=mathScores.containsKey("student1");
		//mathScores.put("student1",34F)
		mathScores.remove("student1");
		System.out.println(mathScores);
	}
}