package sieve_of_eratosthenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * エラトステネスのふるい
 */
public class EratosthenesSample {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("素数かどうか判定したい数を入力してください。");
		int target = Integer.parseInt(br.readLine());

		boolean isPrime = false;
		if (target > 2) {
			for (int i = 2; i < target; i++) {
				if ((target % i) != target) {
					isPrime = true;
					break;
				}
			}
		}
		String ans = target + "は、素数";
		if (isPrime) {
			System.out.println(ans + "です。");
		} else {
			System.out.println(ans + "ではありません。");
		}
	}
}
