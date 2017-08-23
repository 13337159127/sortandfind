package com.sort.find.sortfindnumber;

public class BubbleSortSequenceTest {

	/**
	 * 调用方法  传参数
	 * @param args
	 */
	public static void main(String[] args) {
		NumberArraySort sort = new BubbleSortSequenceImpl();
		int numberLength = 200000;
		int[] randomNumber = sort.randomnumber(numberLength);
		long end = System.currentTimeMillis();
		int[] numberArray = sort.sortnumber(randomNumber);
		long start = System.currentTimeMillis();
		long sortTime = start - end;
		System.out.println(sortTime + "毫秒。排序数字所花费的时间");
		sort.printnumber(numberArray);
		int findNumber = 174876;
		long end2 = System.currentTimeMillis();
		int returnNumber = sort.bisearch(numberArray,findNumber);
		long start2 = System.currentTimeMillis();
		long findTime = start2 - end2;
		System.out.println(findTime + "毫秒。查找数字所花费的时间");
		System.out.println(findTime + sortTime + "毫秒。排序数字和查找数字总共花费的时间");
		sort.print(returnNumber,findNumber); 
	}

}
