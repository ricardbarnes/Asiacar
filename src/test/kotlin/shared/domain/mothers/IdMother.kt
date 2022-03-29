package shared.domain.mothers

import java.util.*

class IdMother {
    companion object {
        fun create(): String {
            return UUID.randomUUID().toString()
        }
    }
}