package com.sort.find.multiple;

public class BubbleSort {

	/**
	 * 根据冒泡排序法，把数组的值按照从大到小的顺序排列
	 * 
	 * @param numberArray
	 *            传进来的数组
	 * @return
	 */
	public int[] numbersort(int[] numberArray) {
		// 选出一个 目标值
		for (int i = 0; i < numberArray.length; i++) {
			// 两个值做比较，找出比较最大值
			for (int j = i + 1; j < numberArray.length; j++) {
				// 如果根据数组下标j查询出来的值 大于 根据数组i查询出来的值，则进入循环
				if (numberArray[j] > numberArray[i]) {
					// 把根据下标为i的值赋值给变量
					int replaceNumber = numberArray[i];
					// 把根据数组下标J查询出来大的值 赋值(替换) 给成第一个值
					numberArray[i] = numberArray[j];
					// 把大的值用小的值替换掉
					numberArray[j] = replaceNumber;
					// 打印数组变化的值
					for (int c = 0; c < numberArray.length; c++) {
						// 如果数组下标为最大值的时候，换行。否则，不换行
						if (c == numberArray.length - 1) {
							System.out.println(numberArray[c] + " ");
						} else {
							System.out.print(numberArray[c] + " ");
						}
					}
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
	public void print(int[] array) {
		// 循环遍历数组的值
		for (int i = 0; i < array.length; i++) {
			// System.out.print(array[i] + " ");
		}
	}

	/**
	 * 调用方法，传递参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int[] numberArray = { 1, 9, 3, 0, 4, 8, 7, 6, 2, 7 };
		int[] array = sort.numbersort(numberArray);
		sort.print(array);
	}

}
