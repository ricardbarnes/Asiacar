package fleet.vehicles.domain

import shared.domain.valueobjects.IntegerValueObject

class VehicleFuelLevel(override var value: Int) : IntegerValueObject() {
    init {
        if (value < 0) {
            throw VehicleFuelLevelIllegalArgumentException.throwBecauseOf(value)
        }
    }

    override fun getValue(): Int {
        return this.value
    }
}