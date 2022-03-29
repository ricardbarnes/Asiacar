package fleet.vehicles.application.find

import fleet.vehicles.application.VehicleChassisNumberNotFoundException
import fleet.vehicles.domain.VehicleChassisNumber
import fleet.vehicles.domain.VehicleRepository

class VehicleFuelLevelFinder(private val repository: VehicleRepository) {
    fun main(chassisNumber: VehicleChassisNumber): VehicleFuelLevelResponse {
        val vehicle = repository.search(chassisNumber)
            ?: throw VehicleChassisNumberNotFoundException.throwBecauseOf(chassisNumber)

        return VehicleFuelLevelResponse(vehicle.getFuelLevel().getValue())
    }
}