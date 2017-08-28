package com.sort.find.insertsort;

public class InsertSort3 {

	/**
	 * 用“选择排序法”给数组进行排序
	 * 
	 * @param numberArray
	 *            传进来的数组
	 * @return
	 */
	public int[] numberarray(int[] numberArray) {
		// 定义一个目标值
		for (int i = 0; i < numberArray.length; i++) {
			// 定义一个最小下标值
			int smallTab = i;
			for (int j = i + 1; j < numberArray.length; j++) {
				if (numberArray[smallTab] > numberArray[j]) {
					smallTab = j;
				}
			}
			// 找到最小值，交换两个数的位置
			if (i != smallTab) {
				int replaceNumber = numberArray[i];
				numberArray[i] = numberArray[smallTab];
				numberArray[smallTab] = replaceNumber;
			}
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
		InsertSort3 sort = new InsertSort3();
		int[] numberArray = { 16, 4, 47, 11, 20 };
		int[] sortNumber = sort.numberarray(numberArray);
		sort.printNumber(sortNumber);
	}

}
