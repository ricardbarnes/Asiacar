package fleet.vehicles.domain.mothers

import fleet.vehicles.domain.*

class VehicleMother {
    companion object {
        fun create(
            id: VehicleId? = null,
            chassisNumber: VehicleChassisNumber? = null,
            licensePlate: VehicleLicensePlate? = null,
            brandString: VehicleBrandString? = null,
            categoryString: VehicleCategoryString? = null,
            infleetDate: VehicleInfleetDate? = null,
            deviceSerialNumber: VehicleDeviceSerialNumber? = null,
            batteryLevel: VehicleBatteryLevel? = null,
            fuelLevel: VehicleFuelLevel? = null,
            currentMilleage: VehicleMileage? = null
        ): Vehicle {
            return Vehicle(
                id ?: VehicleIdMother.create(),
                chassisNumber ?: VehicleChassisNumberMother.create(),
                licensePlate ?: VehicleLicensePlateMother.create(),
                brandString ?: VehicleBrandStringMother.create(),
                categoryString ?: VehicleCategoryStringMother.create(),
                infleetDate ?: VehicleInfleetDateMother.create(),
                deviceSerialNumber ?: VehicleDeviceSerialNumberMother.create(),
                batteryLevel ?: VehicleBatteryLevelMother.create(),
                fuelLevel ?: VehicleFuelLevelMother.create(),
                currentMilleage ?: VehicleCurrentMilleageMother.create()
            )
        }

        fun create(chassisNumber: VehicleChassisNumber): Vehicle {
            return create(null, chassisNumber)
        }
    }
}