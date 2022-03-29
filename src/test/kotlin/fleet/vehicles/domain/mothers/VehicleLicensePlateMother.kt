package fleet.vehicles.domain.mothers

import fleet.vehicles.domain.VehicleLicensePlate
import shared.domain.mothers.StringMother

class VehicleLicensePlateMother {
    companion object {
        fun create(value: String? = null): VehicleLicensePlate {
            return VehicleLicensePlate(value ?: StringMother.createLatinAlphanumeric())
        }
    }
}