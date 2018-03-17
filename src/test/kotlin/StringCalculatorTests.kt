import org.junit.Assert
import org.junit.Before
import org.junit.Test

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
}