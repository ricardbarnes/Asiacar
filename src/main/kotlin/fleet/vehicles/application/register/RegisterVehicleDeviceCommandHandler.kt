package fleet.vehicles.application.register

import shared.domain.bus.command.CommandHandler
import fleet.vehicles.domain.VehicleChassisNumber
import fleet.vehicles.domain.VehicleDeviceSerialNumber

class RegisterVehicleDeviceCommandHandler(private val deviceRegistrar: VehicleDeviceRegistrar) : CommandHandler {
    fun main(command: RegisterVehicleDeviceCommand) {
        val chassisNumber = VehicleChassisNumber(command.getChassisNumber())
        val deviceNumber = VehicleDeviceSerialNumber(command.getDeviceNumber())

        deviceRegistrar.main(chassisNumber, deviceNumber)
    }
}