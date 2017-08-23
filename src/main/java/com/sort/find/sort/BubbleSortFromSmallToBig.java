package com.sort.find.sort;

public class BubbleSortFromSmallToBig {

	/**
	 * 用冒泡排序法，把数组的值按照从小到大的顺序排列
	 * 
	 * @param numberArray
	 *            传进来数组
	 * @return
	 */
	public int[] sortnumber(int[] numberArray) {
		// 找到一个目标值
		for (int i = 0; i < numberArray.length; i++) {
			// 从数组中找到数组最小值
			for (int j = i + 1; j < numberArray.length; j++) {
				// 如果根据数组下标J取出来的值 小于 根据数组下标i取出来的值
				if (numberArray[j] < numberArray[i]) {
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
	 * @param array
	 */
	public void printNumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BubbleSortFromSmallToBig sort = new BubbleSortFromSmallToBig();
		int[] numberArray = { 3, 7, 6, 4, 8, 9 };
		int[] array = sort.sortnumber(numberArray);
		sort.printNumber(array);
	}

}
