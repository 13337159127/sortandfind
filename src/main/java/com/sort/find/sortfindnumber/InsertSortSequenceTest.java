package com.sort.find.sortfindnumber;

public class InsertSortSequenceTest {

	/**
	 * 调用方法，传参数
	 * @param args
	 */
	public static void main(String[] args) {
		InsertSortSequenceImpl sort = new InsertSortSequenceImpl();
		int numberLength = 10;
		int[] randomNumber = sort.randomnumber(numberLength);
		long sortTimeStart = System.currentTimeMillis();
		int[] numberArray = sort.sortnumber(randomNumber);
		long sortTimeEnd = System.currentTimeMillis();
		System.out.println(sortTimeEnd - sortTimeStart + "毫秒。插入排序法花费的时间");
		sort.printnumber(numberArray);
		int findNumber = 3;
		long findTimeStart = System.currentTimeMillis();
		int returnNumber = sort.bisearch(numberArray, findNumber);
		long findTimeEnd = System.currentTimeMillis();
		System.out.println(findTimeEnd - findTimeStart + "毫秒。折半查找法花费的时间");
		sort.print(returnNumber, findNumber);
	}

}
