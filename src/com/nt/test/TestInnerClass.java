package com.nt.test;

public class TestInnerClass {
	public static void main(String[] args) {
		System.out.println("start");
		int a = 10;
		a = a++ + ++a - ++a + a++;
		if (a > 55) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
		System.out.println("done");
	}
}