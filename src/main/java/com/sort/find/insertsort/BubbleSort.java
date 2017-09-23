package com.sort.find.insertsort;

import java.util.Arrays;

public class BubbleSort {

	/**
	 * 用“冒泡排序法”把数组的值按照从小到大顺序排列
	 * 它重复的走访要排序的数列，一次比较两个元素，如果他们顺序错误就把他们交换过来，直到不需要再交换，
	 * 也就是说该数列已经排序完成。
	 * 
	 * @param numberArray
	 *            传进来数组
	 * @return 排序号的数组
	 */
	public int[] numberarray(int[] numberArray) {
		// 定义一个目标值
		for (int i = 0; i < numberArray.length; i++) {
			// 目标值与后面的值一一比较
			for (int j = i + 1; j < numberArray.length; j++) {
				if (numberArray[i] > numberArray[j]) {
					int replaceNumber = numberArray[i];
					numberArray[i] = numberArray[j];
					numberArray[j] = replaceNumber;
				}
			}
		}
		return numberArray;
	}

	/**
	 * 打印数组的值
	 * 
	 * @param sortNumber
	 */
	public void printNumber(int[] sortNumber) {	
		//直接输出数组的值
		System.out.print(Arrays.toString(sortNumber)); 
	}

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int[] numberArray = { 16, 4, 47, 11, 20 };
		int[] sortNumber = sort.numberarray(numberArray);
		sort.printNumber(sortNumber);
	}

}
