package fleet.vehicles.application.find.dto

import shared.domain.bus.query.Query

class FindVehicleFuelLevelQuery(private val chassisNumber: String) : Query {
    fun getChassisNumber(): String {
        return chassisNumber
    }
}