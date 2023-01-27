package display

interface Display {
    fun lastDisplayed(): Response
    fun show(response: Response)
}
