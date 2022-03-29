package fleet.vehicles.application.record

import fleet.vehicles.application.VehicleChassisNumberNotFoundException
import fleet.vehicles.domain.VehicleChassisNumber
import fleet.vehicles.domain.VehicleMileage
import fleet.vehicles.domain.VehicleRepository

class VehicleMileageRecorder(private val vehicleRepository: VehicleRepository) {
    fun main(chassisNumber: VehicleChassisNumber, mileage: VehicleMileage) {
        val vehicle = vehicleRepository.search(chassisNumber)
            ?: throw VehicleChassisNumberNotFoundException.throwBecauseOf(chassisNumber)

        vehicle.updateCurrentMileage(mileage)
        vehicleRepository.save(vehicle)
    }
}