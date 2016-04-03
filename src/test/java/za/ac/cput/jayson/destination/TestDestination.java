package za.ac.cput.jayson.destination;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.jayson.domain.destination.Destination;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class TestDestination {
    @Test
    public void testDestination()throws Exception
    {
        Destination destination = new Destination();
        destination.setAreaName("Kimberley");

        Assert.assertEquals(destination.getAreaName(), "Kimberley");
    }
}
