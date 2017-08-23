package com.sort.find.select;

public class SequentialSearch {

	/**
	 * 判断数字在数组中的位置：按照顺序查找法
	 * 
	 * @param numberArray
	 *            传进来的数组
	 * @param targetNumber
	 *            传进来的变量
	 * @return
	 */
	private int getNumberPosition(int[] numberArray, int targetNumber) {
		for (int i = 0; i < numberArray.length; i++) {
			int findNumber = numberArray[i];
			if (findNumber == targetNumber) {
				System.out.println("数字" + findNumber + "在数组中的位置为:numberArray[" + i + "]");
				return findNumber;
			}
		}
		System.out.println(targetNumber + "不在数组里面");
		// 数组的范围是从0到数组的长度 ，返回-1，就说明传进来这个值不在数组里面
		return -1;
	}

	/**
	 * 调用方法，向方法里面传递一个变量和一个数组
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SequentialSearch math = new SequentialSearch();
		int targetNumber = 1;
		int[] numberArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		math.getNumberPosition(numberArray, targetNumber);
	}
}
