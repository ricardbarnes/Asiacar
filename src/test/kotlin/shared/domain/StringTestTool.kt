package shared.domain

internal class StringTestTool {
    companion object {
        fun pickRandomCharacterFromString(string: String): Char {
            val minIdx = 0
            val maxIdx = string.length - 1
            val randomIndex = (minIdx..maxIdx).random()
            return string[randomIndex]
        }

        fun getRandomLatinCharacterNotInString(string: String): Char {
            val latinCharset = (('a'..'z') + ('A'..'Z') + ('0'..'9')).toMutableList()
            val nonPresentChars = mutableListOf<Char>()

            for (char in latinCharset) {
                if (!string.contains(char)) {
                    nonPresentChars.add(char)
                }
            }

            val minIdx = 0
            val maxIdx = nonPresentChars.size - 1
            val randIdx = (minIdx..maxIdx).random()

            return nonPresentChars[randIdx]
        }
    }
}