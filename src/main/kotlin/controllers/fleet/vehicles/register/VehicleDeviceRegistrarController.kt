package controllers.fleet.vehicles.register

import shared.domain.bus.command.CommandBus
import fleet.vehicles.application.register.RegisterVehicleDeviceCommand

class VehicleDeviceRegistrarController(private val commandBus: CommandBus) {
    fun main(rawChassisNumber: String, rawDeviceNumber: String) {
        val command = RegisterVehicleDeviceCommand(rawChassisNumber, rawDeviceNumber)

        commandBus.dispatch(command)
    }
}