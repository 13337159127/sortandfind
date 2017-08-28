package com.sort.find.sortfindnumber;

public class InsertSortSequenceImpl implements NumberArraySort {

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
	 * 用"插入排序法"为数组值进行排序
	 */
	@Override
	public int[] sortnumber(int[] randomNumber) {
		for (int i = 1; i < randomNumber.length; i++) {
			int number = randomNumber[i];
			int j = i;
			while (j > 0 && number < randomNumber[j - 1]) {
				randomNumber[j] = randomNumber[j - 1];
				j--;
			}
			randomNumber[j] = number;
		}
		return randomNumber;
	}

	/**
	 * 打印排序好的数组
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
	 * 用"顺序查找法"查找数字在数组中的位置
	 */
	@Override
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
	@Override
	public void print(int returnNumber, int findNumber) {
		if (returnNumber == -1) {
			System.out.println("数字不在数组中");
		} else {
			System.out.println("数字" + findNumber + "在数组下标的位置是：" + returnNumber);
		}
	}

}
