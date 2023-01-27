package price

interface PriceCatalogue {
    fun getPriceByBarCode(barcode: String): Price?
}
