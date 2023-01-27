import price.PriceRepository

class FakePriceRepository(private val pricesForBarcode: Map<String, String>) : PriceRepository {
    override fun getPriceByBarCode(barcode: String): String? {
        return pricesForBarcode[barcode]
    }


}
