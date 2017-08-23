package com.sort.find.sortfindnumber;

public class BubbleSortBiSearchImpl implements NumberArraySort {

	/**
	 * 为随机数组赋值
	 */
	public int[] randomnumber(int numberLength) {
		int[] array = new int[numberLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * numberLength);
		}
		return array;
	}

	/**
	 * 用冒泡排序法给数组的值按照从大到小顺序排列
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
			}else{
				System.out.print(numberArray[i] + " ");
			}			 
		}

	}

	/**
	 * 用折半查找法查询数字在数组中的位置
	 */
	public int bisearch(int[] numberArray, int findNumber) {
		// 获取数组下标的最大值
		int low = 0;
		int array = numberArray.length - 1;
		// 折半查找法查找数组中的数字
		while (low <= array) {
			int min = (low + array) / 2;
			if (numberArray[min] == findNumber) {
				return min;
			} else if (numberArray[min] > findNumber) {
				array = min - 1;
			} else {
				low = min + 1;
			}
		}
		return -1;
	}

	/**
	 * 打印数字在数组中的位置
	 */
	public void print(int returnNumber, int findNumber) {
		if (returnNumber == -1) {
			System.out.print(findNumber + "不在数组中");
		} else {
			System.out.print("数字" + findNumber + "在数组中的位置为[" + returnNumber + "]");
		}
	}

}
