package fleet.vehicles.domain.mothers

import fleet.vehicles.domain.VehicleId
import shared.domain.mothers.IdMother

class VehicleIdMother {
    companion object {
        fun create(value: String? = null): VehicleId {
            return VehicleId(value ?: IdMother.create())
        }
    }
}