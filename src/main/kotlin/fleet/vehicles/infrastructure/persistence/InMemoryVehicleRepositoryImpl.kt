package fleet.vehicles.infrastructure.persistence

import fleet.vehicles.domain.Vehicle
import fleet.vehicles.domain.VehicleChassisNumber
import fleet.vehicles.domain.VehicleRepository
import org.springframework.stereotype.Repository

@Repository
class InMemoryVehicleRepositoryImpl : VehicleRepository {

    companion object {
        val vehicles: MutableList<Vehicle> = mutableListOf()
    }

    override fun search(chassisNumber: VehicleChassisNumber): Vehicle? {
        return vehicles.firstOrNull { it.getChassisNumber() == chassisNumber }
    }

    override fun save(vehicle: Vehicle) {
        vehicles.add(vehicle)
    }

    override fun delete(vehicle: Vehicle) {
        vehicles.remove(vehicle)
    }
}