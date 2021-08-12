package com.tcs.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArraylistDemo {
	public static void main(String[] args) {
		createList();
	}
	private static List<Integer>createList() {
		// TODO Auto-generated method stub
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(1);
		numbers.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 -o2;
			}
		});
			System.out.println(numbers);
		for(int count=0;count<20;count++) {
			numbers.add(count);
		}
		return numbers;
	}
	
}