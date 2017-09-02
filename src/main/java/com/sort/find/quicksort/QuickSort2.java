package com.sort.find.quicksort;

public class QuickSort2 {

	/**
	 * 用"快速排序法"为数组的值按照从小到大进行排序
	 * 
	 * @param a
	 *            传进来的数组
	 * @param low
	 *            数组下标最小值
	 * @param high
	 *            数组下标最大值
	 * @return 返回一个排序好的数组
	 */
	public int[] sort(int[] numberArray, int start, int end) {
		int smallTab = start;
		int bigTab = end;
		// 定义一个基准值
		int number = numberArray[start];
		while (bigTab > smallTab) {
			// 从后向前查找，直到找到数组里面的值小于基准数，就是找到小于基准数的值
			while (bigTab > smallTab && number <= numberArray[bigTab]) {
				bigTab--;
			}
			// 如果查询出来的值小于等于基准数，则交换两个数的位置
			if (number >= numberArray[bigTab]) {
				int replaceNumber = numberArray[bigTab];
				numberArray[bigTab] = numberArray[smallTab];
				numberArray[smallTab] = replaceNumber;
			}
			// 从前向后查找，直到数组里面的值大于基准数，就是找到大于基准数的值
			while (bigTab > smallTab && number >= numberArray[smallTab]) {
				smallTab++;
			}
			// 如果查询出来的值大于基准数的值，则交换两个数字的位置
			if (number <= numberArray[smallTab]) {
				int replaceNumber = numberArray[smallTab];
				numberArray[smallTab] = numberArray[bigTab];
				numberArray[bigTab] = replaceNumber;
			}
		}
		// 递归
		if (smallTab > start) {
			// 左边序列，从数组下标0开始到基准数数组下标-1
			sort(numberArray, start, smallTab - 1);
		}
		if (bigTab < end) {
			// 右边序列，从基准数值索引+1到最后一个
			sort(numberArray, bigTab + 1, end);
		}
		return numberArray;
	}

	/**
	 * 打印排序好数组的值
	 * 
	 * @param numberArray
	 *            传进来的数组
	 */
	public void print(int[] numberArray) {
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print(numberArray[i] + " ");
		}
	}

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		QuickSort2 sort = new QuickSort2();
		int[] numberArray = { 100, 45, 4, 74, 81 };
		int start = 0;
		int end = numberArray.length - 1;
		int[] returnArray = sort.sort(numberArray, start, end);
		sort.print(returnArray);
	}

}
