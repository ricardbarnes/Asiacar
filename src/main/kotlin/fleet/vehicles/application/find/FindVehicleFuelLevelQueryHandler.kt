package fleet.vehicles.application.find

import shared.domain.bus.query.QueryHandler
import fleet.vehicles.domain.VehicleChassisNumber

class FindVehicleFuelLevelQueryHandler(private val fuelLevelFinder: VehicleFuelLevelFinder) : QueryHandler{
    fun main(query: FindVehicleFuelLevelQuery): VehicleFuelLevelResponse {
        return fuelLevelFinder.main(VehicleChassisNumber(query.getChassisNumber()))
    }
}