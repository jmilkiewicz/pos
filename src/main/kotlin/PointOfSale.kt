import display.Display
import display.Response
import price.Price
import price.PriceRepository

class PointOfSale(private val display: Display, private val barCodeRepository: PriceRepository) {
    fun onBarCode(barcode: String) {
        val price = findPrice(barcode)
        val response = determineResponseToShow(price)
        display.show(response)
    }

    private fun determineResponseToShow(price: Price?): Response {
        //this is a place for formatting - is formatting special for device or a logic of application
        return price?.let { Response.Price(it.value.toString()) } ?: Response.ProductNotFound
    }

    private fun findPrice(barcode: String): Price? {
        return barCodeRepository.getPriceByBarCode(barcode)
    }

}
