package com.sort.find.time;

public class SelectionSort implements Sort {

	/**
	 * 给数组的值排序
	 * 
	 * @param numberArray
	 *            传进来的数组
	 * @return
	 */
	public int[] sort(int[] numberArray) {
		// 找到一个数组目标值
		for (int i = 0; i < numberArray.length; i++) {
			// smallTab是数组的最小下标
			int smallTab = i;
			// 给数组的值排序
			for (int j = i + 1; j < numberArray.length; j++) {
				// 如果根据数组下标J取出来的值 小于 根据smallTab下标取出来的值，找出最大值
				if (numberArray[j] > numberArray[smallTab]) {
					smallTab = j;
				}
			}
			// 如果不相等，说明找到数组里面最小的值，两值互换位置
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
	 * @param sortNumber
	 *            传进来的数组
	 */
	public void printNumber(int[] sortNumber) {
		for (int i = 0; i < sortNumber.length; i++) {
			if (i == sortNumber.length - 1) {
				System.out.println(sortNumber[i] + " ");
			} else {
				System.out.print(sortNumber[i] + " ");
			}
		}
	}

}
