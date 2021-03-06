package fleet.vehicles.application.record.handler

import fleet.vehicles.application.record.VehicleBatteryLevelRecorder
import fleet.vehicles.application.record.dto.RecordVehicleBatteryLevelCommand
import shared.domain.bus.command.CommandHandler
import fleet.vehicles.domain.VehicleBatteryLevel
import fleet.vehicles.domain.VehicleChassisNumber

class RecordVehicleBatteryLevelCommandHandler(private val batteryLevelRecorder: VehicleBatteryLevelRecorder) :
    CommandHandler {
    fun main(command: RecordVehicleBatteryLevelCommand) {
        val chassisNumber = VehicleChassisNumber(command.getChassisNumber())
        val batteryLevel = VehicleBatteryLevel(command.getBatteryLevel())

        batteryLevelRecorder.main(chassisNumber, batteryLevel)
    }
}