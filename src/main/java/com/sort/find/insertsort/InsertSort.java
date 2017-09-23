package com.sort.find.insertsort;

public class InsertSort {

	/**
	 * 插入排序 
	 * 一序列数字，从后向前比较，按照排序规则，如果符合排序规则，则不用动，如果不符合排序规则， 则把大值向后移动，把基准值插入到该放到的位置
	 * 
	 * @param numberArray
	 *            传进来的数组
	 * @return
	 */
	public int[] numberarray(int[] numberArray) {
		// 插入排序，从后向前查找
		for (int i = 1; i < numberArray.length; i++) {
			int j = i;
			// 定义一个基准值
			int number = numberArray[i];
			while (j > 0 && number < numberArray[j - 1]) {
				// 把大值向后移动
				numberArray[j] = numberArray[j - 1];
				j--;
			}
			//把基准值插入到合适的位置
			numberArray[j] = number;
		}
		return numberArray;
	}

	/**
	 * 打印数组的值
	 * 
	 * @param sortNumber
	 */
	public void printNumber(int[] sortNumber) {
		for (int i = 0; i < sortNumber.length; i++) {
			System.out.print(sortNumber[i] + " ");
		}
	}

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		InsertSort sort = new InsertSort();
		int[] numberArray = { 15, 34, 47, 11, 20 };
		int[] sortNumber = sort.numberarray(numberArray);
		sort.printNumber(sortNumber);
	}
}
