package algorithm_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 線形探索と更新：データはわかっているが、要素番号はわからない
 */
public class LinearSearchForUpdate {

    public static void main(String[] args) throws IOException {
        int a[] = {5, 3, 8, 4, 9};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("更新対象データの入力 : ");
        int targetData = Integer.parseInt(br.readLine());

        System.out.print("新データの入力 ： ");
        int updateData = Integer.parseInt(br.readLine());

        for (int i = 0; i < a.length; i++) {
            if (a[i] == targetData) {
                a[i] = updateData;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("[" + i + "] => " + a[i]);
        }
    }
}
