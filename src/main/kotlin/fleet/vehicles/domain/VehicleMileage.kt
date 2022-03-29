package fleet.vehicles.domain

import shared.domain.valueobjects.IntegerValueObject

class VehicleMileage(override var value: Int) : IntegerValueObject() {
    init {
        if (value < 0) {
            throw VehicleMileageIllegalArgumentException.throwBecauseOf(value)
        }
    }

    override fun getValue(): Int {
        return this.value
    }
}