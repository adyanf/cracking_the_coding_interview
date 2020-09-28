package com.adyanf.ctci_solution.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CheckPermutationSolutionTest {

    @Test
    fun `checkPermutation test case 1`() {
        val isPermutation = CheckPermutationSolution.checkPermutation("god     ", "dog ")

        assertEquals(true, isPermutation)
    }

    @Test
    fun `checkPermutation test case 2`() {
        val isPermutation = CheckPermutationSolution.checkPermutation("gods", "dogk")

        assertEquals(false, isPermutation)
    }
}