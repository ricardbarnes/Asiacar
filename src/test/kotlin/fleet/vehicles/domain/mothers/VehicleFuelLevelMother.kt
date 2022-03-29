package fleet.vehicles.domain.mothers

import fleet.vehicles.domain.VehicleFuelLevel
import shared.domain.mothers.IntegerMother

class VehicleFuelLevelMother {
    companion object {
        fun create(value: Int? = null): VehicleFuelLevel {
            return VehicleFuelLevel(value ?: IntegerMother.createPositive(true));
        }
    }
}