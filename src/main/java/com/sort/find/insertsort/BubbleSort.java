package com.sort.find.insertsort;

public class BubbleSort {

	/**
	 * 用“冒泡排序法”把数组的值按照从小到大顺序排列
	 * 一序列数字，两个数字一一比较，如果符合排序规则，则不用动，如果不符合排序规则，则把两个数字互换位置，直到不能交换为止，则排序完成
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
		for (int i = 0; i < sortNumber.length; i++) {
			System.out.print(sortNumber[i] + "\t");
		}
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
