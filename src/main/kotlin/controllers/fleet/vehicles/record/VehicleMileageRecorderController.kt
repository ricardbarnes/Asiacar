package controllers.fleet.vehicles.record

import shared.domain.bus.command.CommandBus
import fleet.vehicles.application.record.RecordVehicleMileageCommand

class VehicleMileageRecorderController(private val commandBus: CommandBus) {
    fun main(rawChassisNumber: String, rawMileage: Int) {
        val command = RecordVehicleMileageCommand(rawChassisNumber, rawMileage)

        commandBus.dispatch(command)
    }
}