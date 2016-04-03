package za.ac.cput.jayson.customer;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.jayson.domain.customer.Customer;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class TestCustomer {
    @Test
    public void testCustomer()throws Exception
    {
        Customer customer = new Customer();
        customer.setName("Jayson");

        Assert.assertEquals(customer.getName(), "Jayson");
    }
}
