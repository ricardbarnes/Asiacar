package fleet.vehicles.domain

import shared.domain.valueobjects.DateValueObject
import java.util.*

class VehicleInfleetDate(override var value: Date) : DateValueObject() {
    override fun getValue(): Date {
        return this.value
    }
}