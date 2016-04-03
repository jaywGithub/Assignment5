package za.ac.cput.jayson.transport;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.jayson.factories.transport.TransportFactory;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class TestTransport {
    @Test
    public void testTransport()throws Exception
    {
        String transportMedium = TransportFactory.getTransport("R");

        Assert.assertEquals(transportMedium, "Regular");
    }
}
