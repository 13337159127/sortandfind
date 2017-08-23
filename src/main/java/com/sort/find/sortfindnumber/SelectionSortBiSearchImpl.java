package com.sort.find.sortfindnumber;

public class SelectionSortBiSearchImpl implements NumberArraySort {

	/**
	 * 为数组赋值随机数
	 */
	public int[] randomnumber(int numberLength) {
		int[] numberArray = new int[numberLength];
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = (int) (Math.random() * numberLength);
		}
		return numberArray;
	}

	/**
	 * 用“选择排序法”把数组的值按照从大到小顺序进行排序
	 */
	public int[] sortnumber(int[] randomNumber) {
		for (int i = 0; i < randomNumber.length; i++) {
			int bigTab = i;
			for (int j = i + 1; j < randomNumber.length; j++) {
				if (randomNumber[j] < randomNumber[bigTab]) {
					bigTab = j;
				}
			}
			if (bigTab != i) {
				int replaceNumber = randomNumber[i];
				randomNumber[i] = randomNumber[bigTab];
				randomNumber[bigTab] = replaceNumber;
			}
		}
		return randomNumber;
	}

	/**
	 * 打印数组的值
	 */
	public void printnumber(int[] numberArray) {
		for (int i = 0; i < numberArray.length; i++) {
			if (i == numberArray.length - 1) {
		//		System.out.println(numberArray[i] + " ");
			} else {
		//		System.out.print(numberArray[i] + " ");
			}
		}
	}

	/**
	 * 用 “折半查找法” 查找数字在数组中的位置
	 */
	public int bisearch(int[] numberArray, int findNumber) {
		int low = 0;
		int bigArray = numberArray.length - 1;
		while (low <= bigArray) {
			int min = (low + bigArray) / 2;
			if (numberArray[min] == findNumber) {
				return min;
			} else if (numberArray[min] < findNumber) {
				low = min + 1;
			} else {
				bigArray = min - 1;
			}
		}
		return -1;
	}

	/**
	 * 打印数字在数组中的位置
	 */
	public void print(int returnNumber, int findNumber) {
		if (returnNumber != -1) {
			System.out.println("数字" + findNumber + "在数组下标为" + returnNumber);
		} else {
			System.out.println("数字不在数组中" + returnNumber);
		}
	}

}
