package controllers.fleet.vehicles.register

import shared.domain.bus.command.CommandBus
import fleet.vehicles.application.register.dto.RegisterVehicleCommand

class VehicleRegistrarController(private val commandBus: CommandBus) {
    fun main(
        rawId: String,
        rawChassisNumber: String,
        rawLicensePlate: String,
        rawBrand: String,
        rawCategory: String,
        rawInfleetDate: String,
    ) {
        val command = RegisterVehicleCommand(rawId, rawChassisNumber, rawLicensePlate, rawBrand, rawCategory, rawInfleetDate)

        commandBus.dispatch(command)
    }
}