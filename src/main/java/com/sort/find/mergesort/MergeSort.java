package com.sort.find.mergesort;

import java.util.Arrays;

public class MergeSort {

	/**
	 * 归并排序 将两个有序表合并成一个新的有序表， 即把待排序序列分为若干个子序列，每个子序列是有序的。
	 * 然后再把有序子序列合并为整体有序序列
	 * 
	 * @param numberArray
	 *            待排序数组
	 * @param start
	 *            数组下标起始值
	 * @param end
	 *            数组下标结束值
	 * @return
	 */
	public static int[] sort(int[] numberArray, int start, int end) {
		//找到数组的中间数组下标
		int center = (start + end) / 2;
		if (start < end) {
			// 左边序列
			sort(numberArray, start, center);
			// 右边序列
			sort(numberArray, center + 1, end);
			// 左右归并
			merge(numberArray, start, center, end);
		}
		return numberArray;
	}

	/**
	 * 用"归并排序法"为数组排序
	 * 
	 * @param numberArray
	 *            待排序数组
	 * @param start
	 *            起始值
	 * @param center
	 *            中间值
	 * @param end
	 *            结束值
	 */
	public static void merge(int[] numberArray, int start, int center, int end) {
		//定义一个新数组
		int[] temp = new int[end - start + 1];
		// 左指针
		int i = start; 
		// 右指针
		int j = center + 1; 
		int k = 0;

		// 把numberArray数组较小的数先移到新数组中
		while (i <= center && j <= end) {
			if (numberArray[i] < numberArray[j]) {
				temp[k++] = numberArray[i++];
			} else {
				//把小值放到新数组的前面
				temp[k++] = numberArray[j++];
			}
		}

		// 把左边剩余的数移入数组
		while (i <= center) {
			temp[k++] = numberArray[i++];
		}

		// 把右边剩余的数移入数组
		while (j <= end) {
			temp[k++] = numberArray[j++];
		}

		// 把新数组中排序好的数字覆盖numberArray数组
		for (int q = 0; q < temp.length; q++) {
			numberArray[q + start] = temp[q];
		}
	}

	/**
	 * 打印排序好的数组
	 * 
	 * @param returnArray
	 *            排序好的数组
	 */
	public void print(int[] returnArray) {
		// Arrays.toString（）的作用是用来很方便地输出数组，而不用一个一个地输出数组中的元素。
		System.out.println(Arrays.toString(returnArray));
	}

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MergeSort mergesort = new MergeSort();
		int[] numberArrray = { 51, 26, 40, 18,22 };
		int start = 0;
		int end = numberArrray.length - 1;
		int[] returnArray = sort(numberArrray, start, end);
		mergesort.print(returnArray);
	}
}
