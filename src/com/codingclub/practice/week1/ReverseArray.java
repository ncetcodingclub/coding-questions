package com.codingclub.practice.week1;

public class ReverseArray {
//Reverse an array
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int len = arr.length;
		for (int i = len - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
