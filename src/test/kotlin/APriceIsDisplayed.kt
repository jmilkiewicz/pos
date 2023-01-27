import display.Response
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import price.PriceCatalogue
import java.math.BigDecimal

class APriceIsDisplayed {

//    "12345" -> 11
//    "34546" -> 15
//    "21342" -> 17

    private val barCodeRepository: PriceCatalogue =
        FakePriceCatalogue(mapOf("12345" to BigDecimal("11"), "34546" to BigDecimal("15")))

    @Test
    internal fun showsValidPriceForValidBarcode() {
        val display = FakeDisplay()

        PointOfSale(display, barCodeRepository).onBarCode("12345")

        assertThat(display.lastDisplayed(), equalTo(Response.Price("11")))
    }

    @Test
    internal fun showsValidPriceForValidBarcode2() {
        val display = FakeDisplay()
        PointOfSale(display, barCodeRepository).onBarCode("34546")

        assertThat(display.lastDisplayed(), equalTo(Response.Price("15")))
    }

    @Test
    internal fun showsProductNotFoundWhenNotMatch() {
        val display = FakeDisplay()
        PointOfSale(display, barCodeRepository).onBarCode("-12")

        assertThat(display.lastDisplayed(), equalTo(Response.ProductNotFound("-12")))
    }

}