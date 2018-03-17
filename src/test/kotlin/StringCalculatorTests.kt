import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.util.*

class StringCalculatorTests {

    private lateinit var calculator: StringCalculator
    private var random = Random()

    @Before
    fun setUp() {
        calculator = StringCalculator()
    }

    @Test
    fun whenAdd_anEmptyString_shouldReturnZeroValue() {
        var arg = ""

        Assert.assertEquals(0, calculator.add(arg))
    }

    @Test
    fun whenAdd_singleNumber_shouldReturnTheSameValue() {
        var number = getRandomInt()
        var arg = number.toString()

        Assert.assertEquals(number, calculator.add(arg))
    }

    @Test(expected = IllegalArgumentException::class)
    fun whenAdd_stringThatCanNotBeCastedToString_shouldFail() {
        var arg = "!#@"

        calculator.add(arg)
    }

    @Test
    fun whenAdd_TwoNumbers_shouldReturnTheirSum() {
        var first = getRandomInt()
        var second = getRandomInt()
        var arg = getStringFromTwoNumbers(first, second)

        Assert.assertEquals(first + second, calculator.add(arg))
    }

    private fun getRandomInt() = random.nextInt(10000000)

    private fun getStringFromTwoNumbers(first: Int, second: Int) = StringBuilder().append(first).append(",").append(second).toString()

}