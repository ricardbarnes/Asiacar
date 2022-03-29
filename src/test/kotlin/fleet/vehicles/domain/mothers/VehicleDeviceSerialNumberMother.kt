package fleet.vehicles.domain.mothers

import fleet.vehicles.domain.VehicleDeviceSerialNumber
import shared.domain.mothers.StringMother

class VehicleDeviceSerialNumberMother {
    companion object {
        fun create(value: String? = null): VehicleDeviceSerialNumber {
            return VehicleDeviceSerialNumber(value ?: StringMother.createLatinAlphanumeric())
        }
    }
}