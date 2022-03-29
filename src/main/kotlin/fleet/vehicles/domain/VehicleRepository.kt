package fleet.vehicles.domain

interface VehicleRepository {
    fun search(chassisNumber: VehicleChassisNumber): Vehicle?

    fun save(vehicle: Vehicle)

    fun delete(vehicle: Vehicle)
}