package shared.domain.valueobjects

import java.util.*

open class Uuid(private val uuid: String) {
    companion object {
        fun generateRandom(): Uuid {
            return Uuid(UUID.randomUUID().toString())
        }
    }

    init {
        try {
            UUID.fromString(uuid)
        } catch (exception: IllegalArgumentException) {
            throw exception
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Uuid

        if (uuid != other.uuid) return false

        return true
    }

    override fun hashCode(): Int {
        return uuid.hashCode()
    }

    override fun toString(): String {
        return uuid
    }

    fun getValue(): String {
        return uuid
    }
}