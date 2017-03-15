package euclidean_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EuclideanSample {

	public static void main(String[] args) throws IOException {
		System.out.println("２つの正の整数の最大公約数を求めます。");

		BufferedReader brA = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("１つ目のデータを入力してください ： ");
		int dataA = Integer.parseInt(brA.readLine());

		BufferedReader brB = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("２つ目のデータを入力してください ： ");
		int dataB= Integer.parseInt(brB.readLine());

		Integer ans = null;
		while (ans == null) {
			if (dataA > dataB) {
				dataA = dataA - dataB;
			} else if (dataA < dataB) {
				dataB = dataB - dataA;
			} else {
				ans = dataA;
			}
		}
		System.out.println("最大公約数は ： " + ans);
	}
}
