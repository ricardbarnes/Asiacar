package fleet.vehicles.domain

import shared.domain.DomainException

class VehicleLicensePlateMalformedException(message: String?) : DomainException(message) {
    companion object {
        fun throwBecauseOf(value: String): VehicleLicensePlateMalformedException {
            return VehicleLicensePlateMalformedException("License plate $value must be alphanumeric")
        }
    }
}