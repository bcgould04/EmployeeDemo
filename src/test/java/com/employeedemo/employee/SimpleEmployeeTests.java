package com.employeedemo.employee;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class SimpleEmployeeTests {

    @Test
    public void testSetterAndGettersReturnsProperly() throws NoSuchFieldException, IllegalAccessException {
        Date testDate = new Date();
        SimpleEmployee employee = new SimpleEmployee();

        employee.setName("Patty O’Furniture");
        employee.setId(13);
        employee.setDateHired(testDate);
        employee.setPartTimeFlag(false);
        employee.setManagerFlag(false);

        assertEquals("Patty O’Furniture", employee.getName());
        assertEquals(13, employee.getId());
        assertFalse(employee.isPartTimeFlag());
        assertFalse(employee.isManagerFlag());
        assertEquals(testDate, employee.getDateHired());
    }
}
