package fleet.vehicles.application.record

import shared.domain.bus.command.CommandHandler
import fleet.vehicles.domain.VehicleChassisNumber
import fleet.vehicles.domain.VehicleMileage

class RecordVehicleMileageCommandHandler(private val mileageRecorder: VehicleMileageRecorder) : CommandHandler {
    fun main(command: RecordVehicleMileageCommand) {
        val chassisNumber = VehicleChassisNumber(command.getChassisNumber())
        val mileage = VehicleMileage(command.getMileage())

        mileageRecorder.main(chassisNumber, mileage)
    }
}