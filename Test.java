package com.bingbing.chapter4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("测试求吸血鬼数字方法1:");
		Vampire vn = new Vampire();
		Scanner in = new Scanner(System.in);
		System.out.println("您要求几位数的吸血鬼数字？");
		int k = in.nextInt();
		in.close();
		vn.getVamNum(k);
		
		System.out.println("*************************************");
		
		System.out.println("测试求吸血鬼数字方法2:");
		Vampire2 vn2 = new Vampire2();
		vn2.doIt();
	}

}
