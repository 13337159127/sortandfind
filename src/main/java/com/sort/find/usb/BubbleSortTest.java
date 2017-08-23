package com.sort.find.usb;

public class BubbleSortTest {

	/**
	 * 调用方法，传数组的长度
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		NumberArraySort sort = new BubbleSortImpl();
		int numberLength = 10;
		int[] randomNumber = sort.randomnumber(numberLength);
		long end = System.currentTimeMillis();
		int[] numberArray = sort.sortnumber(randomNumber);
		long start = System.currentTimeMillis();
		System.out.println(end - start + "毫秒");
		sort.printnumber(numberArray);
	}

}
