package fleet.vehicles.application.register.handler

import fleet.vehicles.application.register.VehicleRegistrar
import fleet.vehicles.application.register.dto.RegisterVehicleCommand
import fleet.vehicles.domain.VehicleId
import shared.domain.bus.command.CommandHandler
import fleet.vehicles.domain.*
import java.text.SimpleDateFormat

class RegisterVehicleCommandHandler(private val registrar: VehicleRegistrar) : CommandHandler {
    fun main(command: RegisterVehicleCommand) {
        val id = VehicleId(command.getId())
        val chassisNumber = VehicleChassisNumber(command.getChassisNumber())
        val licensePlate = VehicleLicensePlate(command.getLicensePlate())
        val brand = VehicleBrandString(command.getBrand())
        val category = VehicleCategoryString(command.getCategory())
        val infleetDate = VehicleInfleetDate(SimpleDateFormat("dd/MM/yyyy").parse(command.getInfleetDate()))

        registrar.main(
            Vehicle(
                id,
                chassisNumber,
                licensePlate,
                brand,
                category,
                infleetDate
            )
        )
    }
}