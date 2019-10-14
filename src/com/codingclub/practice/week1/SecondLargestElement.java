package com.codingclub.practice.week1;

import java.util.Arrays;

public class SecondLargestElement {
//find the SecondLargestElement in a unsorted array
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int len = arr.length;
		Arrays.sort(arr);
		System.out.println(arr[len - 2]);
	}

}
