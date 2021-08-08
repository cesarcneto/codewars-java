package dev.cesarcneto.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsSummingZeroTest {

    private final SubsetsSummingZero underTest = new SubsetsSummingZero();

    @Test
    void testSubsetsSummingZero() {
        int[][] actual = underTest.findSumZeroSubsets(new int[]{3, 5, -2, -4, 7, -1, 6, 8, -8, 4});

        assertArrayEquals(new int[][]{{2, 5}, {7, 8}}, actual);

        assertArrayEquals(new int[][]{{0, 2}, {2, 4}},
                underTest.findSumZeroSubsets(new int[]{4, -5, 1, -3, 2, -8, 5, -2, 9}));
    }

}