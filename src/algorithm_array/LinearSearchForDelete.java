package algorithm_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 線形探索と削除：データの要素番号がわからないとき
 */
public class LinearSearchForDelete {

    public static void main(String[] args) throws IOException {
        int[] sampleArray = {5, 3, 8, 4, 9};

        System.out.print("削除データの入力 ： ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int deleteData = Integer.parseInt(br.readLine());

        Integer deleteElementNum = null;
        for (int i = 0; i < sampleArray.length; i++) {
            if (sampleArray[i] == deleteData) {
                deleteElementNum = i;
                break;
            }
        }

        if (deleteElementNum != sampleArray.length - 1) {
           for (int i = deleteElementNum; i < sampleArray.length; i++) {
               if (i != sampleArray.length - 1) {
                   sampleArray[i] = sampleArray[i + 1];
               } else {
                   sampleArray[i] = -999;
               }
           }
        } else {
            sampleArray[deleteElementNum] = -999;
        }

        for (int i = 0; i < sampleArray.length; i++) {
            System.out.println("[" + i + "] => " + sampleArray[i]);
        }
    }
}
