package fleet.vehicles.application.find

import shared.domain.bus.query.QueryHandler
import fleet.vehicles.domain.VehicleChassisNumber

class FindVehicleMileageQueryHandler(private val mileageFinder: VehicleMileageFinder) : QueryHandler {
    fun main(query: FindVehicleMileageQuery): VehicleMileageResponse {
        return mileageFinder.main(VehicleChassisNumber(query.getChassisNumber()))
    }
}