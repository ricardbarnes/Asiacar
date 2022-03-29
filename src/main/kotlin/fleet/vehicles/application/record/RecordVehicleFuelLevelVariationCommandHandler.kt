package fleet.vehicles.application.record

import shared.domain.bus.command.CommandHandler
import fleet.vehicles.domain.VehicleChassisNumber
import fleet.vehicles.domain.VehicleFuelLevel

class RecordVehicleFuelLevelVariationCommandHandler(
    private val fuelLevelVariationRecorder: VehicleFuelLevelVariationRecorder
) : CommandHandler {
    fun main(command: RecordVehicleFuelLevelVariationCommand) {
        val chassisNumber = VehicleChassisNumber(command.getChassisNumber())
        val fuelLevel = VehicleFuelLevel(command.getFuelLevel())

        fuelLevelVariationRecorder.main(chassisNumber, fuelLevel, command.isIncrement())
    }
}