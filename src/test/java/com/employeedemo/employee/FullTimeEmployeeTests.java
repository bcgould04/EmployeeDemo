package com.employeedemo.employee;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class FullTimeEmployeeTests {
    @Test
    public void testSetterAndGettersReturnsProperly() throws NoSuchFieldException, IllegalAccessException {
        Date testDate = new Date();
        FullTimeEmployee fullTimer = new FullTimeEmployee();

        fullTimer.setName("Patty O’Furniture");
        fullTimer.setId(13);
        fullTimer.setDateHired(testDate);
        fullTimer.setPartTimeFlag(true);

        assertEquals("Patty O’Furniture", fullTimer.getName());
        assertEquals(13, fullTimer.getId());
        assertFalse(fullTimer.isPartTimeFlag());
        assertEquals(testDate, fullTimer.getDateHired());
    }
}
