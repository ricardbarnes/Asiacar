package fleet.vehicles.domain

import shared.domain.DomainException

class VehicleChassisNumberMalformedException(message: String?) : DomainException(message) {
    companion object {
        fun throwBecauseOf(value: String): VehicleChassisNumberMalformedException {
            return VehicleChassisNumberMalformedException("Chassis number $value must have 17 alphanumeric characters")
        }
    }
}