package fleet.vehicles.application.record

import fleet.vehicles.application.VehicleChassisNumberNotFoundException
import fleet.vehicles.domain.VehicleChassisNumber
import fleet.vehicles.domain.VehicleFuelLevel
import fleet.vehicles.domain.VehicleRepository

class VehicleFuelLevelVariationRecorder(private val vehicleRepository: VehicleRepository) {
    fun main(chassisNumber: VehicleChassisNumber, fuelLevel: VehicleFuelLevel, isIncrement: Boolean) {
        val vehicle = vehicleRepository.search(chassisNumber)
            ?: throw VehicleChassisNumberNotFoundException.throwBecauseOf(chassisNumber)

        if (isIncrement) {
            vehicle.incrementFuelLevelBy(fuelLevel)
        } else {
            vehicle.decrementFuelLevelBy(fuelLevel)
        }

        vehicleRepository.save(vehicle)
    }
}