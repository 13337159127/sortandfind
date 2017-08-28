package com.sort.find.insertsort;

public class InsertSort {

	/**
	 * 插入排序
	 * 
	 * @param numberArray
	 *            传进来的数组
	 * @return
	 */
	public int[] numberarray(int[] numberArray) {
		for (int i = 1; i < numberArray.length; i++) {
			int j = i;
			// 定义一个目标值
			int treget = numberArray[i];
			// 如果j大于0，并且treget值小于它前一位的值，则进入循环
			while (j > 0 && treget < numberArray[j - 1]) {
				// 把大的值向后移一位
				numberArray[j] = numberArray[j - 1];
				// 拿目标值与数组前面的值做比较
				j--;
			}
			// 将treget插入到适当位置
			numberArray[j] = treget;
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
		int[] numberArray = { 15, 34, 47, 11, 20, 17, 23, 67, 56 };
		int[] sortNumber = sort.numberarray(numberArray);
		sort.printNumber(sortNumber);
	}
}
