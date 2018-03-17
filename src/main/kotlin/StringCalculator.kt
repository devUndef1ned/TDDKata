class StringCalculator {

    val separatorChar = ','

    fun add(string: String): Int {
        if (string.isEmpty()) {
            return 0
        }

        if (!string.contains(separatorChar)) {
            return string.toInt()
        } else {
            var numbers = string.split(separatorChar)
            var sum = 0
            for (number in numbers) {
                sum += number.toInt()
            }

            return sum
        }
    }
}