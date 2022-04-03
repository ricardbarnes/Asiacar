package fleet.vehicles.application.record.dto

import shared.domain.bus.command.Command

class RecordVehicleMileageCommand(
    private val chassisNumber: String,
    private val mileage: Int
) : Command {
    fun getChassisNumber(): String {
        return chassisNumber
    }

    fun getMileage(): Int {
        return mileage
    }
}