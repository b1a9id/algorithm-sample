package algorithm_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 挿入する要素番号がわからないとき
 */
public class LinearSearchForInsert {

    public static void main(String[] args) throws IOException {
        int[] sampleArray = {5, 3, 8, 4, 9, -999};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("挿入したいデータ ： ");
        int insertData = Integer.parseInt(br.readLine());

        System.out.print("挿入位置のデータ ： ");
        int insertedData = Integer.parseInt(br.readLine());

        Integer insertElementNum = null;
        for (int i = 0; i < sampleArray.length; i++) {
            if (sampleArray[i] == insertedData) {
                insertElementNum = i;
                break;
            }
        }

        for (int i = sampleArray.length - 1; i >= insertElementNum; i--) {
            if (i == 0 || i == insertElementNum) {
                sampleArray[i] = insertData;
            } else {
                sampleArray[i] = sampleArray[i - 1];
            }
        }

        for (int i = 0; i < sampleArray.length; i++) {
            System.out.println("[" + i + "] => " + sampleArray[i]);
        }
    }
}
