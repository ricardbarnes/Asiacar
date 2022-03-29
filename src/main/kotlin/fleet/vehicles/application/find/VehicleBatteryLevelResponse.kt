package fleet.vehicles.application.find

import shared.domain.bus.query.Response

class VehicleBatteryLevelResponse(private val batteryLevel: Int) : Response {
    fun getBatteryLevel(): Int {
        return batteryLevel
    }
}