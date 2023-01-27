package price

interface PriceRepository {
    fun getPriceByBarCode(barcode: String): String?
}
