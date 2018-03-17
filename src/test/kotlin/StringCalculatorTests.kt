import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.util.*

class StringCalculatorTests {

    private lateinit var calculator: StringCalculator

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
        var number = Random().nextInt()
        var arg = number.toString()

        Assert.assertEquals(number, calculator.add(arg))
    }

    @Test(expected = IllegalArgumentException::class)
    fun whenAdd_stringThatCanNotBeCastedToString_shouldFail() {
        var arg = "!#@"

        calculator.add(arg)
    }
}