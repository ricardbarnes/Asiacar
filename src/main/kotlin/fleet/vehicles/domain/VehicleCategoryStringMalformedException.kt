package fleet.vehicles.domain

import shared.domain.DomainException

class VehicleCategoryStringMalformedException(message: String?) : DomainException(message) {
    companion object {
        fun throwBecauseOf(value: String): VehicleCategoryStringMalformedException {
            return VehicleCategoryStringMalformedException("Category string $value is malformed")
        }
    }
}