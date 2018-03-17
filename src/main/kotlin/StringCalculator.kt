class StringCalculator {

    val firstSeparator = ","
    val secondSeparator = "\n"


    fun add(string: String): Int {
        if (string.isEmpty()) {
            return 0
        }

        var numbers = string.split(firstSeparator, secondSeparator)
        var sum = 0
        for (number in numbers) {
            sum += number.toInt()
        }

        return sum
    }
}