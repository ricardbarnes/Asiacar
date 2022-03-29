package fleet.vehicles.domain.mothers

import fleet.vehicles.domain.VehicleMileage
import shared.domain.mothers.IntegerMother

class VehicleCurrentMilleageMother {
    companion object {
        fun create(value: Int? = null): VehicleMileage {
            return VehicleMileage(value ?: IntegerMother.createPositive(true))
        }
    }
}