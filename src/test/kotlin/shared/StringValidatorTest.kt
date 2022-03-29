package shared

import org.junit.jupiter.api.Test
import shared.domain.AlhpanumericLatinStringChecker
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class StringValidatorTest {
    @Test
    fun is_alphanumeric_method_should_return_true_for_a_latin_alphanumeric_string() {
        val string = "Alphanumeric123"
        val evaluationResult = AlhpanumericLatinStringChecker.isAlphanumericLatin(string)

        assertTrue(evaluationResult)
    }

    @Test
    fun is_alphanumeric_method_should_return_false_for_a_non_latin_alphanumeric_string() {
        val string = "!@#$%"
        val evaluationResult = AlhpanumericLatinStringChecker.isAlphanumericLatin(string)

        assertFalse(evaluationResult)
    }
}