package com.sort.find.sortfindnumber;

public class BubbleSortSequenceImpl implements NumberArraySort {

	/**
	 * 为数组赋值
	 */
	public int[] randomnumber(int numberLength) {
		int[] array = new int[numberLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * numberLength);
		}
		return array;
	}

	/**
	 * 用“冒泡排序法”为数组排序
	 */
	public int[] sortnumber(int[] randomNumber) {
		for (int i = 0; i < randomNumber.length; i++) {
			for (int j = i + 1; j < randomNumber.length; j++) {
				if (randomNumber[j] < randomNumber[i]) {
					int replaceNumber = randomNumber[i];
					randomNumber[i] = randomNumber[j];
					randomNumber[j] = replaceNumber;
				}
			}
		}
		return randomNumber;
	}

	/**
	 * 打印排序好的数组
	 */
	public void printnumber(int[] numberArray) {
		for (int i = 0; i < numberArray.length; i++) {
			if (i == numberArray.length - 1) {
				System.out.println(numberArray[i]);
			} else {
				System.out.print(numberArray[i] + " ");
			}

		}
	}

	/**
	 * 用“顺序查找法”查找数字在数组中的位置
	 */
	public int bisearch(int[] numberArray, int findNumber) {
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] == findNumber) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * 打印数字在数组中的位置
	 */
	public void print(int returnNumber, int findNumber) {
		if (returnNumber == -1) {
			System.out.println("数字不在数组中");
		} else {
			System.out.println("数字" + findNumber + "在数组中的位置为[" + returnNumber + "]");
		}
	}
}
