package controllers.fleet.vehicles.find

import shared.domain.bus.query.QueryBus
import shared.domain.bus.query.Response
import fleet.vehicles.application.find.dto.FindVehicleBatteryLevelQuery

class VehicleBatteryLevelFinderController(private val queryBus: QueryBus) {
    fun main(chassisNumber: String): Response? {
        return queryBus.ask(FindVehicleBatteryLevelQuery(chassisNumber))
    }
}