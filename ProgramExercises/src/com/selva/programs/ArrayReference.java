package com.selva.programs;

import java.util.Arrays;

public class ArrayReference {
    public static void main(String[] args) {
        int[] nums = {2, 4, -1, 3};
        incrementAll(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void incrementAll(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i]++;
        }
    }
}
