package fleet.vehicles.application.register

import shared.domain.bus.command.Command

class RegisterVehicleDeviceCommand(
    private val chassisNumber: String,
    private val deviceNumber: String
) : Command {
    fun getChassisNumber(): String {
        return chassisNumber
    }

    fun getDeviceNumber(): String {
        return deviceNumber
    }
}