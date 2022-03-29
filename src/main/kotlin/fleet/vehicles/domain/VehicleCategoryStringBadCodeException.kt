package fleet.vehicles.domain

import shared.domain.DomainException

class VehicleCategoryStringBadCodeException(message: String?) : DomainException(message) {
    companion object {
        fun throwBecauseOf(value: String): VehicleCategoryStringBadCodeException {
            return VehicleCategoryStringBadCodeException("Category string $value does not comply with the ACRISS code")
        }
    }
}