package fleet.vehicles.domain.mothers

import fleet.vehicles.domain.VehicleInfleetDate
import shared.domain.mothers.DateMother
import java.util.*

class VehicleInfleetDateMother {
    companion object {
        fun create(value: Date? = null): VehicleInfleetDate {
            return VehicleInfleetDate(value ?: DateMother.create())
        }
    }
}