package shared.domain.valueobjects

abstract class StringValueObject {
    protected abstract val value: String
    internal abstract fun getValue(): String
}