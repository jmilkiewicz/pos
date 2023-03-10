import price.Price
import price.PriceCatalogue
import java.math.BigDecimal

class FakePriceCatalogue(private val pricesForBarcode: Map<String, BigDecimal>) : PriceCatalogue {
    override fun getPriceByBarCode(barcode: String): Price? {
        return pricesForBarcode[barcode]?.let { Price(it) }
    }


}
