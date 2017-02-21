package algorithm_array;

import java.util.stream.IntStream;

/**
 * 直接探索と線形探索の速度比較
 */
public class DirectLinearComparator {
	public static void main(String[] args) {
		int[] array = IntStream.rangeClosed(0, 100000000).toArray();

		long directStart = System.currentTimeMillis();
		int directAnswer = array[7777777];
		long directEnd = System.currentTimeMillis();
		System.out.println("直接探索の所要時間(ms)：" + (directEnd - directStart));

		long linearStart1 = System.currentTimeMillis();
		int linear1Answer;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 7777777) {
				linear1Answer = array[i];
				break;
			}
		}
		long linearEnd1 = System.currentTimeMillis();
		System.out.println("線形探索１の所用時間(ms)：" + (linearEnd1 - linearStart1));
	}
}
