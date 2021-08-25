package com.employeedemo.employee;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PartTimeEmployeeTests {
    @Test
    public void testSetterAndGettersReturnsProperly() throws NoSuchFieldException, IllegalAccessException {
        Date testDate = new Date();
        PartTimeEmployee partTimer = new PartTimeEmployee();

        partTimer.setName("Patty O’Furniture");
        partTimer.setId(13);
        partTimer.setDateHired(testDate);
        partTimer.setPartTimeFlag(false);

        assertEquals("Patty O’Furniture", partTimer.getName());
        assertEquals(13, partTimer.getId());
        assertTrue(partTimer.isPartTimeFlag());
        assertEquals(testDate, partTimer.getDateHired());
    }
}
