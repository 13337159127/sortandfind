package com.sort.find.sortfindnumber;

public class SequenceSearch {

	/**
	 * 为数组赋值随机数
	 * 
	 * @param numberLength
	 *            数组的长度以及随机数的取值范围
	 * @return
	 */
	public int[] numberarray(int numberLength) {
		int[] numberArray = new int[numberLength];
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = (int) (Math.random() * numberLength);
		}
		return numberArray;
	}

	/**
	 * 打印数组的值
	 * 
	 * @param numberArray
	 *            随机数组
	 */
	public void printarray(int[] numberArray) {
		for (int i = 0; i < numberArray.length; i++) {
			if (i == numberArray.length - 1) {
		//		System.out.println(numberArray[i]);
			} else {
		//		System.out.print(numberArray[i] + " ");
			}

		}
	}

	/**
	 * 用 按照顺序查找法查询数字在数组中的位置
	 * 
	 * @param numberArray
	 *            随机数组
	 * @return
	 */
	public int sequencesearch(int[] numberArray, int findNumber) {
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] == findNumber) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * 打印数字在数组中的位置
	 * 
	 * @param returnNumber
	 */
	public void printnumber(int returnNumber, int findNumber) {
		if (returnNumber == -1) {
			System.out.print(findNumber + "不在数组中");
		} else {
			System.out.print("数字" + findNumber + "在数组中的位置为[" + returnNumber + "]");
		}
	}

	/**
	 * 调用方法 传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SequenceSearch search = new SequenceSearch();
		int numberLength = 1000000;
		int[] numberArray = search.numberarray(numberLength);
		search.printarray(numberArray);
		int findNumber = 674876;
		long start = System.currentTimeMillis();
		int returnNumber = search.sequencesearch(numberArray, findNumber);
		long end = System.currentTimeMillis();
		System.out.println(end - start + "毫秒。查找数字所花费的时间");
		search.printnumber(returnNumber, findNumber);
	}

}
