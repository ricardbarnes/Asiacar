package fleet.vehicles.application.find.handler

import fleet.vehicles.application.find.VehicleBatteryLevelFinder
import fleet.vehicles.application.find.dto.FindVehicleBatteryLevelQuery
import fleet.vehicles.application.find.dto.VehicleBatteryLevelResponse
import shared.domain.bus.query.QueryHandler
import fleet.vehicles.domain.VehicleChassisNumber

class FindVehicleBatteryLevelQueryHandler(private val batteryLevelFinder: VehicleBatteryLevelFinder) : QueryHandler {
    fun main(query: FindVehicleBatteryLevelQuery): VehicleBatteryLevelResponse {
        return batteryLevelFinder.main(VehicleChassisNumber(query.getChassisNumber()))
    }
}