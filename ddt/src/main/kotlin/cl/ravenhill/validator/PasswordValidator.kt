package cl.ravenhill.validator

object PasswordValidator {

    private const val SPECIAL_CHARACTERS = "!@#$%^&*()-+"

    @Suppress("LongParameterList")
    fun isValid(
        password: String,
        minLength: Int = 8,
        requireDigit: Boolean = true,
        requireLowerCase: Boolean = true,
        requireUpperCase: Boolean = true,
        requireSpecialChar: Boolean = true
    ) = password.length >= minLength &&
        (!requireDigit || password.any { it.isDigit() }) &&
        (!requireLowerCase || password.any { it.isLowerCase() }) &&
        (!requireUpperCase || password.any { it.isUpperCase() }) &&
        (!requireSpecialChar || password.any { it in SPECIAL_CHARACTERS })
}
