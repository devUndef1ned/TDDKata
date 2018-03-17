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
    fun whenAdd_stringThatCanNotBeCastedToNumber_shouldFail() {
        var arg = "!#@"

        calculator.add(arg)
    }

    @Test
    fun whenAdd_TwoNumbers_shouldReturnTheirSum() {
        var first = getRandomInt()
        var second = getRandomInt()
        var arg = getStringFromNumbers(first, second)

        Assert.assertEquals(first + second, calculator.add(arg))
    }

    @Test(expected = IllegalArgumentException::class)
    fun whenAdd_singleNumberAndSomethingThatCanNotBeCastedToNumber_shouldFail() {
        var arg = "5,&*@3"

        calculator.add(arg)
    }

    @Test
    fun whenAdd_severalNumbers_shouldReturnTheirSum() {
        var first = getRandomInt()
        var second = getRandomInt()
        var third = getRandomInt()
        var fourth = getRandomInt()
        var args = getStringFromNumbers(first, second, third, fourth)

        Assert.assertEquals(first + second + third + fourth, calculator.add(args))
    }

    private fun getRandomInt() = random.nextInt(10000000)

    private fun getStringFromNumbers(vararg args: Int): String {
        var builder = StringBuilder()

        var iterator = args.iterator()
        builder.append(iterator.nextInt())

        while(iterator.hasNext()) {
            builder.append(",").append(iterator.nextInt())
        }

        return builder.toString()
    }

}