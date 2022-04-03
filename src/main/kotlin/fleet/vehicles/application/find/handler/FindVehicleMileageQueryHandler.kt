package fleet.vehicles.application.find.handler

import fleet.vehicles.application.find.VehicleMileageFinder
import fleet.vehicles.application.find.dto.FindVehicleMileageQuery
import fleet.vehicles.application.find.dto.VehicleMileageResponse
import shared.domain.bus.query.QueryHandler
import fleet.vehicles.domain.VehicleChassisNumber

class FindVehicleMileageQueryHandler(private val mileageFinder: VehicleMileageFinder) : QueryHandler {
    fun main(query: FindVehicleMileageQuery): VehicleMileageResponse {
        return mileageFinder.main(VehicleChassisNumber(query.getChassisNumber()))
    }
}