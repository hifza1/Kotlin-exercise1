    sealed class EnrollmentStatus

    data class Success(val courseCode: String) : EnrollmentStatus()
    data class Error(val message: String) : EnrollmentStatus()
    object Loading : EnrollmentStatus()


    fun printStatus(status: EnrollmentStatus) {
        when (status) {
            is Success -> println("Enrollment successful for course: ${status.courseCode}")
            is Error -> println("Enrollment failed: ${status.message}")
            Loading -> println("Enrollment is loading...")
        }
    }

    fun main() {
        val successStatus = Success("CS101")
        val errorStatus = Error("Course is full")

        printStatus(successStatus)
        printStatus(errorStatus)
    }
