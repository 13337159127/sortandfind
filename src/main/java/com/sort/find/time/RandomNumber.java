package com.sort.find.time;

public class RandomNumber {

	/**
	 * 为数组赋值随机数
	 * 
	 * @param numberArray
	 *            传进来的数组
	 * @return 返回一个数组
	 */
	public int[] randomnumer(int numberLength) {
		int[] numberArray = new int[numberLength];
		// Math.random()获取随机数，*多少，获取多少随机数
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = (int) (Math.random() * numberLength);
		}
		return numberArray;
	}

	/**
	 * 复制一个数组
	 * 
	 * @param randomArray
	 *            传进来的数组
	 * @return 返回一个复制的数组
	 */
	public int[] copyarray(int[] randomArray) {
		// 调用产生随机数的方法
		int[] copyArray = new int[randomArray.length];
		// 复制一个数组
		for (int i = 0; i < randomArray.length; i++) {
			copyArray[i] = randomArray[i];
		}
		return copyArray;
	}

	/**
	 * 调用排序方法
	 */
	public void callsortmethod(int numberLength) {
		RandomNumber number = new RandomNumber();
		int[] randomArray = number.randomnumer(numberLength);
		int[] copyArray = number.copyarray(randomArray);
		Sort selection = new SelectionSort();
		// 记录开始时间。System.currentTimeMillis()产生一个当前的毫秒
		long start = System.currentTimeMillis();
		int[] sortNumber = selection.sort(randomArray);
		// 记录结束时间
		long end = System.currentTimeMillis();
		System.out.println(end - start + "毫秒。选择排序法花费的时间");
		selection.printNumber(sortNumber);

		Sort sort = new BubbleSort();
		long start2 = System.currentTimeMillis();
		int[] sortNumber2 = sort.sort(copyArray);
		// 获取结束时间
		long end2 = System.currentTimeMillis();
		System.out.println(end2 - start2 + "毫秒");
		sort.printNumber(sortNumber2);
	}
}
