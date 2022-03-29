package fleet.vehicles.application

import fleet.vehicles.domain.VehicleChassisNumber

class VehicleChassisNumberNotFoundException(message: String?) : RuntimeException(message) {
    companion object {
        fun throwBecauseOf(serialNumber: VehicleChassisNumber): VehicleChassisNumberNotFoundException {
            return VehicleChassisNumberNotFoundException("Vehicle chassis serial number " + serialNumber.getValue() + " not found")
        }
    }
}