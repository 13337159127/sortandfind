package com.sort.find.insertsort;

public class InsertSort2 {

	/**
	 * 用“冒泡排序法”把数组的值按照从大到小顺序排列
	 * 
	 * @param numberArray
	 *            传进来数组
	 * @return 排序号的数组
	 */
	public int[] numberarray(int[] numberArray) {
		// 定义一个目标值
		for (int i = 0; i < numberArray.length; i++) {
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
			System.out.print(sortNumber[i] + " ");
		}
	}

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		InsertSort2 sort = new InsertSort2();
		int[] numberArray = { 16, 4, 47, 11, 20 };
		int[] sortNumber = sort.numberarray(numberArray);
		sort.printNumber(sortNumber);
	}

}
