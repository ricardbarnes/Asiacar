package fleet.vehicles.application.record.dto

import shared.domain.bus.command.Command

class RecordVehicleBatteryLevelCommand(
    private val chassisNumber: String,
    private val batteryLevel: Int
) : Command {
    fun getChassisNumber(): String {
        return chassisNumber;
    }

    fun getBatteryLevel(): Int {
        return batteryLevel;
    }
}