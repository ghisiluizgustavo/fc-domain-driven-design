package me.ghisiluizgustavo.fcdomaindrivendesign;

import me.ghisiluizgustavo.fcdomaindrivendesign.entity.Address;
import me.ghisiluizgustavo.fcdomaindrivendesign.entity.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    void shouldThrownErrorWhenIdIsEmpty(){
        IllegalArgumentException ex =
                assertThrows(IllegalArgumentException.class, () -> new Customer("", "John"));

        assertEquals("Id is required", ex.getMessage());
    }

    @Test
    void shouldThrownErrorWhenNameIsEmpty(){
        IllegalArgumentException ex =
                assertThrows(IllegalArgumentException.class, () -> new Customer("1", ""));

        assertEquals("Name is required", ex.getMessage());
    }

    @Test
    void shouldChangeName(){
        var customer = new Customer("1", "John");

        customer.changeName("Jane");

        assertEquals("Jane", customer.getName());
    }

    @Test
    void shouldActivateCustomer(){
        var customer = new Customer("1", "John");
        var address = new Address("Street 1", 123, "12345-123", "Santa Catarina");
        customer.setAddress(address);

        customer.activate();

        assertTrue(customer.isActive());
    }

    @Test
    void shouldDeactivateCustomer(){
        var customer = new Customer("1", "John");

        customer.deactivate();

        assertFalse(customer.isActive());
    }

    @Test
    void shouldThrownErrorWhenAddressIsNull(){
        var customer = new Customer("1", "John");

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, customer::activate);

        assertEquals("Address is mandatory to activate a customer", ex.getMessage());
    }

}
