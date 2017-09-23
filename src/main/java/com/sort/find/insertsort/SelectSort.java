package com.sort.find.insertsort;

public class SelectSort {

	/**
	 * 用“选择排序法”给数组进行排序
	 * 每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置。
	 * 起始位置的值和最大(小)值交换，直到全部待排序的数据元素排完。
	 * @param numberArray
	 *            传进来的数组
	 * @return
	 */
	public int[] numberarray(int[] numberArray) {
		for (int i = 0; i < numberArray.length; i++) {
			// 定义一个最小下标
			int smallTab = i;
			// 从数字中选取一个最小值
			for (int j = i + 1; j < numberArray.length; j++) {
				if (numberArray[smallTab] > numberArray[j]) {
					smallTab = j;
				}
			}
			// 最小值和基准值交换位置
			if (smallTab != i) {
				int replaceNumber = numberArray[i];
				numberArray[i] = numberArray[smallTab];
				numberArray[smallTab] = replaceNumber;
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
		for (int i = 0; i < sortNumber.length; i++) {
			System.out.print(sortNumber[i] + " ");
		}
	}

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SelectSort sort = new SelectSort();
		int[] numberArray = { 16, 11, 47, 4, 20 };
		int[] sortNumber = sort.numberarray(numberArray);
		sort.printNumber(sortNumber);
	}

}
