package com.sort.find.sort;

import java.util.Arrays; 

public class FromSmallToBig2 {
	 
	/**
	 * 根据数字按照从小到大排序 , Arrays.sort(数组);方法排序
	 * 
	 * @param args
	 */
	public static void main(String[] args) {		 
		// 定义一个数组，把数字放到一个数组中
		int numberArray[] = { 20, 45, 9, 11 };
		Arrays.sort(numberArray);	
		for(int i = 0;i<numberArray.length;i++){
			System.out.print(numberArray[i]+" ");
		}
	}

}
