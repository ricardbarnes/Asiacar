package fleet.vehicles.application.find

import fleet.vehicles.application.VehicleChassisNumberNotFoundException
import fleet.vehicles.domain.VehicleChassisNumber
import fleet.vehicles.domain.VehicleRepository

class VehicleBatteryLevelFinder(private val repository: VehicleRepository) {
    fun main(chassisNumber: VehicleChassisNumber): VehicleBatteryLevelResponse {
        val vehicle = repository.search(chassisNumber)
            ?: throw VehicleChassisNumberNotFoundException.throwBecauseOf(chassisNumber)

        return VehicleBatteryLevelResponse(vehicle.getBatteryLevel().getValue())
    }
}