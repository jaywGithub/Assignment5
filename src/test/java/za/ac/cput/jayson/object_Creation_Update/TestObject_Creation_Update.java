package za.ac.cput.jayson.object_Creation_Update;

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
public class TestObject_Creation_Update {

    //DistanceCost Object test

    @Test
    public void testDistanceCostObject()throws Exception
    {
        DistanceCost distanceCost = new DistanceCost();
        distanceCost.setDistance(25);

        Assert.assertNotNull(distanceCost);
    }

    @Test
    public void testDistanceCostUpdate()throws Exception
    {
        DistanceCost distanceCost = new DistanceCost();
        distanceCost.setDistance(25);

        Assert.assertEquals(distanceCost.getDistance(), 25.0);

        distanceCost.setDistance(50);

        Assert.assertEquals(distanceCost.getDistance(), 50.0);
    }

    //SizeCost Object test

    @Test
    public void testSizeCostObject()throws Exception
    {
        SizeCost sizeCost = new SizeCost();

        Assert.assertNotNull(sizeCost);
    }

    //TransportCost Object test

    @Test
    public void testTransportObject()throws Exception
    {
        TransportCost transportCost = new TransportCost();
        transportCost.setTransportType("Regular");

        Assert.assertEquals(transportCost.getTransportType(), "Regular");
    }

    @Test
    public void testTransportUpdate()throws Exception
    {
        TransportCost transportCost = new TransportCost();
        transportCost.setTransportType("Regular");

        Assert.assertEquals(transportCost.getTransportType(), "Regular");

        transportCost.setTransportType("Express1");

        Assert.assertEquals(transportCost.getTransportType(), "Express1");
    }

    //PackageSize Object test

    @Test
    public void testPackageSizeObject()throws Exception
    {
        PackageSize packageSize = new PackageSize();
        packageSize.setExtraSmall("xSmall");

        Assert.assertEquals(packageSize.getExtraSmall(), "extraSmallEnvelope");
    }

    @Test
    public void testPackageSizeUpdate()throws Exception
    {
        PackageSize packageSize = new PackageSize();
        packageSize.setExtraSmall("xSmall");

        Assert.assertEquals(packageSize.getExtraSmall(), "extraSmallEnvelope");

        packageSize.setSmall("small");

        Assert.assertEquals(packageSize.getSmall(), "smallEnvelope");
    }

    //PackageType Object test

    @Test
    public void testPackageTypeObject()throws Exception
    {
        PackageType packageType = new PackageType();
        packageType.setType("Box");

        Assert.assertEquals(packageType.getType(), "Box");
    }

    @Test
    public void testPackageTypeUpdate()throws Exception
    {
        PackageType packageType = new PackageType();
        packageType.setType("Box");

        Assert.assertEquals(packageType.getType(), "Box");

        packageType.setType("Envelope");

        Assert.assertEquals(packageType.getType(), "Envelope");
    }

    //Customer Object test

    @Test
    public void testCustomerObject()throws Exception
    {
        Customer customer = new Customer();
        customer.setName("Joe");

        Assert.assertEquals(customer.getName(), "Joe");
    }

    @Test
    public void testCustomerUpdate()throws Exception
    {
        Customer customer = new Customer();
        customer.setName("Joe");

        Assert.assertEquals(customer.getName(), "Joe");

        customer.setName("Adam");

        Assert.assertEquals(customer.getName(), "Adam");
    }

    //Destination Object test

    @Test
    public void testDestinationObject()throws Exception
    {
        Destination destination = new Destination();
        destination.setAreaName("Kimberley");

        Assert.assertEquals(destination.getAreaName(), "Kimberley");
    }

    @Test
    public void testDestinationUpdate()throws Exception
    {
        Destination destination = new Destination();
        destination.setAreaName("Kimberley");

        Assert.assertEquals(destination.getAreaName(), "Kimberley");

        destination.setAreaName("Durban");

        Assert.assertEquals(destination.getAreaName(), "Durban");
    }

    //Express1 Driver Object test

    @Test
    public void testExpress1DriverObject()throws Exception
    {
        Express1Driver express1Driver = new Express1Driver();
        express1Driver.setName("George");

        Assert.assertEquals(express1Driver.getName(), "George");
    }

    @Test
    public void testExpress1DriverUpdate()throws Exception
    {
        Express1Driver express1Driver = new Express1Driver();
        express1Driver.setName("George");

        Assert.assertEquals(express1Driver.getName(), "George");

        express1Driver.setName("Costanza");

        Assert.assertEquals(express1Driver.getName(), "Costanza");
    }

    //Express2 Driver Object test

    @Test
    public void testExpress2DriverObject()throws Exception
    {
        Express2Driver express2Driver = new Express2Driver();
        express2Driver.setName("Jerry");

        Assert.assertEquals(express2Driver.getName(), "Jerry");
    }

    @Test
    public void testExpress2DriverUpdate()throws Exception
    {
        Express2Driver express2Driver = new Express2Driver();
        express2Driver.setName("Jerry");

        Assert.assertEquals(express2Driver.getName(), "Jerry");

        express2Driver.setName("Seinfeld");

        Assert.assertEquals(express2Driver.getName(), "Seinfeld");
    }

    //Regular Driver Object test

    @Test
    public void testRegularDriverObject()throws Exception
    {
        RegularDriver regularDriver = new RegularDriver();
        regularDriver.setName("Cosmo");

        Assert.assertEquals(regularDriver.getName(), "Cosmo");
    }

    @Test
    public void testRegularDriverUpdate()throws Exception
    {
        RegularDriver regularDriver = new RegularDriver();
        regularDriver.setName("Cosmo");

        Assert.assertEquals(regularDriver.getName(), "Cosmo");

        regularDriver.setName("Kramer");

        Assert.assertEquals(regularDriver.getName(), "Kramer");
    }

    //Express1 Transport Object test

    @Test
    public void testExpress1Object()throws Exception
    {
        Express1 express1 = new Express1();

        Assert.assertNotNull(express1);
    }

    //Express2 Transport Object test

    @Test
    public void testExpress2Object()throws Exception
    {
        Express2 express2 = new Express2();

        Assert.assertNotNull(express2);
    }

    //Regular Transport Object test

    @Test
    public void testRegularObject()throws Exception
    {
        Regular regular = new Regular();

        Assert.assertNotNull(regular);
    }
}
