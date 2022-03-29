package fleet.vehicles.domain

import shared.domain.valueobjects.StringValueObject

class VehicleDeviceSerialNumber(override val value: String) : StringValueObject() {
    override fun getValue(): String {
        return this.value
    }
}