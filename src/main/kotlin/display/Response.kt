package display


sealed class Response {
    object ProductNotFound : Response()
    data class Price(val productPrice: String) : Response()
}


