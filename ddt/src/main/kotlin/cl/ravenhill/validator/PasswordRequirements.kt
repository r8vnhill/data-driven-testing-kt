package cl.ravenhill.validator

class PasswordRequirements(
    val minLength: Int,
    val requireDigit: Boolean,
    val requireLowerCase: Boolean,
    val requireUpperCase: Boolean,
    val requireSpecialChar: Boolean
)
