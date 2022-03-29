package fleet.vehicles.domain

import shared.domain.DomainException

class VehicleBatteryLevelIllegalArgumentException(message: String?) : DomainException(message) {
    companion object {
        fun throwBecauseOf(value: Int): VehicleBatteryLevelIllegalArgumentException {
            return VehicleBatteryLevelIllegalArgumentException("Battery level cannot have a negative value: $value")
        }
    }
}