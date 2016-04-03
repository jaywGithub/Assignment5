package za.ac.cput.jayson.factories.destination;

import za.ac.cput.jayson.domain.customer.Customer;
import za.ac.cput.jayson.domain.destination.Destination;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class Singleton_DestinationFactory {

    private static Destination firstInstance = null;

    private Singleton_DestinationFactory(){}

    public static Destination getInstance()
    {
        if(firstInstance == null)
        {
            firstInstance = new Destination();
        }

        return firstInstance;
    }
}
