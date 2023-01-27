import display.Display
import display.Response

class FakeDisplay : Display {
    private var response: Response = Response.ProductNotFound("-1")
    override fun lastDisplayed(): Response {
        return response
    }

    override fun show(response: Response) {
        this.response = response
    }


}
