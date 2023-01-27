import price.Price
import price.PriceRepository
import java.math.BigDecimal

class FakePriceRepository(private val pricesForBarcode: Map<String, String>) : PriceRepository {
    override fun getPriceByBarCode(barcode: String): Price? {
        return pricesForBarcode[barcode]?.let { Price(BigDecimal(it)) }
    }


}
