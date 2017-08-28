package com.sort.find.sortfindnumber;

public class InsertSortBiSearchImpl implements NumberArraySort {

	/**
	 * 为随机数组赋值
	 */
	@Override
	public int[] randomnumber(int numberLength) {
		int[] numberArray = new int[numberLength];
		for (int i = 0; i < numberArray.length; i++) {
			// 为数组赋值随机数
			numberArray[i] = (int) (Math.random() * numberLength);
		}
		return numberArray;
	}

	/**
	 * 用"插入排序法"给随机数组排序
	 */
	@Override
	public int[] sortnumber(int[] randomNumber) {
		for (int i = 1; i < randomNumber.length; i++) {
			int number = randomNumber[i];
			int j = i;
			while (j > 0 && number < randomNumber[j - 1]) {
				// 把大值向后移动一位
				randomNumber[j] = randomNumber[j - 1];
				j--;
			}
		}
		return randomNumber;
	}

	/**
	 * 打印排序好数组的值
	 */
	@Override
	public void printnumber(int[] numberArray) {
		for (int i = 0; i < numberArray.length; i++) {
			if (i == numberArray.length - 1) {
				System.out.println(numberArray[i] + " ");
			} else {
				System.out.print(numberArray[i] + " ");
			}
		}

	}

	/**
	 * 用"折半查找法"查找数字在数组中的位置
	 */
	@Override
	public int bisearch(int[] numberArray, int findNumber) {
		int low = 0;
		// 获取最大数组下标
		int array = numberArray.length - 1;
		while (low <= array) {
			int center = (low + array) / 2;
			if (numberArray[center] == findNumber) {
				return center;
			} else if (numberArray[center] > findNumber) {
				array = center - 1;
			} else {
				low = center + 1;
			}
		}
		return -1;
	}

	/**
	 * 打印数字在数组中的位置
	 */
	@Override
	public void print(int returnNumber, int findNumber) {
		if (returnNumber == -1) {
			System.out.println("数字不在数组中");
		} else {
			System.out.println("数字" + findNumber + "在数组下标的位置为：" + returnNumber);
		}
	}

}
