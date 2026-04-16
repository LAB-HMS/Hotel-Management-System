package com.hotel;

import com.hotel.models.Service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArchitectureTest {

    @Test
    public void testServiceAbstaction() {
        // This ensures the student hasn't deleted the interface 
        // which is vital for the Open-Closed Principle.
        try {
            Class<?> serviceClass = Class.forName("com.hotel.models.Service");
            assertTrue(serviceClass.isInterface(), "Service must remain an interface.");
        } catch (ClassNotFoundException e) {
            fail("Core interface 'Service' is missing!");
        }
    }
}

