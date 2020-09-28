package com.adyanf.ctci_solution.array

object CheckPermutationSolution {
    /**
     * Assumption: Leading and trailing whitespace is not important, and it is case sensitive
     */
    fun checkPermutation(str1: String, str2: String): Boolean {
        val str1ToCheck = str1.trim()
        val str2ToCheck = str2.trim()

        if (str1ToCheck.length != str2ToCheck.length) {
            return false
        } else {
            val charCheck = hashMapOf<Char, Int>()
            str1ToCheck.forEach { c ->
                charCheck[c] = (charCheck[c] ?: 0) + 1
            }

            str2ToCheck.forEach { c ->
                if (!charCheck.containsKey(c)) {
                    return false
                } else {
                    charCheck[c] = (charCheck[c] ?: 0) - 1
                    if ((charCheck[c] ?: 0) <= 0) {
                        charCheck.remove(c)
                    }
                }
            }

            return charCheck.isEmpty()
        }
    }
}