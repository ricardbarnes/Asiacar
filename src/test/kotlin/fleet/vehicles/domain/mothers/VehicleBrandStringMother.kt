package fleet.vehicles.domain.mothers

import fleet.vehicles.domain.VehicleBrandString
import shared.domain.mothers.StringMother

class VehicleBrandStringMother {
    companion object {
        fun create(value: String? = null): VehicleBrandString {
            return VehicleBrandString(value ?: StringMother.createLatinAlphanumeric());
        }
    }
}