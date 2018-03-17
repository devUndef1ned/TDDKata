class StringCalculator {

    val separatorChar = ','

    fun add(string: String): Int {
        if (string.isEmpty()) {
            return 0
        }

        if (!string.contains(separatorChar)) {
            return string.toInt()
        } else {
            var separatorIndex = string.indexOf(separatorChar)
            var first = string.substring(0, separatorIndex).toInt()
            var second = string.substring(separatorIndex + 1).toInt()

            return first + second
        }
    }
}