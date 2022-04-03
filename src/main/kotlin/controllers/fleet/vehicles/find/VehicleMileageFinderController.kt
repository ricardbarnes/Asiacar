package controllers.fleet.vehicles.find

import shared.domain.bus.query.QueryBus
import shared.domain.bus.query.Response
import fleet.vehicles.application.find.dto.FindVehicleMileageQuery

class VehicleMileageFinderController(private val queryBus: QueryBus) {
    fun main(chassisNumber: String): Response? {
        return queryBus.ask(FindVehicleMileageQuery(chassisNumber))
    }
}