package cl.ravenhill.validator

import cl.ravenhill.validator.PasswordValidator.isValid
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue

class PasswordValidatorTest : FreeSpec(
    {
        "Given a password" - {
            "when validating it" - {
                "then it should return true for a strong password" {}
                "then it should return false for a weak password" - {
                    "if it has less than 8 characters" {}
                    "if it has no uppercase letter" {}
                    "if it has no lowercase letter" {}
                    "if it has no digits" {}
                    "if it has no special characters" {}
                }
            }
        }

    })
