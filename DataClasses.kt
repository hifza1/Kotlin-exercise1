
    data class Laptop(val brand: String, val ramGB: Int)

    fun Int.toLehmanGigabytes(): String {
        return "$this GB (Lehman Standard)"
    }

    fun main() {
        val laptop1 = Laptop("Apple", 16)
        val laptop2 = Laptop("Dell", 8)

        println("${laptop1.brand} Laptop RAM: ${laptop1.ramGB.toLehmanGigabytes()}")
        println("${laptop2.brand} Laptop RAM: ${laptop2.ramGB.toLehmanGigabytes()}")
    }