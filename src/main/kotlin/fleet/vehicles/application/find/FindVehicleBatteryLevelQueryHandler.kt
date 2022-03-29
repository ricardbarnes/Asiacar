package fleet.vehicles.application.find

import shared.domain.bus.query.QueryHandler
import fleet.vehicles.domain.VehicleChassisNumber

class FindVehicleBatteryLevelQueryHandler(private val batteryLevelFinder: VehicleBatteryLevelFinder) : QueryHandler {
    fun main(query: FindVehicleBatteryLevelQuery): VehicleBatteryLevelResponse {
        return batteryLevelFinder.main(VehicleChassisNumber(query.getChassisNumber()));
    }
}