package fleet.vehicles.domain

import shared.domain.agregate.AggregateRoot

data class Vehicle(
    private val id: VehicleId,
    private val chassisNumber: VehicleChassisNumber,
    private val licensePlate: VehicleLicensePlate,
    private val brandString: VehicleBrandString,
    private val categoryString: VehicleCategoryString,
    private val infleetDate: VehicleInfleetDate,
    private var deviceSerialNumber: VehicleDeviceSerialNumber? = null,
    private var batteryLevel: VehicleBatteryLevel = VehicleBatteryLevel(0),
    private var fuelLevel: VehicleFuelLevel = VehicleFuelLevel(0),
    private var currentMileage: VehicleMileage = VehicleMileage(0)
) : AggregateRoot() {
    companion object {
        fun create(
            id: VehicleId,
            chassisNumber: VehicleChassisNumber,
            licensePlate: VehicleLicensePlate,
            brandString: VehicleBrandString,
            categoryString: VehicleCategoryString,
            infleetDate: VehicleInfleetDate,
            deviceSerialNumber: VehicleDeviceSerialNumber?,
            batteryLevel: VehicleBatteryLevel,
            fuelLevel: VehicleFuelLevel,
            mileage: VehicleMileage
        ): Vehicle {
            return Vehicle(
                id,
                chassisNumber,
                licensePlate,
                brandString,
                categoryString,
                infleetDate,
                deviceSerialNumber,
                batteryLevel,
                fuelLevel,
                mileage
            );
        }
    }

    fun updateBatteryLevel(value: VehicleBatteryLevel) {
        this.batteryLevel = value
    }

    fun incrementFuelLevelBy(level: VehicleFuelLevel) {
        val previousFuelLevel = this.fuelLevel
        val newFuelLevel = previousFuelLevel.getValue() + level.getValue()
        this.fuelLevel = VehicleFuelLevel(newFuelLevel)
    }

    fun decrementFuelLevelBy(level: VehicleFuelLevel) {
        val previousFuelLevel = this.fuelLevel
        val newFuelLevel = previousFuelLevel.getValue() - level.getValue()
        this.fuelLevel = VehicleFuelLevel(newFuelLevel)
    }

    fun updateCurrentMileage(mileage: VehicleMileage) {
        this.currentMileage = mileage
    }

    fun updateDeviceSerialNumber(serialNumber: VehicleDeviceSerialNumber) {
        this.deviceSerialNumber = serialNumber
    }

    fun getId(): VehicleId {
        return this.id
    }

    fun getChassisNumber(): VehicleChassisNumber {
        return this.chassisNumber;
    }

    fun getLicensePlate(): VehicleLicensePlate {
        return this.licensePlate;
    }

    fun getBrandString(): VehicleBrandString {
        return this.brandString;
    }

    fun getCategoryString(): VehicleCategoryString {
        return this.categoryString;
    }

    fun getInfleetDate(): VehicleInfleetDate {
        return this.infleetDate;
    }

    fun getDeviceSerialNumber(): VehicleDeviceSerialNumber? {
        return this.deviceSerialNumber;
    }

    fun getBatteryLevel(): VehicleBatteryLevel {
        return this.batteryLevel;
    }

    fun getFuelLevel(): VehicleFuelLevel {
        return this.fuelLevel;
    }

    fun getCurrentMileage(): VehicleMileage {
        return this.currentMileage;
    }
}