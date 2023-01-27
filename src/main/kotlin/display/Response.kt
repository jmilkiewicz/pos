package display

sealed class Response {
    object EmptyBarCode : Response()
    data class ProductNotFound(val barCode: String) : Response()
    data class Price(val productPrice: String) : Response()
}



