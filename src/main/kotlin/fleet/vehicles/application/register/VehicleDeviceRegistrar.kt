package fleet.vehicles.application.register

import fleet.vehicles.application.VehicleChassisNumberNotFoundException
import fleet.vehicles.domain.VehicleChassisNumber
import fleet.vehicles.domain.VehicleDeviceSerialNumber
import fleet.vehicles.domain.VehicleRepository

class VehicleDeviceRegistrar(private val vehicleRepository: VehicleRepository) {
    fun main(chassisNumber: VehicleChassisNumber, deviceNumber: VehicleDeviceSerialNumber) {
        val vehicle = vehicleRepository.search(chassisNumber)
            ?: throw VehicleChassisNumberNotFoundException.throwBecauseOf(chassisNumber)

        vehicle.updateDeviceSerialNumber(deviceNumber)
        vehicleRepository.save(vehicle)
    }
}