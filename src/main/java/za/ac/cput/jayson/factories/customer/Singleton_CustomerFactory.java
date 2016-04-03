package za.ac.cput.jayson.factories.customer;

import za.ac.cput.jayson.domain.customer.Customer;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class Singleton_CustomerFactory {

    private static Customer firstInstance = null;

    private Singleton_CustomerFactory(){}

    public static Customer getInstance()
    {
        if(firstInstance == null)
        {
            firstInstance = new Customer();
        }

        return firstInstance;
    }
}
