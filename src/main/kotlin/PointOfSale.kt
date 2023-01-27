import display.Display

class PointOfSale(val display: Display) {
    fun onBarCode(barcode: String) {
        val price = findPrice(barcode)
        display.show(price)
    }

    private fun findPrice(barcode: String): String {
        return if (barcode == "12345") {
            "11"
        } else if (barcode == "34546")
            "15"
        else ""
    }

}
