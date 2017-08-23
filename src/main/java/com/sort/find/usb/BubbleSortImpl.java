package com.sort.find.usb;

public class BubbleSortImpl implements NumberArraySort {

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
	 * 用冒泡排序法把数组的值按照从大到小顺序进行排序
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
	 * 打印数组的值
	 */
	public void printnumber(int[] numberArray) {
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print(numberArray[i] + " ");
		}
	}
}
