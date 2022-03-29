package fleet.vehicles.domain

import shared.domain.DomainException

class VehicleFuelLevelIllegalArgumentException(message: String?) : DomainException(message) {
    companion object {
        fun throwBecauseOf(value: Int): VehicleFuelLevelIllegalArgumentException {
            return VehicleFuelLevelIllegalArgumentException("Fuel level cannot have a negative value: $value")
        }
    }
}