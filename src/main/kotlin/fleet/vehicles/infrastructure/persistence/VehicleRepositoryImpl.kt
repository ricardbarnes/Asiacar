package fleet.vehicles.infrastructure.persistence

import fleet.vehicles.domain.Vehicle
import fleet.vehicles.domain.VehicleChassisNumber
import fleet.vehicles.domain.VehicleRepository

class VehicleRepositoryImpl : VehicleRepository {
    override fun search(chassisNumber: VehicleChassisNumber): Vehicle? {
        TODO("Not yet implemented")
    }

    override fun save(vehicle: Vehicle) {
        TODO("Not yet implemented")
    }

    override fun delete(vehicle: Vehicle) {
        TODO("Not yet implemented")
    }
}