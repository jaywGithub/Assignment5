package za.ac.cput.jayson.courierPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.jayson.factories.courierPackage.CourierPackageBuilder;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class TestCourierPackage {
    @Test
            public void testCourierPackage()throws Exception {
        CourierPackageBuilder courierPackageBuilder = new CourierPackageBuilder.Builder()
                .packageDescription("Clothes")
                .packageRecieverName("Susan")
                .packageReceiverContact("021 123 4567")
                .build();

        Assert.assertEquals(courierPackageBuilder.getPackageDescription(), "Clothes");
    }

}
