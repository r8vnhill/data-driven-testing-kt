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
                    "P@ssw0rd",
                    "P@ssw0r",
                    "p@ssw0rd",
                    "P@SSW0RD",
                    "P@ssword",
                    "Password1",
                ) { password ->
                    withData(

                    ) { minLength ->

                    }
                }
            }
        }
    }
})
