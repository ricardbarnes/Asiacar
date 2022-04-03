package fleet.vehicles.application.record.dto

import shared.domain.bus.command.Command

class RecordVehicleFuelLevelVariationCommand(
    private val chassisNumber: String,
    private val fuelLevel: Int,
    private val isIncrement: Boolean
) : Command {
    fun getChassisNumber(): String {
        return chassisNumber;
    }

    fun getFuelLevel(): Int {
        return fuelLevel
    }

    fun isIncrement(): Boolean {
        return isIncrement
    }
}