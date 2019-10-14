package com.codingclub.practice.week1;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 1,5 };
		int len = arr.length;
		Arrays.sort(arr);
		int index = getUpToIndex(arr, len);
		for(int i=0;i<index;i++)
			System.out.print(arr[i]+" ");
	}

	private static int getUpToIndex(int[] arr, int len) {
		int index = 0;
		for (int i = 0; i < len-1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[index++] = arr[i];
			}
		}
		arr[index++]=arr[len-1];
		return index;
	}

}
