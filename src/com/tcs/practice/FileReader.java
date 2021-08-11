package com.tcs.practice;
import java.util.Arrays;//normal import
import static java.util.Arrays.*;//Static import
public class FileReader {
	public static void main (String[] args) {
		int[] numbers={1,2,3,47,8};
		sort(numbers);//works with static import
		Arrays.sort(numbers);
		
}
}
