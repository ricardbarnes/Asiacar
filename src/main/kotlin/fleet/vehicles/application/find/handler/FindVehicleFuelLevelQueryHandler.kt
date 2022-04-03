package fleet.vehicles.application.find.handler

import fleet.vehicles.application.find.VehicleFuelLevelFinder
import fleet.vehicles.application.find.dto.FindVehicleFuelLevelQuery
import fleet.vehicles.application.find.dto.VehicleFuelLevelResponse
import shared.domain.bus.query.QueryHandler
import fleet.vehicles.domain.VehicleChassisNumber

class FindVehicleFuelLevelQueryHandler(private val fuelLevelFinder: VehicleFuelLevelFinder) : QueryHandler{
    fun main(query: FindVehicleFuelLevelQuery): VehicleFuelLevelResponse {
        return fuelLevelFinder.main(VehicleChassisNumber(query.getChassisNumber()))
    }
}