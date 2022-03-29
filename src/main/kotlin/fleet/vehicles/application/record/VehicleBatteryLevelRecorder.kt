package fleet.vehicles.application.record

import fleet.vehicles.application.VehicleChassisNumberNotFoundException
import fleet.vehicles.domain.VehicleBatteryLevel
import fleet.vehicles.domain.VehicleChassisNumber
import fleet.vehicles.domain.VehicleRepository

class VehicleBatteryLevelRecorder(private val vehicleRepository: VehicleRepository) {
    fun main(chassisNumber: VehicleChassisNumber, batteryLevel: VehicleBatteryLevel) {
        val vehicle = vehicleRepository.search(chassisNumber)
            ?: throw VehicleChassisNumberNotFoundException.throwBecauseOf(chassisNumber)

        vehicle.updateBatteryLevel(batteryLevel)
        vehicleRepository.save(vehicle)
    }
}