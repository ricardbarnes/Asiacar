package fleet.vehicles.domain.mothers

import fleet.vehicles.domain.VehicleChassisNumber
import shared.domain.mothers.StringMother

class VehicleChassisNumberMother {
    companion object {
        fun create(value: String? = null): VehicleChassisNumber {
            return VehicleChassisNumber(value ?: StringMother.createLatinAlphanumeric(17));
        }
    }
}