package fleet.vehicles.domain.mothers

import fleet.vehicles.domain.VehicleBatteryLevel
import shared.domain.mothers.IntegerMother

class VehicleBatteryLevelMother() {
    companion object {
        fun create(value: Int? = null): VehicleBatteryLevel {
            return VehicleBatteryLevel(value ?: IntegerMother.createPositive(true));
        }
    }
}