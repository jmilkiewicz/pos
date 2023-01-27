import display.Display
import price.PriceRepository

class PointOfSale(private val display: Display, private val barCodeRepository: PriceRepository) {
    fun onBarCode(barcode: String) {
        val price = findPrice(barcode)
        display.show(price)
    }

    private fun findPrice(barcode: String): String {
        return barCodeRepository.getPriceByBarCode(barcode)!!
    }

}
