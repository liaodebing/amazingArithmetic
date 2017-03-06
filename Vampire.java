package com.bingbing.chapter4;

import java.util.*;

public class Vampire {
	
	//求10的n次方
	private int getTenN(int n){
		int k = 1;
		for(int i=0;i<n;i++){
			k*=10;
		}
		return k;
	}
	
	/**
	 * 根据输入的k，求出所有的k位吸血鬼数字
	 * @param k
	 */
	public void getVamNum(int k){
		int sum = 0;	//吸血鬼数字个数
		int ij = 0;		//两数相乘的结果
		String []arr1;	//存放乘积结果的每一位数字
		String []arr2;	//存放乘数的每一位数字
		
		for(int i=getTenN(k/2-1);i<getTenN(k/2);i++){
			for(int j=i+1;j<getTenN(k/2);j++){
				ij = i*j;
				if(ij < getTenN(k-1) || ij > getTenN(k))
					continue;
				arr1=String.valueOf(ij).split("");
				arr2=(String.valueOf(i)+String.valueOf(j)).split("");
				
				Arrays.sort(arr1);
				Arrays.sort(arr2);
				
				if(Arrays.equals(arr1, arr2)){
					sum++;
					System.out.println(ij+" = "+i+" * "+j);
				}
				
			}
		}
		
		System.out.println(k+"位吸血鬼数字有"+sum+"个。");
	}
}
