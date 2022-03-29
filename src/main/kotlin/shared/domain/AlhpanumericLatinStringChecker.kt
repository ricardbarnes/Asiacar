package shared.domain

class AlhpanumericLatinStringChecker {
    companion object {
        fun isAlphanumericLatin(value: String): Boolean {
            if (value.matches(Regex("[A-Za-z0-9]*"))
            ) {
                return true
            }
            return false
        }
    }
}