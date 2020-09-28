package com.adyanf.ctci_solution.array

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class IsUniqueSolutionTest {

    @Test
    fun `isUniqueSmallLetterAZ test 1`() {
        val isUnique = IsUniqueSolution.isUniqueSmallLetterAZ("abbbbbb")

        assertEquals(false, isUnique)
    }

    @Test
    fun `isUniqueSmallLetterAZ test 2`() {
        val isUnique = IsUniqueSolution.isUniqueSmallLetterAZ("abcdefghijklmn")

        assertEquals(true, isUnique)
    }
}