package fleet.vehicles.domain

import shared.domain.mothers.IntegerMother
import fleet.vehicles.domain.mothers.VehicleMother
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

internal class VehicleFuelLevelDecrementTest {
    @Test
    fun it_should_accept_positive_final_values() {
        val fuelIncrement = 50
        val vehicle = VehicleMother.create(
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            VehicleFuelLevel(100)
        )

        vehicle.decrementFuelLevelBy(VehicleFuelLevel(fuelIncrement))
    }

    @Test
    fun it_should_throw_an_exception_for_negative_final_values() {
        val fuelIncrement = IntegerMother.createPositive()
        val vehicle = VehicleMother.create(
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            VehicleFuelLevel(fuelIncrement - 1)
        )

        assertFailsWith<VehicleFuelLevelIllegalArgumentException> {
            vehicle.decrementFuelLevelBy(VehicleFuelLevel(fuelIncrement))
        }
    }

    @Test
    fun it_should_throw_an_exception_for_negative_values() {
        val negativeValue = IntegerMother.createNegative()
        val vehicle = VehicleMother.create()

        assertFailsWith<VehicleFuelLevelIllegalArgumentException> {
            vehicle.decrementFuelLevelBy(VehicleFuelLevel(negativeValue))
        }
    }

    @Test
    fun it_should_subtract_the_new_value_on_the_old_value() {
        val oldFuelLevel = VehicleFuelLevel(100)
        val fuelLevelDecrement = VehicleFuelLevel(50)
        val totalFuelLevel = oldFuelLevel.getValue() - fuelLevelDecrement.getValue()

        val vehicle = VehicleMother.create(
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            oldFuelLevel
        )

        vehicle.decrementFuelLevelBy(fuelLevelDecrement)

        assertEquals(totalFuelLevel, vehicle.getFuelLevel().getValue())
    }
}