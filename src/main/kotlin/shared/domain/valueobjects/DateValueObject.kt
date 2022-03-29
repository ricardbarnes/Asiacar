package shared.domain.valueobjects

import java.util.*

abstract class DateValueObject {
    protected abstract val value: Date
    internal abstract fun getValue(): Date
}