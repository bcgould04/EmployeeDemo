package com.employeedemo.employee;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTests {
    @Test
    public void testSetterAndGettersReturnsProperly() throws NoSuchFieldException, IllegalAccessException {
        Date testDate = new Date();
        Manager manager = new Manager();

        manager.setName("Patty O’Furniture");
        manager.setId(13);
        manager.setDateHired(testDate);
        manager.setPartTimeFlag(false);

        assertEquals("Patty O’Furniture", manager.getName());
        assertEquals(13, manager.getId());
        assertFalse(manager.isPartTimeFlag());
        assertTrue(manager.isManagerFlag());
        assertEquals(testDate, manager.getDateHired());
    }
}
