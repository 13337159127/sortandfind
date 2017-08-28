package com.sort.find.insertsort;

public class InsertSort4 {

	/**
	 * 为随机数组赋值
	 * 
	 * @param number
	 *            传进来数组的长度
	 * @return
	 */
	public int[] randomarray(int number) {
		int[] numberArray = new int[number];
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = (int) (Math.random() * number);
		}
		return numberArray;
	}

	/**
	 * "插入排序算法"给数组的值按照从小到大的顺序排序
	 * 
	 * @param numberArray
	 *            传进来的数组
	 * @return
	 */
	public int[] numberarray(int[] numberArray) {
		for (int i = 1; i < numberArray.length; i++) {
			// 找到一个目标值做对比
			int number = numberArray[i];
			int j = i;
			// 如果j大于0 并且小于前面的值
			while (j > 0 && number < numberArray[j - 1]) {
				//把大的值向后移动一位
				numberArray[j] = numberArray[j - 1];
				j--;
			}
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
		InsertSort4 sort = new InsertSort4();
		int number = 10;
		int[] numberArray = sort.randomarray(number);
		int[] sortNumber = sort.numberarray(numberArray);
		sort.printNumber(sortNumber);
	}
}
