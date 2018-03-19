package com.zht.error;

public class StackOverflowErrorTest {

	public static void test01() {
		test01();
	}
	public static void main(String[] args) {
		test01();
		
	}

}
