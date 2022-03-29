package fleet.vehicles.domain.mothers

import fleet.vehicles.domain.VehicleCategoryString
import shared.domain.mothers.StringMother

class VehicleCategoryStringMother {
    companion object {
        fun create(value: String? = null): VehicleCategoryString {
            return VehicleCategoryString(value ?: StringMother.createAcrissCode())
        }
    }
}