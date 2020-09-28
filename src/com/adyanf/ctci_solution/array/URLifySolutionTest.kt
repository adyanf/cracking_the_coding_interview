package com.adyanf.ctci_solution.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class URLifySolutionTest {

    @Test
    fun `urlify test case 1`() {
        val result = URLifySolution.urlify("Mr John Smith    ".toCharArray(), 13)

        assertEquals("Mr%20John%20Smith", result.joinToString(""))
    }
}