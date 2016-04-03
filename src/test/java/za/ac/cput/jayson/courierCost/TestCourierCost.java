package za.ac.cput.jayson.courierCost;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.jayson.factories.courierCost.CourierCostBuilder;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class TestCourierCost {
    @Test
    public void testCourierCost()throws Exception
    {
        CourierCostBuilder courierCostBuilder = new CourierCostBuilder.Builder()
                .totalCost(20, 20, 20)
                .build();

        Assert.assertEquals(courierCostBuilder.getTotalCost(), 60.0);
    }
}
