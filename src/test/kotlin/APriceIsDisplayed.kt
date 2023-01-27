import display.FakeDisplay
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class APriceIsDisplayed {

    @Test
    internal fun showsValidPriceForValidBarcode() {
        val display = FakeDisplay()
        PointOfSale(display).onBarCode("12345")

        assertThat(display.lastDisplayed(), equalTo("11"))
    }

//    @Test
//    internal fun showsValidPriceForValidBarcode2() {
//        val display = FakeDisplay()
//        PointOfSale(display).onBarCode("31231")
//
//        assertThat(display.lastDisplayed(), equalTo("15"))
//    }
}