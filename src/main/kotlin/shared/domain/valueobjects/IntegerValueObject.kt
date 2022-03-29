package shared.domain.valueobjects

abstract class IntegerValueObject {
    protected abstract val value: Int
    internal abstract fun getValue(): Int
}