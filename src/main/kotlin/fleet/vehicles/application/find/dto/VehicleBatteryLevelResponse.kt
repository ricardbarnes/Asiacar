package fleet.vehicles.application.find.dto

import shared.domain.bus.query.Response

class VehicleBatteryLevelResponse(private val batteryLevel: Int) : Response {
    fun getBatteryLevel(): Int {
        return batteryLevel
    }
}