package controllers.fleet.vehicles.find

import shared.domain.bus.query.QueryBus
import shared.domain.bus.query.Response
import fleet.vehicles.application.find.dto.FindVehicleFuelLevelQuery

class VehicleFuelLevelFinderController(private val queryBus: QueryBus) {
    fun main(chassisNumber: String): Response? {
        return queryBus.ask(FindVehicleFuelLevelQuery(chassisNumber))
    }
}