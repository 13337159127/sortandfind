package com.sort.find.select;

public class Bisearch {

	/**
	 * 用折半查找法查找数组中的位置
	 * 
	 * @param numberArray
	 *            传过来的数组
	 * @param targentNumber
	 *            传过来的变量
	 * @return
	 */
	private int getPositionNumber(int[] numberArray, int targentNumber) {
		int low = 0;
		// 如果数组不减1，传进来数组外的值，会报非法索引访问数组时抛出的异常（如果索引为负或大于等于数组大小，则该索引为非法索引）。
		// -1就是为了定义数组的最大索引
		int array = numberArray.length - 1;
		while (low <= array) {
			// 折半查找：从数组的中间开始查找
			int mid = (low + array) / 2;
			// 如果根据数组下标的值查询出来的值等于要找的值，则返回数组下表的值
			if (numberArray[mid] == targentNumber) {
				return mid;
				// 如果根据数组下标的值查询出来的值小于要找的值，则给数组下标加1，向上查找。
			} else if (numberArray[mid] < targentNumber) {
				low = mid + 1;
				// 否则，根据数组下标的值查询出来的值大于要找的值，则给数组下标减1，向下查找。
			} else {
				array = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * 调用方法，向方法中传参数，接收返回值
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Bisearch bisearch = new Bisearch();
		int targentNumber = 10;		 
		int[] numberArray = {1,2,3,4,5,6,7,8,9};	 
		long start = System.currentTimeMillis();
		int postion = bisearch.getPositionNumber(numberArray, targentNumber);
		long end = System.currentTimeMillis();
		System.out.println(end - start + "毫秒");
		System.out.println(postion);
	}

}
