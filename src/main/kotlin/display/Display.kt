package display

interface Display {
    fun lastDisplayed(): String
    fun show(barcode: String)
}
