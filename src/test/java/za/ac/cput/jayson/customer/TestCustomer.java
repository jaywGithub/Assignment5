package za.ac.cput.jayson.customer;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import za.ac.cput.jayson.domain.customer.Customer;
import za.ac.cput.jayson.factories.customer.Singleton_CustomerFactory;

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
