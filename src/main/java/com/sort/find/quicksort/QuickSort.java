package com.sort.find.quicksort;

public class QuickSort {

	/**
	 * 用"快速排序法"把数组的值按照从小到大顺序进行排序
	 * 找到一个基准数，从基准数中间把序列分成两部分，一部分数字把基准数小，，另一部分比基准数大，直到不能分割为止，则排序完成
	 * 
	 * @param numberArray
	 *            传进来的数组
	 * @param start
	 *            数组下标起始值
	 * @param end
	 *            数组下标结束值
	 * @return
	 */
	public int[] quicksort(int[] numberArray, int start, int end) {
		int smallTab = start;
		int bigTab = end;
		// 用数组里面的第一个值作为基准数
		int number = numberArray[start];
		while (bigTab > smallTab) {
			// 从数组的后面向前查找，直到找到数字小于基准值，就是为了找最小的数字
			while (bigTab > smallTab && numberArray[bigTab] >= number) {
				bigTab--;
			}
			// 如果数组查询出来的值“小于或等于”基准数,交换查询出来的值和基准数的位置。
			if (numberArray[bigTab] <= number) {
				int replcaeNumber = numberArray[bigTab];
				numberArray[bigTab] = numberArray[smallTab];
				numberArray[smallTab] = replcaeNumber;
			}
			// 从数组的前面向后查找，直到找到数字大于基准值，就是为了找到最大数字
			while (bigTab > smallTab && numberArray[smallTab] <= number) {
				smallTab++;
			}
			// 如果数组查询出来的值“大于或等于”基准数，和基准数交换位置。
			if (numberArray[smallTab] >= number) {
				int replcaeNumber = numberArray[smallTab];
				numberArray[smallTab] = numberArray[bigTab];
				numberArray[bigTab] = replcaeNumber;
			}
		}
		// 递归
		if (smallTab > start) {
			// 左边序列。第一个索引位置到基准数索引-1
			quicksort(numberArray, start, smallTab - 1);
		}
		if (bigTab < end) {
			// 右边序列。从基准数值索引+1到最后一个
			quicksort(numberArray, bigTab + 1, end);
		}
		return numberArray;
	}

	/**
	 * 打印数组
	 * 
	 * @param returnArray
	 *            传进来的数组
	 */
	public void print(int[] returnArray) {
		for (int i = 0; i < returnArray.length; i++) {
			System.out.print(returnArray[i] + " ");
		}
	}

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		int[] numberArray = { 5, 3, 8, 11, 7 };
		int start = 0;
		int end = numberArray.length - 1;
		int[] returnArray = sort.quicksort(numberArray, start, end);
		sort.print(returnArray);
	}

}
