package com.sort.find.sort;

public class SelectSortFromSmallToBig {

	/**
	 * 用选择排序法，把数组的值按照从小到大的顺序排列
	 * 
	 * @param numberArray
	 *            传进来数组
	 * @return
	 */
	public int[] sortnumber(int[] numberArray) {
		// 找到一个目标值
		for (int i = 0; i < numberArray.length; i++) {
			int smallTab = i;
			// 从数组中找到数组最小值
			for (int j = i + 1; j < numberArray.length; j++) {
				// 如果根据数组下标J取出来的值 小于 根据数组下标smallTab取出来的值，则进入循环
				if (numberArray[j] < numberArray[smallTab]) {
					// 最小值下标
					smallTab = j;
				}
			}
			// 如果i的值不等于smallTab的下标，说明找出最小值
			if (i != smallTab) {
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
		SelectSortFromSmallToBig sort = new SelectSortFromSmallToBig();
		int[] numberArray = { 3, 7, 6, 4, 8, 9 };
		int[] array = sort.sortnumber(numberArray);
		sort.printNumber(array);
	}

}
