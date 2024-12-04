package edu.ivanov.codewars;

import java.util.Arrays;

public class PlusOneArray {

    public static int[] upArray(final int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        boolean changed = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 0 || arr[i] > 9) {
                return null;
            }

            if (!changed) {
                if (arr[i] == 9) {
                    arr[i] = 0;
                } else {
                    arr[i]++;
                    changed = true;
                }
            }
        }

        if (!changed) {
            int[] newArr = Arrays.copyOf(arr, arr.length + 1);
            newArr[0] = 1;
            System.arraycopy(arr, 0, newArr, 1, arr.length);
            return newArr;
        }

        return arr;
    }

}
