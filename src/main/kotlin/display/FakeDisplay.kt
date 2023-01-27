package display

class FakeDisplay : Display {
    private var text = ""
    override fun lastDisplayed(): String {
        return text
    }

    override fun show(toShow: String) {
        text = toShow
    }


}
