package cl.ravenhill.validator

object PhoneNumberValidator {

    fun isValidPhoneNumber(phoneNumber: String): Boolean {
        if (!phoneNumber.startsWith("+") && !phoneNumber.first().isDigit())
            return false
        // Remove all hyphens and spaces from the number
        val cleanedNumber = phoneNumber.replace("[- ]".toRegex(), "")
        // Check if the number starts with + and remove it
        val hasPlusPrefix = cleanedNumber.startsWith("+")
        val numberWithoutPlus =
            if (hasPlusPrefix) cleanedNumber.substring(1)
            else cleanedNumber
        // Ensure the number contains only digits
        if (!numberWithoutPlus.all { it.isDigit() }) return false
        // Validate the length of the number
        return numberWithoutPlus.length in 8..11
    }
}