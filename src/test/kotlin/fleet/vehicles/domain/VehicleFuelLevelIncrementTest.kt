package fleet.vehicles.domain

import shared.domain.mothers.IntegerMother
import fleet.vehicles.domain.mothers.VehicleMother
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class VehicleFuelLevelIncrementTest {
    @Test
    fun it_should_accept_a_positive_value() {
        val positiveValue = IntegerMother.createPositive(true)
        val vehicle = VehicleMother.create()

        vehicle.incrementFuelLevelBy(VehicleFuelLevel(positiveValue))
    }

    @Test
    fun it_should_throw_an_exception_for_negative_values() {
        val negativeValue = IntegerMother.createNegative()
        val vehicle = VehicleMother.create()

        assertThrows<VehicleFuelLevelIllegalArgumentException> {
            vehicle.incrementFuelLevelBy(VehicleFuelLevel(negativeValue))
        }
    }

    @Test
    fun it_should_sum_the_old_and_the_new_values() {
        val oldFuelLevel = VehicleFuelLevel(IntegerMother.createPositive(true))
        val fuelLevelIncrement = VehicleFuelLevel(IntegerMother.createPositive(false))
        val totalFuelLevel = oldFuelLevel.getValue() + fuelLevelIncrement.getValue()

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

        vehicle.incrementFuelLevelBy(fuelLevelIncrement)

        assertEquals(totalFuelLevel, vehicle.getFuelLevel().getValue())
    }
}