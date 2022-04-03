package controllers.fleet.vehicles.record

import shared.domain.bus.command.CommandBus
import fleet.vehicles.application.record.dto.RecordVehicleFuelLevelVariationCommand

class VehicleFuelLevelVarianceRecorderController(private val commandBus: CommandBus) {
    fun main(rawChassisNumber: String, fuelLevel: Int, isIncrement: Boolean) {
        val command = RecordVehicleFuelLevelVariationCommand(rawChassisNumber, fuelLevel, isIncrement)

        commandBus.dispatch(command)
    }
}