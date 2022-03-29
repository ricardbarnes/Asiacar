package fleet.vehicles.domain

import shared.domain.DomainException

class VehicleMileageIllegalArgumentException(message: String?) : DomainException(message) {
    companion object {
        fun throwBecauseOf(value: Int): VehicleMileageIllegalArgumentException {
            return VehicleMileageIllegalArgumentException("Mileage cannot have a negative value: $value")
        }
    }
}