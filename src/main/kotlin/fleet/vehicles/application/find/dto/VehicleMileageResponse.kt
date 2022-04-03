package fleet.vehicles.application.find.dto

import shared.domain.bus.query.Response

class VehicleMileageResponse(private val currentMileage: Int) : Response {
    fun getCurrentMileage(): Int {
        return currentMileage
    }
}