import display.Display
import display.Response
import price.Price
import price.PriceCatalogue

class PointOfSale(private val display: Display, private val priceCatalogue: PriceCatalogue) {
    fun onBarCode(barcode: String) {
        val price = findPrice(barcode)
        val response = determineResponseToShow(price, barcode)
        display.show(response)
    }

    private fun determineResponseToShow(price: Price?, barcode: String): Response {
        //this is a place for formatting - is formatting special for device or a logic of application
        return price?.let { Response.Price(it.value.toString()) } ?: Response.ProductNotFound(barcode)
    }

    private fun findPrice(barcode: String): Price? {
        return priceCatalogue.getPriceByBarCode(barcode)
    }

}
