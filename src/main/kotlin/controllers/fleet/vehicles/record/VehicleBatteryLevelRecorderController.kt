package controllers.fleet.vehicles.record

import shared.domain.bus.command.CommandBus
import fleet.vehicles.application.record.RecordVehicleBatteryLevelCommand

class VehicleBatteryLevelRecorderController(private val commandBus: CommandBus) {
    fun main(rawChassisNumber: String, batteryLevel: Int) {
        val command = RecordVehicleBatteryLevelCommand(rawChassisNumber, batteryLevel)

        commandBus.dispatch(command)
    }
}