package fleet.vehicles.application.find

import shared.domain.bus.query.Response

class VehicleFuelLevelResponse(private val fuelLevel: Int) : Response {
    fun getFuelLevel(): Int {
        return fuelLevel
    }
}