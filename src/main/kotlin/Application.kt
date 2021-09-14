
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch


suspend fun main() {
    coroutineScope {
        launch {
            println(".")
        }
        print("The period is not first?     ")
    }
    val client = HttpClient(CIO)
    val response: HttpResponse = client.get("https://ktor.io/")
    println(response.call.response)
    client.close()
}