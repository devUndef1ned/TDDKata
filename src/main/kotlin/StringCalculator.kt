class StringCalculator {

    val separatorRegex = ","


    fun add(string: String): Int {
        if (string.isEmpty()) {
            return 0
        }

        var numbers = string.split(separatorRegex)
        var sum = 0
        for (number in numbers) {
            sum += number.toInt()
        }

        return sum
    }
}