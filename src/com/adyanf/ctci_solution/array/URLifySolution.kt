package com.adyanf.ctci_solution.array

object URLifySolution {
    fun urlify(str: CharArray, size: Int): CharArray {
        var i = 0
        var j = 0

        while (i < size) {
            if (str[i] == ' ') {
                j += 3
            } else {
                j += 1
            }
            i += 1
        }

        i--
        j--

        while (j >= 0) {
            if (str[i] == ' ') {
                str[j] = '0'
                str[j-1] = '2'
                str[j-2] = '%'
                j -= 3
            } else {
                str[j] = str[i]
                j -= 1
            }
            i--
        }

        return str
    }
}