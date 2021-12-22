package dev.cesarcneto.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubsetsSummingZero {

    /*
     * Challenge described at - https://algodaily.com/challenges/subsets-summing-zero
     *
     * Complex solution using dynamic programing -> https://www.geeksforgeeks.org/number-of-subsets-with-zero-sum/
     * Something I need to study more about before deep diving into it.
     */

    public int[][] findSumZeroSubsets(int[] input) {
        List<List<Integer>> candidates = new ArrayList<>();
        for (int i = 0; i < input.length -1; i++) {
            int sum = input[i];

            List<Integer> response = new ArrayList<>();
            response.add(i);
            for (int j = i + 1; j < input.length; j++) {
                sum += input[j];
                if (sum == 0) {
                    response.add(j);
                    candidates.add(response);
                    break;
                }
            }
        }

        return candidates.stream()
                .map(list -> list.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
    }

}
