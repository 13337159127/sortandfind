package com.sort.find.multiple;

public class SelectionSort {

	/**
	 * 按照选择排序法将数组的值按照从大到小排列
	 * 
	 * @param numberArray
	 *            传进来的数组
	 * @return
	 */
	public int[] sort(int[] numberArray) {
		// 定义一个循环，找到一个 “目标值”
		for (int i = 0; i < numberArray.length; i++) {
			// 数组下标min，取出来的值是数组中最大的值
			int bigTab = i;
			// 定义一个循环，从数组中找出最小的值
			for (int j = i + 1; j < numberArray.length; j++) {
				// 如果根据数组下标i取出来的值 大于 根据数组下标为j取出来的值，找出最大值下标，则进入循环
				if (numberArray[bigTab] < numberArray[j]) {
					// 把最小的值赋值给数组下标
					bigTab = j;
				}
			}
			// 如果i的值不等于min的值，则说明查询出数组的最大值，要把小的值替换掉
			if (i != bigTab) {
				int replaceNumber = numberArray[i];
				numberArray[i] = numberArray[bigTab];
				numberArray[bigTab] = replaceNumber;
			}
			// 打印数组变化的值
			for (int c = 0; c < numberArray.length; c++) {
				if (c == numberArray.length - 1) {
					System.out.println(numberArray[c] + " ");
				} else {
					System.out.print(numberArray[c] + " ");
				}
			}
		}
		return numberArray;
	}

	/**
	 * 打印数组里面的值
	 * 
	 * @param score
	 */
	public void print(int[] sortArray) {
		for (int i = 0; i < sortArray.length; i++) {
			// System.out.print(sortArray[i] + " ");
		}
	}

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SelectionSort selectsort = new SelectionSort();
		// 定义一个数组，把数字放到一个数组中
		int numberArray[] = { 1, 9, 3, 0, 4, 8, 7, 6, 2, 7 };
		int[] sortArray = selectsort.sort(numberArray);
		selectsort.print(sortArray);
	}

}
