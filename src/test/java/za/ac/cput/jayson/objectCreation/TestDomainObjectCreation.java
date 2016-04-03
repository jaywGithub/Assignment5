package za.ac.cput.jayson.objectCreation;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.jayson.domain.courierCost.DistanceCost;
import za.ac.cput.jayson.domain.courierCost.SizeCost;
import za.ac.cput.jayson.domain.courierCost.TransportCost;
import za.ac.cput.jayson.domain.courierPackage.PackageSize;
import za.ac.cput.jayson.domain.courierPackage.PackageType;
import za.ac.cput.jayson.domain.customer.Customer;
import za.ac.cput.jayson.domain.destination.Destination;
import za.ac.cput.jayson.domain.employee.Express1Driver;
import za.ac.cput.jayson.domain.employee.Express2Driver;
import za.ac.cput.jayson.domain.employee.RegularDriver;
import za.ac.cput.jayson.domain.transport.Express1;
import za.ac.cput.jayson.domain.transport.Express2;
import za.ac.cput.jayson.domain.transport.Regular;

/**
 * Created by JAYSON on 2016-04-03.
 */
public class TestDomainObjectCreation {
    @Test
    public void testDistanceCostObject()throws Exception
    {
        DistanceCost distanceCost = new DistanceCost();
        distanceCost.setDistance(25);

        Assert.assertNotNull(distanceCost);
    }

    @Test
    public void testSizeCostObject()throws Exception
    {
        SizeCost sizeCost = new SizeCost();

        Assert.assertNotNull(sizeCost);
    }

    @Test
    public void testTransportObject()throws Exception
    {
        TransportCost transportCost = new TransportCost();
        transportCost.setTransportType("Regular");

        Assert.assertNotNull(transportCost);
    }

    @Test
    public void testPackageSizeObject()throws Exception
    {
        PackageSize packageSize = new PackageSize();
        packageSize.setExtraSmall("xSmall");

        Assert.assertNotNull(packageSize);
    }

    @Test
    public void testPackageTypeObject()throws Exception
    {
        PackageType packageType = new PackageType();
        packageType.setType("Box");

        Assert.assertNotNull(packageType);
    }

    @Test
    public void testCustomerObject()throws Exception
    {
        Customer customer = new Customer();
        customer.setName("Joe");

        Assert.assertNotNull(customer);
    }

    @Test
    public void testDestinationObject()throws Exception
    {
        Destination destination = new Destination();
        destination.setAreaName("Kimberley");

        Assert.assertNotNull(destination);
    }

    @Test
    public void testExpress1DriverObject()throws Exception
    {
        Express1Driver express1Driver = new Express1Driver();

        Assert.assertNotNull(express1Driver);
    }

    @Test
    public void testExpress2DriverObject()throws Exception
    {
        Express2Driver express2Driver = new Express2Driver();

        Assert.assertNotNull(express2Driver);
    }

    @Test
    public void testRegularDriverObject()throws Exception
    {
        RegularDriver regularDriver = new RegularDriver();

        Assert.assertNotNull(regularDriver);
    }

    @Test
    public void testExpress1Object()throws Exception
    {
        Express1 express1 = new Express1();

        Assert.assertNotNull(express1);
    }

    @Test
    public void testExpress2Object()throws Exception
    {
        Express2 express2 = new Express2();

        Assert.assertNotNull(express2);
    }

    @Test
    public void testRegularObject()throws Exception
    {
        Regular regular = new Regular();

        Assert.assertNotNull(regular);
    }
}
