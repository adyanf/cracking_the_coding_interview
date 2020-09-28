package com.adyanf.ctci_solution.array

object IsUniqueSolution {
    /**
     * Assumption: string only consist of small letter (a-z)
     */
    fun isUniqueSmallLetterAZ(string: String): Boolean {
        var check = 0

        for (c in string) {
            val value = c - 'a'
            if ((check and (1 shl value)) != 0) {
                return false
            } else {
                check = check or (1 shl value)
            }
        }

        return true
    }
}