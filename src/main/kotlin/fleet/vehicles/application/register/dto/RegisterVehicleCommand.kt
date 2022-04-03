package fleet.vehicles.application.register.dto

import shared.domain.bus.command.Command

class RegisterVehicleCommand(
    private val id: String,
    private val chassisNumber: String,
    private val licensePlate: String,
    private val brand: String,
    private val category: String,
    private val infleetDate: String
) : Command {
    fun getId(): String {
        return id
    }

    fun getChassisNumber(): String {
        return chassisNumber
    }

    fun getLicensePlate(): String {
        return licensePlate
    }

    fun getBrand(): String {
        return brand
    }

    fun getCategory(): String {
        return category
    }

    fun getInfleetDate(): String {
        return infleetDate
    }
}