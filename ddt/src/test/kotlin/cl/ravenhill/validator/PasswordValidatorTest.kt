package cl.ravenhill.validator

import cl.ravenhill.validator.PasswordValidator.isValid
import io.kotest.core.spec.style.FreeSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class PasswordValidatorTest : FreeSpec({
    "Given a password" - {
        "when validating it" - {
            "then it should return true if it is strong and false if it is weak" - {
                withData(
                    "P@ssw0rd" to true,
                    "P@ssw0r" to false,
                    "p@ssw0rd" to false,
                    "P@SSW0RD" to false,
                    "P@ssword" to false,
                    "Password1" to false
                ) { (password, expected) ->
                    isValid(password) shouldBe expected
                }
            }
        }
    }
})
