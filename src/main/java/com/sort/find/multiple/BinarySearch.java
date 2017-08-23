package com.sort.find.multiple;

public class BinarySearch {

	/**
	 * 用折半查找法查找数字在数组中的位置
	 * 
	 * @param number
	 *            传进来的数字
	 * @param numberArray
	 *            传进来的数组
	 */
	public int biseach(int number, int[] numberArray) {
		// 定义一个数组下标的范围，从0开始
		int low = 0;
		// 获取数组索引的最大值.如果不-1，一直循环下去，会报数组越界异常
		int array = numberArray.length - 1;
		// 定义一个while循环，表示查找数组的范围
		while (low <= array) {
			// 折半查找：从数组的中间开始查找
			int min = (low + array) / 2;
			// 如果数组下标min查询出来的值等于传进来的值，则返回数组下标
			if (numberArray[min] == number) {
				return min;
			} else if (numberArray[min] < number) { /* 如果传进来的数字比中间大，则给数组下标加1， 则向上查询*/
				low = min + 1;
			} else {/* 否则，则给数组下标减1，向下查询 */
				array = min - 1;
			}
		}
		return -1;
	}

	/**
	 * 传参数，调用方法
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearch srach = new BinarySearch();
		int number = 20;
		int[] numberArray = { 1, 3, 6, 7, 8, 10, 11, 13, 15 };
		int returnNumber = srach.biseach(number, numberArray);
		System.out.println(returnNumber);
	}

}
