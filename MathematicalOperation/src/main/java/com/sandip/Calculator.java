package com.sandip;

public class Calculator {
	public static int add(int a, int b) {
		return (a + b);
	}

	public static int substract(int a, int b) {
		return (a - b);
	}

	public static int multiply (int a, int b) {
		return (a * b);
	}

	// This method has a if condition. Your test case should cover both 
	// if and else block to achieve 100% coverage in this method
	public static int divide(int a, int b) {
		if(b > 0) {
			return (a/b);
		} else {
			return -1;
		}
	}
} 
