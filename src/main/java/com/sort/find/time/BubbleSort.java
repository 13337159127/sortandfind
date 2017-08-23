package com.sort.find.time;

public class BubbleSort implements Sort {

	/**
	 * 给数组的值排序，
	 * 
	 * @param numberArray
	 *            传进来的数组
	 * @return
	 */
	public int[] sort(int[] numberArray) {
		// 找到一个数组目标值
		for (int i = 0; i < numberArray.length; i++) {
			// 给数组的值排序
			for (int j = i + 1; j < numberArray.length; j++) {
				// 如果数组下标J取出来值 大于 数组下标i取出来的值，则进入循环
				if (numberArray[j] > numberArray[i]) {
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
	 *            传进来的数组
	 */
	public void printNumber(int[] sortNumber) {
		for (int i = 0; i < sortNumber.length; i++) {
			System.out.print(sortNumber[i] + " ");
		}
	}

}
