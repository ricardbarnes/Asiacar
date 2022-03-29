package shared.domain.mothers

class IntegerMother {
    companion object {
        private const val MIN_VALUE = -1000000

        private const val MAX_VALUE = 1000000

        fun create(): Int {
            return (MIN_VALUE..MAX_VALUE).random()
        }

        fun createPositive(allowZero: Boolean = false): Int {
            if (allowZero) {
                return (0..MAX_VALUE).random()
            }

            return (1..MAX_VALUE).random()
        }

        fun createNegative(): Int {
            return (MIN_VALUE..-1).random()
        }
    }
}