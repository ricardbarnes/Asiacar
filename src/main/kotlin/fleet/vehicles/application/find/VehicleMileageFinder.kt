package fleet.vehicles.application.find

import fleet.vehicles.application.VehicleChassisNumberNotFoundException
import fleet.vehicles.application.find.dto.VehicleMileageResponse
import fleet.vehicles.domain.VehicleChassisNumber
import fleet.vehicles.domain.VehicleRepository

class VehicleMileageFinder(private val repository: VehicleRepository) {
    fun main(chassisNumber: VehicleChassisNumber): VehicleMileageResponse {
        val vehicle = repository.search(chassisNumber)
            ?: throw VehicleChassisNumberNotFoundException.throwBecauseOf(chassisNumber)

        return VehicleMileageResponse(vehicle.getCurrentMileage().getValue())
    }
}