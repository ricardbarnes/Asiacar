package fleet.vehicles.domain

import shared.domain.valueobjects.IntegerValueObject

class VehicleBatteryLevel(override var value: Int) : IntegerValueObject() {
    init {
        if (value < 0) {
            throw VehicleBatteryLevelIllegalArgumentException.throwBecauseOf(value)
        }
    }

    override fun getValue(): Int {
        return this.value
    }
}