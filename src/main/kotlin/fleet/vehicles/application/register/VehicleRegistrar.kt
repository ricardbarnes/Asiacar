package fleet.vehicles.application.register

import fleet.vehicles.domain.Vehicle
import fleet.vehicles.domain.VehicleRepository

class VehicleRegistrar(private val vehicleRepository: VehicleRepository) {
    fun main(vehicle: Vehicle) {
        vehicleRepository.save(vehicle)
    }
}