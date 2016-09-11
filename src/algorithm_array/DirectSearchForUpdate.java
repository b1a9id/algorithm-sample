package algorithm_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  直接探索と更新：データの要素番号がわかっている
 */
public class DirectSearchForUpdate {

    public static void main(String[] args) throws IOException {
        int[] sampleArray = {5, 3, 8, 4, 9};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("新しいデータの入力 : ");
        int updateData = Integer.parseInt(br.readLine());

        System.out.print("新しいデータの要素番号を入力 : ");
        int elementNum = Integer.parseInt(br.readLine());

        sampleArray[elementNum] = updateData;
        for (int i = 0; i < sampleArray.length; i++) {
            System.out.println("[" + i + "] => " + sampleArray[i]);
        }
    }
}
