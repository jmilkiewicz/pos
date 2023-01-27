import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import price.PriceRepository

class APriceIsDisplayed {

//    "12345" -> 11
//    "34546" -> 15
//    "21342" -> 17

    private val barCodeRepository: PriceRepository = FakePriceRepository(mapOf("12345" to "11", "34546" to "15"))
    @Test
    internal fun showsValidPriceForValidBarcode() {
        val display = FakeDisplay()

        PointOfSale(display, barCodeRepository ).onBarCode("12345")

        assertThat(display.lastDisplayed(), equalTo("11"))
    }

    @Test
    internal fun showsValidPriceForValidBarcode2() {
        val display = FakeDisplay()
        PointOfSale(display, barCodeRepository).onBarCode("34546")

        assertThat(display.lastDisplayed(), equalTo("15"))
    }
}